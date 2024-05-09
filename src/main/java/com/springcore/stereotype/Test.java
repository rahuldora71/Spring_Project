package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student = context.getBean("ob", Student.class);
		System.out.println(student);
		
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());
		System.out.println(student.hashCode());
		System.out.println("_________________________________________________________");
		Student student1 = context.getBean("ob", Student.class);
		System.out.println(student1.hashCode());
		System.out.println(student1);
		System.out.println("Teachers--->---------------------------------------->");
		Teacher teacher=(Teacher)context.getBean("teacher");
		Teacher teacher1=(Teacher)context.getBean("teacher");
		System.out.println("teacher : "+teacher.hashCode());
		System.out.println("teacher1 : "+teacher1.hashCode());
		

	}
}
