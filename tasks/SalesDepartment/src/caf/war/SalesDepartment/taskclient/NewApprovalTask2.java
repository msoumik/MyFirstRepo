package caf.war.SalesDepartment.taskclient;

 

import com.webmethods.caf.faces.data.task.ITaskData;
import com.webmethods.caf.faces.data.ContentProviderException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;
 
/**
 * Task Client bean for 'NewApprovalTask' task.
 */ 
@ManagedBean(name = "NewApprovalTask2")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class NewApprovalTask2 extends com.webmethods.caf.faces.data.task.impl.TaskContentProviderExtended {

	private static final long serialVersionUID = 7411437206269842432L;
	
	/**
	 * Globally unique task type id
	 */
	private static final String TASK_TYPE_ID = "A2A77049-B601-04EF-ED0B-3FE517542A34";

	/**
	 * Default constructor
	 */
	public NewApprovalTask2() {
		super();
		setTaskTypeID(TASK_TYPE_ID);
	}
	
	/**
	 * Task Data Object
	 */
	public static class TaskData extends com.webmethods.caf.faces.data.task.impl.TaskData {

		private static final long serialVersionUID = 8353060744994990080L;
		 
			
		public static String[][] FIELD_NAMES = new String[][] {{"approvalState", "approvalState"},
		};


		private java.lang.String approvalState;


		public static final String[] INPUTS = new String[] {"approvalState", };


		public static final String[] OUTPUTS = new String[] {};
 
		public TaskData() {
		}

		public java.lang.String getApprovalState()  {
			
			return approvalState;
		}

		public void setApprovalState(java.lang.String approvalState)  {
			this.approvalState = approvalState;
		}
		
		
		
	}
	
	/**
	 * Return current task data object
	 * @return current task data
	 */
	public TaskData getTaskData() {
		return (TaskData)getValue(PROPERTY_KEY_TASKDATA);
	}

	/**
	 * Creates new task data object
	 * @return newly created task data object
	 */	
	protected ITaskData newTaskData() throws ContentProviderException {
		return new TaskData();
	}

}