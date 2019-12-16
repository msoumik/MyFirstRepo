package caf.war.SalesDepartment.taskclient;

 

import com.webmethods.caf.faces.data.task.ITaskData;
import com.webmethods.caf.faces.data.ContentProviderException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;
 
/**
 * Task Client bean for 'New Approval Task' task.
 */ 
@ManagedBean(name = "NewApprovalTask")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class NewApprovalTask extends com.webmethods.caf.faces.data.task.impl.TaskContentProviderExtended {

	private static final long serialVersionUID = 4005076366091067392L;
	
	/**
	 * Globally unique task type id
	 */
	private static final String TASK_TYPE_ID = "8CC7382A-469E-DE40-5AF1-4B32716C07CC";

	/**
	 * Default constructor
	 */
	public NewApprovalTask() {
		super();
		setTaskTypeID(TASK_TYPE_ID);
	}
	
	/**
	 * Task Data Object
	 */
	public static class TaskData extends com.webmethods.caf.faces.data.task.impl.TaskData {

		private static final long serialVersionUID = 5581001133964480512L;
		 
			
		public static String[][] FIELD_NAMES = new String[][] {{"field", "Field"},
		};


		private java.lang.String field;


		public static final String[] INPUTS = new String[] {"field", };


		public static final String[] OUTPUTS = new String[] {"field", };
 
		public TaskData() {
		}

		public java.lang.String getField()  {
			
			return field;
		}

		public void setField(java.lang.String field)  {
			this.field = field;
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