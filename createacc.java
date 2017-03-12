import social.database;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class createacc
 */
@WebServlet("/createacc")
public class createacc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createacc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public static boolean isValidEmailAddress(String email) {
    	Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
    	Matcher m = p.matcher(email);
    	boolean matchFound = m.matches();
    	return matchFound;
    	}
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
		String cpassword = request.getParameter("cpassword");
		Object user_id=null;
		//String uid = request.getParameter("uid");
		
		
		
		database db = new database();
		Connection conn = db.createConnection();
		
		try{
			Statement stmt = conn.createStatement();	
			ResultSet rs = null;
			HttpSession session = request.getSession();
			String sql = "insert into test1(email_id,password) values('" + emailid + "','" + password + "')";
		
			//stmt.executeUpdate(sql);
			//rs = stmt.executeQuery(id);
			//int uid = rs.getInt(1);
			//String sql1 = "insert into profile(uid,fname,lname,date,month,year,gender) values('" + uid + "','"+ firstname + "','" + lastname + "','" + date + "','" + month + "','" + year + "','" + gender + "');";
			//String id = "select last_insert_id();";
			//System.out.println(id);
			boolean isvalid;
			isvalid=isValidEmailAddress(emailid);
			if(isvalid){
			if(password.equals(cpassword)){
			stmt.executeUpdate(sql);
			//System.out.println(user_id1);
			//ResultSet i = null;
			 //i = stmt.executeQuery("select last_insert_id()");
			//stmt.executeUpdate(sql1);
			 
			                      //"insert into login (user,pass) values('" + user + "','" + pass + "')";
			rs = stmt.executeQuery("Select max(user_id) from test1;");
			
			//rs = stmt.executeQuery("Select user_id from test1 where email_id ='" + emailid + " 'and password = ' "+password + "'");
			//int user_id1 = rs.getInt(1);
			//System.out.println(user_id1);
			//System.out.println("nupur");
			if(rs.next())
			 {
				 System.out.println("Successfully logged in");
				int user_id1 = rs.getInt(1);
				System.out.println(user_id1);
				//session = request.getSession();
				 session.setAttribute("user_id1",user_id1);
				 System.out.println("Session created emailid: " + emailid);
				 getServletContext().getRequestDispatcher("/information.jsp").forward(request, response);
				 
			 }
			 else
			 {
				 System.out.println("Login failed! Enter correct details.");
				 response.sendRedirect("login.jsp");
			 }
			}
			
			else {
				System.out.println("Passwords doesn't match!");
				response.sendRedirect("login.jsp");
			}
			}
			else{
				System.out.println("Enter valid email id");
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
