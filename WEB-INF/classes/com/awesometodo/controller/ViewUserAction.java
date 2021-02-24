package com.awesometodo.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.awesometodo.model.UserInfo;
import com.awesometodo.model.manager.ViewUser;

/**
 * Servlet implementation class ViewUserAction
 */
@WebServlet("/ViewUserAction")
public class ViewUserAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewUserAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ViewUser ui = new ViewUser();
		ArrayList<UserInfo> userInfo = ui.getAllUser();
		
		request.setAttribute("viewUser", userInfo);
		
		request.getRequestDispatcher("viewUser.jsp").forward(request, response);
	}

}
