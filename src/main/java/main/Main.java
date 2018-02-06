package main;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Created by zarodov on 01.02.2018.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        //Frontend frontend = new Frontend();
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        Server server = new Server(8080);
        server.setHandler(context);
        //context.addServlet(new ServletHolder(frontend), "/*");

        server.start();
        server.join();
    }
}
