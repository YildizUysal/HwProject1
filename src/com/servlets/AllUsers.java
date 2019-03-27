package com.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ejb.UserDAO;
import com.project.User;

/**
 * Servlet implementation class AllUsers
 */
@WebServlet("/AllUsers")
public class AllUsers extends HttpServlet {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

ArrayList<User> list= userDAO.getAllUsers();
request.setAttribute("list", list);
request.getRequestDispatcher("allusers.jsp").forward(request, response);

		
	}

}
