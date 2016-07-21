package filters;
import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class CustomFilter implements Filter {

    private static final Logger logger = Logger.getLogger(CustomFilter.class);

    public void init(FilterConfig filterConfig) throws ServletException {
        //Cheto tut delayetsya
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession(false);
        String loginURI = request.getContextPath() + "/login.jsp";

        boolean loggedIn = session != null && session.getAttribute("user") != null;
        boolean loginRequest = request.getServletPath().equalsIgnoreCase("/login");
        boolean logURL = request.getRequestURI().equals(loginURI);

        logger.error("loggedIN = " +loggedIn+ "loginRequest = "+loginRequest+" logURL = "+ logURL);

        if (logURL||loggedIn||loginRequest) {
            filterChain.doFilter(request, response);
        } else {
            response.sendRedirect(loginURI);
        }
    }

    public void destroy() {

    }
}
