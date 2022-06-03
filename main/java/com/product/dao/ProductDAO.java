package com.product.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.product.pojo.Productpojo;

public class ProductDAO {
	
	public int insert(Productpojo e) {
		SessionFactory sf=Config.hibConfig();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		int r=(int) s.save(e);
		t.commit();
		s.close();
		sf.close();
		return r;
	}
}
