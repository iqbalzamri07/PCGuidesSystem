package com.awesometodo.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.awesometodo.model.UserInfo;
import com.awesometodo.model.manager.UserManager;

/**
 * Servlet implementation class RegisterAction
 */
@WebServlet("/RegisterAction")
public class RegisterAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//get parameters from the form
		String fullName = request.getParameter("fullName");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		double money = 1000;
		
		//create userbean object to store those info
		UserInfo ui = new UserInfo(fullName,username,email,password,address,money);
		
		UserManager um = new UserManager();
		boolean status = false;
		
		try {
			//call register method
			status = um.register(ui);
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		//redirect and send information
		//to status page
		
		if(status==true) {
			request.setAttribute("status", status);
			request.setAttribute("userinfo", ui);
			request.getRequestDispatcher("registerStatus.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("status", status);
			request.getRequestDispatcher("registerdb.jsp").forward(request, response);
		}
		
	}

}
