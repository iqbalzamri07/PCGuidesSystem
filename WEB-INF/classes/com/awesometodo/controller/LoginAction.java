package com.awesometodo.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.awesometodo.model.UserInfo;
import com.awesometodo.model.manager.UserManager;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAction() {
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
		
		//get parameter
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//create UserManager Object
		UserManager um = new UserManager();
		UserInfo ui = null;
		
		try {
			// and call login method and return userinfo
			ui = um.login(username, password);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (ui == null) {
			//login failed, forward back to login page
			//parameter failed
			request.setAttribute("fail", true);
			request.getRequestDispatcher("logindb.jsp").forward(request, response);
		}
		else {
			//login success, set session
			HttpSession s = request.getSession();
			s.setAttribute("userinfo", ui);
			//and forward to Home Servlet
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
			
	}

}
