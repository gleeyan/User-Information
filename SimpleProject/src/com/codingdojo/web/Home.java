package com.codingdojo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String homeTown = request.getParameter("homeTown");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String favoriteLanguage = request.getParameter("favoriteLanguage");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if (homeTown==null){
        	homeTown= "unknown";
        }
        if (firstName==null){
        	firstName= "unknown";
        }	
        if (lastName==null){
        	lastName= "unknown";
        }	
        if (favoriteLanguage==null){
        	favoriteLanguage= "unknown";
        }	
        out.write("<h1>Welcome, " + firstName + " "+ lastName + "<br>"
        		+ "Your favorite language is: " + favoriteLanguage+ "<br>"
        		+ "Your hometown is: " + homeTown + "</h1>");
       
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
