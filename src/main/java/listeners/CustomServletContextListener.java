package listeners;

import org.apache.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class CustomServletContextListener implements ServletContextListener {

    private static final Logger logger = Logger.getLogger(CustomServletContextListener.class);

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //TODO context listener body
        logger.info(" Context sucsessfullu initialized!");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        logger.info(" Context destroyed");
    }
}