package utils;

import models.RequestModel;
import org.apache.log4j.Logger;

public class RequestHandler {

    private boolean charIsLast = true;
    private static final Logger logger = Logger.getLogger(RequestHandler.class);

    public RequestModel handleTheRequest(RequestModel requestModel){
        String action = requestModel.getRequest().getServletPath();
        requestModel.getSession().setAttribute("exp", requestModel.getSession().getAttribute("exp")+action);

        return requestModel;
    }

    public String getExp(RequestModel rm){
        String prev = rm.getSession().getAttribute("exp").toString();
        String path = rm.getRequest().getServletPath();
        String ch = path.substring(path.indexOf('/') + 2, path.length());
        boolean containsC = path.contains("c");
        logger.info("Request contains c :::::::" + containsC);
        logger.info("Char is Last :::::::" + charIsLast);
        if(charIsLast){
            if(containsC){

                return "ДУРАК ЧО ТВАРИШ КТО ТАК ДЕЛАЕТ ВООБЩЕ?\n" +
                        "ТЫ ЧО ПЬЯНЫЙ ПО 2 ЗНАКА НАФИГАЧИВАТЬ?";
            }else{
                charIsLast = false;
                return prev+ch;
            }
        }else{

            if(containsC)charIsLast=true;

            return prev+ch;
        }
    }

    public boolean getCharIsLast(){
        return charIsLast;
    }

}
