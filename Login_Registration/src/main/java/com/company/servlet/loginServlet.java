package com.company.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.dao.UserDaoImp;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static UserDao userDao = new UserDaoImp();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 String username = request.getParameter("username");
     String password = request.getParameter("password");

     if (userDao.isValidUser(username, password)) {
         HttpSession session = request.getSession();
         session.setAttribute("username", username);
         response.sendRedirect("welcome.jsp");
         //System.out.println("Hi - "+username);
     } else {
         response.sendRedirect("login.jsp?error=1");
     	System.out.println("Error A gya");
     }
    
     
	}

}
