package com.example.selenium_demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterRegexServlet")
public class RegisterRegexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String password = request.getParameter("password");
		
		String emailRegex="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		String mobileRegex="^[6-9]\\d{9}$";
		String passwordRegex ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
		
		if(!Pattern.matches(emailRegex, email)) {
			out.println("Invalid Email");
		}
		else if (!Pattern.matches(mobileRegex, mobile)){
			out.println("Invalid mobile");
		}
		else if(!Pattern.matches(passwordRegex, password)) {
			out.println("Invalid password");
		}
		else {
			out.println("Registration Successful");
		}
	}


	}


