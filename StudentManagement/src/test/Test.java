package test;

import java.util.List;

import entity.Student;
import service.SelectStudents;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = SelectStudents.selectStudents();
		
		for(Student s : list) {
			
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getSurname());
			System.out.println(s.getCountry());
			System.out.println(s.getLocation());
			System.out.println(s.getBirthDate());
			System.out.println(s.getYear());
			System.out.println(s.getDegree());
			System.out.println(s.getClass());
			System.out.println("");
		}

	}

}
