import social.database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginserv
 */
@WebServlet("/loginserv")
public class loginserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		
		database db = new database();
		Connection conn = db.createConnection();
		
		try{
			Statement stmt = conn.createStatement();	
			ResultSet rs = null;
			rs = stmt.executeQuery("Select user_id from test1 where email_id ='" + emailid + " 'and password = ' "+password + "'");
			rs = stmt.executeQuery("Select * from test1 where email_id ='" + emailid + "'and password = '"+password + "'");
			 if(rs.next())
			 {
				 System.out.println("Successfully logged in");
				 HttpSession session = request.getSession();
				 session.setAttribute("User",emailid);
				 System.out.println("Session created");
				 int user_id1 = rs.getInt(1);
				System.out.println(user_id1);
				session.setAttribute("user_id1",user_id1);
				 getServletContext().getRequestDispatcher("/timeline.jsp").forward(request, response);
			 }
			 else
			 {
				 System.out.println("Login failed! Enter correct details.");
				 response.sendRedirect("login.jsp");
			 }
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		doGet(request, response);
	}

}
