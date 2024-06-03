/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.currencyconveterdemo.servlet;
import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/accept")


public class DecisionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, 
	HttpServletResponse response) 
			throws ServletException, IOException {
	
		int amt = Integer.parseInt(
				request.getParameter("txtAmount"));
		String choice = 
				request.getParameter("radCurrency");
		String pageUrl = "";
		
		switch (choice) {
		case "d":
			pageUrl = "dollar?amount="+amt;
			break;

		case "p":
			pageUrl = "pound?amount="+amt;
			break;
		}
		
		//client side redirection
		response.sendRedirect(pageUrl);
	}

    
}
