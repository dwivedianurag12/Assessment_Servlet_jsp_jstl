package com.cts;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  int flag=0;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Connection con=null;
		PreparedStatement ps=null;
		String uname = request.getParameter("user");
		String passw = request.getParameter("pass");
		String add = request.getParameter("add");
		String cpassw = request.getParameter("cpass");
		
		System.out.println("hiiiiiiiiiiiii");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "root", "adm@123");
			
			Statement stmt = con.createStatement();
			
			String query=("Insert into Credentials values(?,?,?)");
			  ps = (PreparedStatement) con.prepareStatement(query);
		      ps.setString (1, uname);
		      ps.setString (2, passw);
		      ps.setString(3, add);
		     
					
			ps.execute();
			RequestDispatcher rd=request.getRequestDispatcher("LoginForm.html");
			rd.forward(request, response);
						
				} catch (Exception e) {
					System.out.println(e);
				}
				finally{
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	
		
	}

	
}
