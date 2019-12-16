package caf.war.SalesDepartment.taskclient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "NewApprovalTaskRuleContext")
@SessionScoped
@DTManagedBean(displayName = "New Approval Task Rule Context", beanType = BeanType.DEFAULT)
public class NewApprovalTaskRuleContext  extends  com.webmethods.caf.faces.data.task.impl.BaseTaskRuleContext {
}