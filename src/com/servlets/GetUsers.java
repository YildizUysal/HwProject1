package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ejb.UserDAO;
import com.project.User;

/**
 * Servlet implementation class GetUsers
 */
@WebServlet("/GetUsers")
public class GetUsers extends HttpServlet {


	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
User user= userDAO.getUser(id);
request.setAttribute("user", user);
request.getRequestDispatcher("home.jsp").forward(request, response);

		
	}
}
