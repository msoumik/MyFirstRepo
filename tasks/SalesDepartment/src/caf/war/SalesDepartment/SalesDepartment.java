/**
 * 
 */
package caf.war.SalesDepartment;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author SOMU
 *
 */
@ManagedBean(name = "SalesDepartment")
@ApplicationScoped
@DTManagedBean(displayName = "SalesDepartment", beanType = BeanType.APPLICATION)
public class SalesDepartment extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public SalesDepartment()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "SalesDepartment" );
	}
}