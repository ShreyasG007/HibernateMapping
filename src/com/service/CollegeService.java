package com.service;

import com.dao.CollegeDao;
import com.entity.Department;
import com.entity.Student;

public class CollegeService {

	public String insertData(Department d, Student s) {

		CollegeDao dao = new CollegeDao();
		dao.insertData(d, s);

		if (true) {
			return "Data Inserted Success!!!";
		} else {
			return "Data not inserted !!!!";
		}

	}
}
