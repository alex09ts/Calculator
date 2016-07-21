package listeners;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class CustomHttpSessionListener implements HttpSessionListener {

    private static final Logger logger = Logger.getLogger(CustomHttpSessionListener.class);

    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        //TODO session listener body
        logger.info(" Session : " + httpSessionEvent.getSession().getId() +" scsessfully created");
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        logger.info(" Session : " + httpSessionEvent.getSession().getId() + " destroyed!");

    }
}
