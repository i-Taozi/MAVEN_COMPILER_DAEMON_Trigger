/** Copyright Payara Services Limited **/
package org.javaee7.servlet.security.clientcert;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Arjan Tijms
 */
@WebServlet(urlPatterns = { "/SecureServlet" })
public class SecureServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("principal " + request.getUserPrincipal() + " in role g1:" + request.isUserInRole("g1"));
    }

}
