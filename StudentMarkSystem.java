package com.studentmark;

import java.util.ArrayList;
import java.util.List;

public class StudentMarkSystem {
	
	public static void main(String args[]) {
		StudentMarkSystem studentMarkSystem = new StudentMarkSystem();
		List<Student> studentList = studentMarkSystem.studentInfo();
		studentMarkSystem.totalMarkStudent(studentList);
		System.out.println("mark is " + studentMarkSystem.studentInfo());

	}

	private void totalMarkStudent(List<Student> studentList) {

		for (Student student : studentList) {
			System.out.println("studentName : " + student.getName());
			int totalMark = 0;
			for (Subject subjectobj : student.getSubjectList()) {
				System.out.println("subjectName :" + subjectobj.getName());
				System.out.println("studentMark : " + subjectobj.getMark());
				totalMark = totalMark + subjectobj.getMark();
				System.out.println("total mark :" + totalMark);
			}
		}
	}

	private List<Student> studentInfo() {

		ArrayList<Student> studentList = new ArrayList<Student>();
		Student student = new Student();
		student.setName("akash");
		student.setId(1001);
		student.setSubjectList(subjectInfo("akash"));
		studentList.add(student);

		Student student1 = new Student();
		student1.setName("balaji");
		student1.setId(1002);
		student1.setSubjectList(subjectInfo("balaji"));
		studentList.add(student1);

		Student student2 = new Student();
		student2.setName("chandru");
		student2.setId(1003);
		student2.setSubjectList(subjectInfo("chandru"));
		studentList.add(student2);

		Student student3 = new Student();
		student3.setName("surya");
		student3.setId(1004);
		student3.setSubjectList(subjectInfo("surya"));
		studentList.add(student3);

		Student student4 = new Student();
		student4.setName("prabhu");
		student4.setId(1005);
		student4.setSubjectList(subjectInfo("prabhu"));
		studentList.add(student4);

		return studentList;

	}

	private List<Subject> subjectInfo(String name) {

		Subject subject = new Subject();
		subject.setName("Tamil");

		Subject subject1 = new Subject();
		subject1.setName("English");

		Subject subject2 = new Subject();
		subject2.setName("Maths");

		Subject subject3 = new Subject();
		subject3.setName("Science");

		Subject subject4 = new Subject();
		subject4.setName("Social");

		if (name.equals("arun")) {
			subject.setMark(86);
			subject1.setMark(98);
			subject2.setMark(85);
			subject3.setMark(68);
			subject4.setMark(78);
		} else if (name.equals("balaji")) {
			subject.setMark(75);
			subject1.setMark(64);
			subject2.setMark(69);
			subject3.setMark(68);
			subject4.setMark(79);
		} else if (name.equals("chandru")) {
			subject.setMark(72);
			subject1.setMark(74);
			subject2.setMark(89);
			subject3.setMark(58);
			subject4.setMark(99);
		} else if (name.equals("surya")) {
			subject.setMark(62);
			subject1.setMark(64);
			subject2.setMark(88);
			subject3.setMark(89);
			subject4.setMark(78);
		} else if (name.equals("prabhu")) {
			subject.setMark(69);
			subject1.setMark(94);
			subject2.setMark(78);
			subject3.setMark(69);
			subject4.setMark(98);
		}

		ArrayList<Subject> subjectList = new ArrayList<Subject>();

		subjectList.add(subject);
		subjectList.add(subject1);
		subjectList.add(subject2);
		subjectList.add(subject3);
		subjectList.add(subject4);

		return subjectList;

	}

}
