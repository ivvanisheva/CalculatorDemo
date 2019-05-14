package com.swiftacad;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javafx.css.ParsedValue;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		switch (request.getParameter("Operations")) {

		case "add": {
			response.getWriter().print("The result is "
					+ (Integer.valueOf(request.getParameter("x")) + Integer.valueOf(request.getParameter("y")) + ".")); break;
		}

		case "less": {
			response.getWriter().print("The result is "
					+ (Integer.valueOf(request.getParameter("x")) - Integer.valueOf(request.getParameter("y")) + ".")); break;
		}

		case "times": {
			response.getWriter().print("The result is "
					+ (Integer.valueOf(request.getParameter("x")) * Integer.valueOf(request.getParameter("y")) + ".")); break;
		}

		case "howin": {
			response.getWriter().print("The result is "
					+ (Integer.valueOf(request.getParameter("x")) / Integer.valueOf(request.getParameter("y")) + ".")); break;
		}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
