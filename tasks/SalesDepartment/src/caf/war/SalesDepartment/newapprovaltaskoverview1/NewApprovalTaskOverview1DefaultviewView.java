/**
 * 
 */
package caf.war.SalesDepartment.newapprovaltaskoverview1;

/**
 * @author SOMU
 *
 */

import com.webmethods.caf.faces.data.task.TaskDisplayProvider;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "NewApprovalTaskOverview1DefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "NewApprovalTaskOverview1/default", beanType = BeanType.PAGE)
public class NewApprovalTaskOverview1DefaultviewView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{NewApprovalTaskOverview1.taskID}" }, };
	private transient caf.war.SalesDepartment.newapprovaltaskoverview1.NewApprovalTaskOverview1 newApprovalTaskOverview1 = null;
	private caf.war.SalesDepartment.taskclient.NewApprovalTask2 newApprovalTask2 = null;
	private static final String[][] NEWAPPROVALTASK2_PROPERTY_BINDINGS = new String[][] {
		{"#{NewApprovalTask2.taskID}", "#{NewApprovalTaskOverview1.taskID}"},
	};

	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;	
	}

	/*
	 * Get the Task Display Provider for the current taskID
	 */
	public TaskDisplayProvider getTaskDisplayProvider() {
		if (taskDisplayProvider == null) {
			taskDisplayProvider = (TaskDisplayProvider) resolveExpression("#{TaskDisplayProvider}");
		}
		resolveDataBinding(TASKDISPLAYPROVIDER_PROPERTY_BINDINGS,
				taskDisplayProvider, "taskDisplayProvider", false, false);
		return taskDisplayProvider;
	}

	public caf.war.SalesDepartment.newapprovaltaskoverview1.NewApprovalTaskOverview1 getNewApprovalTaskOverview1()  {
		if (newApprovalTaskOverview1 == null) {
		    newApprovalTaskOverview1 = (caf.war.SalesDepartment.newapprovaltaskoverview1.NewApprovalTaskOverview1)resolveExpression("#{NewApprovalTaskOverview1}");
		}
		return newApprovalTaskOverview1;
	}

	public caf.war.SalesDepartment.taskclient.NewApprovalTask2 getNewApprovalTask2()  {
		if (newApprovalTask2 == null) {
		    newApprovalTask2 = (caf.war.SalesDepartment.taskclient.NewApprovalTask2)resolveExpression("#{NewApprovalTask2}");
		}
	
	    resolveDataBinding(NEWAPPROVALTASK2_PROPERTY_BINDINGS, newApprovalTask2, "newApprovalTask2", false, false);
		return newApprovalTask2;
	}

}