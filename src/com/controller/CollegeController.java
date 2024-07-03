package com.controller;

import com.entity.Department;
import com.entity.Student;
import com.service.CollegeService;

public class CollegeController {

	public String insertData(Department d, Student s) {
		CollegeService collegeService = new CollegeService();
		return collegeService.insertData(d, s);

	}

}
