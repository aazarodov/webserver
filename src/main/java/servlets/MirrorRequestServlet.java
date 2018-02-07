package servlets;

import templater.PageGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by aazar on 07.02.2018.
 */
public class MirrorRequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value = req.getParameter("key");
        resp.getWriter().println(value);
        resp.setContentType("text/html;charset=utf-8");
        resp.setStatus(HttpServletResponse.SC_OK);
    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Map<String, Object> pageVariables = getPageVariablesMap(req);
//        String message = req.getParameter("message");
//        resp.setContentType("text/html;charset=utf-8");
//        if (message == null || message.isEmpty())
//            resp.setStatus(HttpServletResponse.SC_FORBIDDEN);
//        else
//            resp.setStatus(HttpServletResponse.SC_OK);
//        pageVariables.put("message", message == null ? "" : message);
//        resp.getWriter().println(PageGenerator.instance().getPage("page.html", pageVariables));
//    }
}
