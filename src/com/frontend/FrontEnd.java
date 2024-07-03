package com.frontend;

import com.controller.CollegeController;
import com.entity.Department;
import com.entity.Student;

public class FrontEnd {
	public static void main(String[] args) {
		
		Department d = new Department();
		d.setDname("Mechanical Engineering");
		
		Student s = new Student();
		s.setSname("Shreeraj");
		s.setDepartment(d);
		
		CollegeController controller = new CollegeController();
		String msg = controller.insertData(d,s);
		System.out.println(msg);
	}
}
