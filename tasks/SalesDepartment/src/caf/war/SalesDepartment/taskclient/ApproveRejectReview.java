package caf.war.SalesDepartment.taskclient;

 

import com.webmethods.caf.faces.data.task.ITaskData;
import com.webmethods.caf.faces.data.ContentProviderException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;
 
/**
 * Task Client bean for 'ApproveRejectReview' task.
 */ 
@ManagedBean(name = "ApproveRejectReview")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class ApproveRejectReview extends com.webmethods.caf.faces.data.task.impl.TaskContentProviderExtended {

	private static final long serialVersionUID = 5032587744928722944L;
	
	/**
	 * Globally unique task type id
	 */
	private static final String TASK_TYPE_ID = "AB1BB3A8-7461-FFFE-4873-F274B1B2D147";

	/**
	 * Default constructor
	 */
	public ApproveRejectReview() {
		super();
		setTaskTypeID(TASK_TYPE_ID);
	}
	
	/**
	 * Task Data Object
	 */
	public static class TaskData extends com.webmethods.caf.faces.data.task.impl.TaskData {

		private static final long serialVersionUID = 8522043720776928256L;
		 
			
		public static String[][] FIELD_NAMES = new String[][] {{"totalOrderValue", "totalOrderValue"},
		};


		private java.lang.String totalOrderValue;


		public static final String[] INPUTS = new String[] {"totalOrderValue", };


		public static final String[] OUTPUTS = new String[] {};
 
		public TaskData() {
		}

		public java.lang.String getTotalOrderValue()  {
			
			return totalOrderValue;
		}

		public void setTotalOrderValue(java.lang.String totalOrderValue)  {
			this.totalOrderValue = totalOrderValue;
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