package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ejb.UserDAO;
import com.sun.javafx.scene.layout.region.Margins.Converter;

import javafx.css.ParsedValue;
import oracle.jrockit.jfr.parser.Parser;

/**
 * Servlet implementation class RegisterPage
 */
@WebServlet("/RegisterPage")
public class RegisterPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
     UserDAO userDAO;
  
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
		doGet(request, response);
		
	//	"INSERT INTO 'demoProject'.'user'('Name','Surname','BirthDate','BirthPlace','Email','Phone','Gender','GradDeggre','Address_1','Address_2','Country','State','ZipCode','RegDate')VALUES('"++"');""
		PrintWriter out= response.getWriter();
	//	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		Date date = new Date();

		 String username= request.getParameter("username");
		 String password= request.getParameter("password");
		 String passAgain= request.getParameter("passwordAgain");
		 String name= request.getParameter("name");
		 String	surname= request.getParameter("surname");
		 String	birthDate= request.getParameter("birthDate");//dateFormat.format();
		 String	birthPlace= request.getParameter("birthPlace");
		 String	email= request.getParameter("email");
		 String	phone= request.getParameter("phone");
		 String	gender= request.getParameter("gender");
		 String	gradDeggre= request.getParameter("gradDeggre");
		 String	address_1= request.getParameter("address_1");
		 String	address_2= request.getParameter("address_2");
		 String	country= request.getParameter("country");
		 String	state= request.getParameter("state");
		 String	zipCode= request.getParameter("zipCode");
		// String	regDate= "2019-03-25 01:17:00"; //dateFormat.format(date);
		Date date = new Date();
		Timestamp time = new Timestamp(date.getTime());
		
		 String URL="jdbc:mysql://localhost:3306/demoProject";
		 String USERNAME="root";
		 String PASSWORD="12345678";
		 
		 Connection conn=null;
		 PreparedStatement getUser=null;
		 PreparedStatement insertLog=null;
		 PreparedStatement insertReg=null;
		 ResultSet rs=null;
		 ResultSet rs2=null;
		 ResultSet rs3=null;
		 
		if(password.intern() == passAgain.intern()){
			try { 
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				//Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				if(conn == null){
					out.println("bağlantı yok ");
				}
				else{
					/*getUser  = conn.prepareStatement(
							"SELECT UserName, Email "
							+ "FROM demoProject.login "
							+ "WHERE UserName = ? "
							+ "OR Email = ?");
					getUser.setString(1, username);
					getUser.setString(2, email);
					rs3 = getUser.executeQuery();
					if(rs3.next()){
						out.println("Bu Kullanıcı Bulunuyor");
						response.sendRedirect("home.jsp");
					}
					else{*/
						insertLog  = conn.prepareStatement(
								"INSERT INTO 'demoProject'.'login'"
								+ "('Email','UserName','Password');"
								+ "VALUES(?,?,?);");
						insertLog.setString(1, email);
						insertLog.setString(2, username);
						insertLog.setString(3, password);
						insertReg  = conn.prepareStatement(
								"INSERT INTO 'demoProject'.'user'"
								+ "('Name','Surname','Email')"
								+ "VALUES(?,?,?);");
						insertReg.setString(1, name);
						insertReg.setString(2, surname);
						insertReg.setString(3, email);
					    insertLog.execute();
						insertReg.executeQuery();
						
							out.println("Bu Kullanıcı Eklendi.");
							HttpSession session = request.getSession();
							session.setAttribute("username", username);
							response.sendRedirect("user.jsp?username="+username);
						
					}
				
				//}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		else{
			out.println("Şifreleri Aynı Giriniz.");
		}
		
		
		
		
		
		
		
	}

	
}
