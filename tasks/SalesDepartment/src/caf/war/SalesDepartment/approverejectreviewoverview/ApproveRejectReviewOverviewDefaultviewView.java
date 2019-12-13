/**
 * 
 */
package caf.war.SalesDepartment.approverejectreviewoverview;

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

@ManagedBean(name = "ApproveRejectReviewOverviewDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "ApproveRejectReviewOverview/default", beanType = BeanType.PAGE)
public class ApproveRejectReviewOverviewDefaultviewView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{ApproveRejectReviewOverview.taskID}" }, };
	private transient caf.war.SalesDepartment.approverejectreviewoverview.ApproveRejectReviewOverview approveRejectReviewOverview = null;
	private caf.war.SalesDepartment.taskclient.ApproveRejectReview approveRejectReview = null;
	private static final String[][] APPROVEREJECTREVIEW_PROPERTY_BINDINGS = new String[][] {
		{"#{ApproveRejectReview.taskID}", "#{ApproveRejectReviewOverview.taskID}"},
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

	public caf.war.SalesDepartment.approverejectreviewoverview.ApproveRejectReviewOverview getApproveRejectReviewOverview()  {
		if (approveRejectReviewOverview == null) {
		    approveRejectReviewOverview = (caf.war.SalesDepartment.approverejectreviewoverview.ApproveRejectReviewOverview)resolveExpression("#{ApproveRejectReviewOverview}");
		}
		return approveRejectReviewOverview;
	}

	public caf.war.SalesDepartment.taskclient.ApproveRejectReview getApproveRejectReview()  {
		if (approveRejectReview == null) {
		    approveRejectReview = (caf.war.SalesDepartment.taskclient.ApproveRejectReview)resolveExpression("#{ApproveRejectReview}");
		}
	
	    resolveDataBinding(APPROVEREJECTREVIEW_PROPERTY_BINDINGS, approveRejectReview, "approveRejectReview", false, false);
		return approveRejectReview;
	}

}