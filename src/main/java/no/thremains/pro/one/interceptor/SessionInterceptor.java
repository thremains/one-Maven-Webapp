package no.thremains.pro.one.interceptor;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * session拦截器
 * 
 * @author cf
 * 
 */
public class SessionInterceptor extends MethodFilterInterceptor {
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(SessionInterceptor.class);
	
	protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
		
		logger.info("进入session拦截器->访问路径为[" + ServletActionContext.getRequest().getServletPath() + "]");
		
		return actionInvocation.invoke();
	}
}
