package utils;

import models.RequestModel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class RequestHandler {

    private boolean charIsLast = true;

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
        if(charIsLast){
            if(containsC){
                return "";
            }else{
                charIsLast = false;
                return prev+ch;
            }
        }else{
            return prev+ch;
        }
    }

    public boolean getCharIsLast(){
        return charIsLast;
    }

}
