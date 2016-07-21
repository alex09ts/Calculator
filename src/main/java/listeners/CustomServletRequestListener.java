package listeners;
import org.apache.log4j.Logger;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class CustomServletRequestListener implements ServletRequestListener {

    private static final Logger logger = Logger.getLogger(CustomServletRequestListener.class);

    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        if(servletRequestEvent.getServletRequest().getContentType()!=null) {
            logger.info(" Reqest "
                    + servletRequestEvent.getServletRequest().getContentType()
                    + " destroyed!");
        }
    }

    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        if(servletRequestEvent.getServletRequest().getContentType()!=null) {
            logger.info(" Request "
                    + servletRequestEvent.getServletRequest().getContentType()
                    +" initialized!");
        }
    }
}
