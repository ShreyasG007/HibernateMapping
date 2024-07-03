package com.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Department;
import com.entity.Student;

public class HibernateConfig {
	public static final SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Department.class);
		configuration.addAnnotatedClass(Student.class);
		
		return configuration.buildSessionFactory();
	}
}
