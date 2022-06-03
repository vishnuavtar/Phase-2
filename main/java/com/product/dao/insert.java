package com.product.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared;

/**
 * Servlet implementation class insert
 */
public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insert() {
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
		// TODO Auto-generated method stub
		
		try {
			Connection con = DbUtil.getConn();
			
			PrintWriter pw = response.getWriter();
			
			String id= request.getParameter("id");
			
			String pname= request.getParameter("pname");
			
			String price = request.getParameter("price");
			
			String sql = "insert into product10 values(?,?,?) ";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, id);
			
			ps.setString(2, pname);
			
			ps.setString(3, price);
			
			int r = ps.executeUpdate();
			
			if(r>0)
			{
				pw.println("Inserted");
			}

			else
			{
				pw.println("not inserted");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
	}

}
