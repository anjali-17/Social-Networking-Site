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
 * Servlet implementation class infoserv
 */
@WebServlet("/infoserv")
public class infoserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public infoserv() {
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
		String city = request.getParameter("city");
		String phone = request.getParameter("phone");
		String date = request.getParameter("date");
		String month = request.getParameter("month");
		String year = request.getParameter("year");
		String gender = request.getParameter("gender");
		String movie = request.getParameter("movie");
		String sport = request.getParameter("sport");
		String novel = request.getParameter("novel");
		String school = request.getParameter("school");
		String college  = request.getParameter("college");
		String work = request.getParameter("work");
		//String uid = request.getParameter("uid");
		HttpSession session = request.getSession();
		
		database db = new database();
		Connection conn = db.createConnection();
		
		try{
			Statement stmt1 = conn.createStatement();	
			ResultSet rs = null;
			int id = (int) session.getAttribute("user_id1");
			System.out.println(id);
			//String sql1 = "insert into test3 values('" + city + "','" + movie + "','" +id + "');";
			String sqll = "insert into profile values('" + city + "','" + phone + "','" + movie + "','" + sport + "','" + novel + "','" + school + "','" + college + "','" + work + "','" + name + "','" + date + "','" + month + "','" + year + "','" + gender + "','" + id +"');";
			stmt1.executeUpdate(sqll);
			
			rs = stmt1.executeQuery("Select * from profile where city ='" + city + " 'and movie = ' "+ movie + "'");
			if(rs!=null)
			 {
				 System.out.println("Successfully added information");
				 request.getSession();
				 //session.setAttribute("User",emailid);
				 //System.out.println("Session created emailid: " + emailid);
				 session.setAttribute("user_id1",id);
				 getServletContext().getRequestDispatcher("/timeline.jsp").forward(request, response);
			 }
			 else
			 {
				 System.out.println("No information added");
				 //response.sendRedirect("loginfb.jsp");
			 }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
