package com.manager;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.dao.UserDaoImp;
import com.company.servlet.UserDao;

/**
 * Servlet implementation class manager
 */
@WebServlet("/manager")
public class manager extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final UserDao userDao = new UserDaoImp();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public manager() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String pass =request.getParameter("password");
		
		if(userDao.isValidManager(username,pass))
		{

	        response.sendRedirect("CandiateInfo.jsp");
		}
		else
		{
			response.sendRedirect("ManagerInfo.jsp?error=1");
	     	System.out.println("Error A gya");
		}
		
	}

}
