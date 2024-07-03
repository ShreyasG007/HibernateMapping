package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateConfig;
import com.entity.Department;
import com.entity.Student;

public class CollegeDao {

	public boolean insertData(Department d, Student s) {
		
		SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.beginTransaction();
		
		openSession.save(d);
		openSession.save(s);
		
		transaction.commit();
		
		return true;
	}
	
	

}
