package com.learnJava.soumyajeet;

import java.util.Map;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class PartitioningByPractice {

	public static void main(String[] args) {
		Map<Boolean, Map<String, Integer>> collect = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.partitioningBy(student -> student.getGpa()>3.8, 
				Collectors.toMap(Student::getName, Student::getNoteBooks)));
		
		System.out.println(collect);
	}

}
