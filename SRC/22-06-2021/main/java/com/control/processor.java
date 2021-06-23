package com.control;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class processor
 */
@WebFilter(urlPatterns= {"/CookieServlet"},servletNames = { "CookieServlet" })
public class processor implements Filter {

    /**
     * Default constructor. 
     */
    public processor() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		String message=request.getParameter("message");
		request.setAttribute("message", "PreProcessed ->"+"message");
		
		chain.doFilter(request, response);
		HttpServletResponse hresponse=(HttpServletResponse)response;
		hresponse.getHeaderNames();
	
		
		Cookie c=new Cookie("original",message);
		c.setMaxAge(3435654);
		hresponse.addCookie(c);
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
