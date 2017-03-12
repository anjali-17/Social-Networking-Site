
import social.database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.Properties;


/**
 * Servlet implementation class messageserv
 */
@WebServlet("/messageserv")
public class messageserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public messageserv() {
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
		
		String name = request.getParameter("name");
		//System.out.println(name);
		// Recipient's email ID needs to be mentioned.
	      String to = request.getParameter("email");
	      //System.out.println(to);
	      String message = request.getParameter("message");
	      //System.out.println(message);
	      HttpSession session = request.getSession();
	      int id = (int) session.getAttribute("user_id1");
			database db = new database();
			Connection conn = db.createConnection();
			 
			
			try{
				Statement stmt = conn.createStatement();	
				ResultSet rs = null;
				//System.out.println("inside try block");
				//int id = (int) session.getAttribute("user_id1");
				System.out.println(id);
				rs= stmt.executeQuery("select email_id from test1 where user_id='" +id+"'");
				//System.out.println("hi");
				
				while(rs.next()){
				String from = rs.getString("email_id");
				//System.out.println(from);
				stmt.executeUpdate("insert into message values('" + from + "','" + to + "','" + message + "');");
				System.out.println("Message sent successfully");
				getServletContext().getRequestDispatcher("/timeline.jsp").forward(request, response);
				}
		doGet(request, response);
			}
			catch(Exception e){
	}

}}
