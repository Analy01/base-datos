/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author A-n-Y
 */
public class ServletAutenticar extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
//Paso 1.- Por medio del request pedir un parametro, en este caso el nombre
          String name=request.getParameter("nombre");
          String pas=request.getParameter("password");
          out.println("Bienvenido "+name);

    }
    
}