/**
 * 
 */
package caf.war.SalesDepartment.newapprovaltaskoverview;

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

@ManagedBean(name = "NewApprovalTaskOverviewDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "NewApprovalTaskOverview/default", beanType = BeanType.PAGE)
public class NewApprovalTaskOverviewDefaultviewView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{NewApprovalTaskOverview.taskID}" }, };
	private transient caf.war.SalesDepartment.newapprovaltaskoverview.NewApprovalTaskOverview newApprovalTaskOverview = null;
	private caf.war.SalesDepartment.taskclient.NewApprovalTask newApprovalTask = null;
	private static final String[][] NEWAPPROVALTASK_PROPERTY_BINDINGS = new String[][] {
		{"#{NewApprovalTask.taskID}", "#{NewApprovalTaskOverview.taskID}"},
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

	public caf.war.SalesDepartment.newapprovaltaskoverview.NewApprovalTaskOverview getNewApprovalTaskOverview()  {
		if (newApprovalTaskOverview == null) {
		    newApprovalTaskOverview = (caf.war.SalesDepartment.newapprovaltaskoverview.NewApprovalTaskOverview)resolveExpression("#{NewApprovalTaskOverview}");
		}
		return newApprovalTaskOverview;
	}

	public caf.war.SalesDepartment.taskclient.NewApprovalTask getNewApprovalTask()  {
		if (newApprovalTask == null) {
		    newApprovalTask = (caf.war.SalesDepartment.taskclient.NewApprovalTask)resolveExpression("#{NewApprovalTask}");
		}
	
	    resolveDataBinding(NEWAPPROVALTASK_PROPERTY_BINDINGS, newApprovalTask, "newApprovalTask", false, false);
		return newApprovalTask;
	}

}