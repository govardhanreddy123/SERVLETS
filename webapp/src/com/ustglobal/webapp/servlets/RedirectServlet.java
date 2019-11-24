package com.ustglobal.webapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Search = req.getParameter("search");
		String select = req.getParameter("select");
		if(select.equals("Bing")) {
			resp.sendRedirect("https://www.bing.com/search?q="+Search);
		}else if(select.equals("google")){
			resp.sendRedirect("https://www.google.com/search?q="+Search);
		}else {
			resp.sendRedirect("https://in.search.yahoo.com/search?p="+Search);
		}




	}

}
