package com.candidate.man;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.User;



/**
 * Servlet implementation class candidate
 */
@WebServlet("/candidate")
public class candidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    private static final User u = new User();
     
    public candidate() {
       
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      String cgpa = request.getParameter("cgpa");
	      double cgpa1 = Double.valueOf(cgpa); 
	      response.sendRedirect("info.jsp?cgpa="+cgpa1);
	      
	}

}
