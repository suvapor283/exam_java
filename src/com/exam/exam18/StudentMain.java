package com.exam.exam18;

public class StudentMain {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		Student st2 = new Student(17, "이태양", "송도고등학교");
		
		st1.setAge(18);
		st1.setMyName("이영애");
		st1.setSchool("마산고등학교");
		
		System.out.println("이름 : " + st1.getMyName() + ", 나이 : " + st1.getAge() + ", 학교 : " + st1.getSchool());
		System.out.println("이름 : " + st2.getMyName() + ", 나이 : " + st2.getAge() + ", 학교 : " + st2.getSchool());
	}
}