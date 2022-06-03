package com.avtar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.avtar.dbcon.DbUtil;
import com.avtar.pojo.Student;
import com.avtar.pojo4.Subject_Teacher;


public class Subject_TeacherDAO {

//	public int insertstudent(Student s) throws ClassNotFoundException, SQLException {
//		Connection con=DbUtil.getConn();
//		String sql="insert into student11 values(?,?,?)";
//		PreparedStatement ps=con.prepareStatement(sql);
//		ps.setString(1,s.getId());
//		ps.setString(2,s.getName());
//		ps.setString(3,s.getEmail());
//		return ps.executeUpdate();
//	}
//	
	
	public List<Subject_Teacher> getallsubject_teacher() throws ClassNotFoundException, SQLException{
		List<Subject_Teacher> list=new ArrayList<>();
		Connection con=DbUtil.getConn();
		String sql="select * from Subject_Teacher";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Subject_Teacher s=new Subject_Teacher();
			s.setId(rs.getString(1));
			s.setSubject(rs.getString(2));
			s.setTeachername(rs.getString(3));
			
			list.add(s);
			
		}
		return list;
	}

}
