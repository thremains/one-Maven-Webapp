package no.thremains.pro.one.interceptor;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * 权限拦截器
 * 
 * @author cf
 * 
 */
@SuppressWarnings("serial")
public class SecurityInterceptor extends MethodFilterInterceptor {
	
	private static final Logger logger = Logger.getLogger(SecurityInterceptor.class);
	
	protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
		String servletPath = ServletActionContext.getRequest().getServletPath();
		servletPath = StringUtils.substringBeforeLast(servletPath, ".");// 去掉后面的后缀 *.park *.action之类的
		
		logger.info("进入权限拦截器->访问的资源为：[" + servletPath + "]");
		
		String errMsg = "您没有访问此功能的权限！功能路径为[" + servletPath + "]请联系管理员给你赋予相应权限。";
		logger.info(errMsg);
		ServletActionContext.getRequest().setAttribute("msg", errMsg);
		return "noSecurity";
	}
}
