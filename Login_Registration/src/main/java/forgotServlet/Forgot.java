package forgotServlet;

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
 * Servlet implementation class Forgot
 */
@WebServlet("/Forgot")
public class Forgot extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDao userDao = new UserDaoImp();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Forgot() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String email = request.getParameter("Email");
		String pass = request.getParameter("password");
		
		 
		if(userDao.isValidEmail(email, pass))
		{
			boolean t =userDao.UpdatePassword(email, pass);
			if( t == true)
			{
				System.out.println("Password is changed:)");
				response.sendRedirect("forget.jsp?forgot=success");
			}else
			{
				System.out.println("Password has not changed");
			}
			
			
		}else {
	         response.sendRedirect("forget.jsp?error=1");
	      	System.out.println("Error A gya");
	      }
	}

}
