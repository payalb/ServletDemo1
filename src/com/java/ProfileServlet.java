package com.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.db.EmployeeRepository;
import com.java.dto.Employee;

public class ProfileServlet extends HttpServlet{
	
	EmployeeRepository rep= new EmployeeRepository();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id= Integer.parseInt(req.getParameter("id"));
		resp.setContentType("application/json");
		Employee e=rep.getEmployee(id);
		PrintWriter writer= resp.getWriter();
		/*writer.println("name :"+ e.getName()+ "<br/>");
		writer.println("company :"+ e.getCompany()+ "<br/>");
		writer.println("address :"+ e.getAddress()+ "<br/>");*/
		String result ="{\"name\": "+e.getId() +", \"company\" : " +e.getCompany()+ "} ";
		writer.println(result);
	}
	
}
