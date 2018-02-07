package main;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.AllRequestsServlet;
import servlets.MirrorRequestServlet;

/**
 * Created by zarodov on 01.02.2018.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        AllRequestsServlet allRequestsServlet = new AllRequestsServlet();
        MirrorRequestServlet mirror = new MirrorRequestServlet();

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(new ServletHolder(allRequestsServlet), "/*");
        context.addServlet(new ServletHolder(mirror), "/mirror");

        Server server = new Server(8080);
        server.setHandler(context);

        server.start();
        //java.util.logging.Logger.getGlobal().info("Server started");
        System.out.println("Server started");
        server.join();
    }
}
