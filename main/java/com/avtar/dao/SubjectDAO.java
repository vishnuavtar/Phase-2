package com.avtar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.avtar.dbcon.DbUtil;
import com.avtar.pojo2.Subject;
import com.avtar.pojo2.Subject;
import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

public class SubjectDAO {
	
	public List<Subject> getallsubject() throws ClassNotFoundException, SQLException
	{
		
		ArrayList <Subject> list = new ArrayList<>();
		Connection con = DbUtil.getConn();
		
		String sql = "Select * from subject";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			Subject s = new Subject();
			s.setId(rs.getString(1));
			s.setSubjectname(rs.getString(2));
			
			list.add(s);
		}
		
		return null;
		
	}

}
