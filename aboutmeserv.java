

import java.io.IOException;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import social.database;

/**
 * Servlet implementation class aboutmeserv
 */
@WebServlet("/aboutmeserv")
public class aboutmeserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public aboutmeserv() {
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
		HttpSession session = request.getSession();
	      int id = (int) session.getAttribute("user_id1");
	      System.out.println(id);
			database db = new database();
			Connection conn = db.createConnection();
			 
			
			try{
				Statement stmt = conn.createStatement();	
				ResultSet rs = null;
				System.out.println("inside try block");
				

		
			//PreparedStatement ps=con.prepareStatement("select * from result where rollno=?");
			//ps.setInt(arg0, arg1);
			
		
		doGet(request, response);
		} catch(Exception e){
			
		}
	}

}
