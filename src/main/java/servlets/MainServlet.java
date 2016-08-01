package servlets;

import models.RequestModel;
import org.apache.log4j.Logger;
import utils.ExpressionParser;
import utils.LoginValidation;
import utils.RequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class MainServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(MainServlet.class);
    private RequestHandler rh;
    @Override
    public void init(){
        rh = new RequestHandler();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        String path = req.getServletPath();
        String action = req.getServletPath();

        if (action.equalsIgnoreCase("/logout")) {
            HttpSession session = req.getSession();
            String username = session.getAttribute("user").toString();
            Cookie cookie = new Cookie(String.valueOf(username.hashCode()), session.getAttribute("exp").toString());
            cookie.setMaxAge(3*60);
            resp.addCookie(cookie);
            session.setMaxInactiveInterval(0);
            session.invalidate();

            logger.info("User " + username + " logged out");
            resp.sendRedirect("login.jsp");
        }
        else if (action.equalsIgnoreCase("/addNumber")) {
            HttpSession session = req.getSession();

            if(session.getAttribute("exp").equals("ДУРАК ЧО ТВАРИШ КТО ТАК ДЕЛАЕТ ВООБЩЕ?\n" +
                    "ТЫ ЧО ПЬЯНЫЙ ПО 2 ЗНАКА НАФИГАЧИВАТЬ?"))
                session.setAttribute("exp", rh.getOld());
            resp.sendRedirect("addNumber.jsp");
        }
        else if (action.equalsIgnoreCase("/result")) {
            ExpressionParser parser = new ExpressionParser();
            String result = parser.parseTheExpression(req.getSession(false).getAttribute("exp").toString());
            req.setAttribute("result", result);
            req.getRequestDispatcher("result.jsp").forward(req, resp);
            resp.sendRedirect("result.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getServletPath();
        logger.info("Action : "+action);

        if (action.equalsIgnoreCase("/login")) {

            String log = req.getParameter("login");
            String pass = req.getParameter("password");
            boolean enter = LoginValidation.logIn(log, pass);

            logger.info("trying to log User = " + log + " Password = " + pass + " Check = " + enter);

            if (enter) {

                HttpSession session = req.getSession();

                session.setAttribute("user", log);
                session.setMaxInactiveInterval(3 * 60);
                session.setAttribute("exp", "");
                Cookie cookies[] = req.getCookies();
                logger.error("Cookies" + cookies != null);
                if (cookies != null) {
                    for (Cookie cooky : cookies) {
                        if (cooky.getName().equals(String.valueOf(log.hashCode()))) {
                            session.setAttribute("exp", cooky.getValue());
                        }
                    }
                }

                resp.sendRedirect("index.jsp");

            } else {

                resp.sendRedirect("login.jsp");
            }
        }else if(action.equalsIgnoreCase("/clear")){
            HttpSession session = req.getSession();
            session.setAttribute("exp", "");
            resp.sendRedirect("index.jsp");
        }else{
            HttpSession session = req.getSession(true);
            String exp = rh.getExp(new RequestModel(session, req, resp));
            session.setAttribute("exp", exp);

            if(rh.getCharIsLast()) {
                resp.sendRedirect("addCharacter.jsp");
            }else{
                resp.sendRedirect("addNumber.jsp");
            }
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
