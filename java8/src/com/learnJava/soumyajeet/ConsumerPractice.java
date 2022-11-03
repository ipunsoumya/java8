package com.learnJava.soumyajeet;

import java.util.function.Consumer;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class ConsumerPractice {

	private static Consumer<Student> c1 = (student) -> System.out.print(student.getName());
	private static Consumer<Student> c2 = (student) -> System.out.print(student.getNoteBooks());
	
	public static void main(String[] args) {
		StudentDataBase.getAllStudents().forEach(student ->
				{
					if (student.getGpa()>3.6) {
						c1.andThen(c2).andThen(c1).accept(student);
						System.out.println();
					}
				});
	}

}
