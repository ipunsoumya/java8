package com.learnJava.soumyajeet;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamPractice {

	public static void main(String[] args) {
		System.out.println(getDistinctActivities());
		System.err.println("Total count : ");
		System.out.println(getDistinctActivitiesCount());
		System.err.println("Sorted : ");
		System.out.println(getDistinctActivitiesSroted());
		System.err.println("Sorted Students By name: ");
		System.out.println(sortedStudentsByName());
		System.err.println("Sorted Students By GPA: ");
		System.out.println(sortedStudentsByGpa());
	}
	
	public static List<String> getDistinctActivities() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				
				.distinct()
				.collect(Collectors.toList());
	}
	
	public static long getDistinctActivitiesCount() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.count();
	}
	
	public static List<String> getDistinctActivitiesSroted() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
	}
	
	public static List<Student> sortedStudentsByName() {
		return StudentDataBase.getAllStudents().stream()
		.sorted(new SortByNameComparator().reversed())
		.collect(Collectors.toList());
	}
	
	public static List<Student> sortedStudentsByGpa() {
		return StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getGpa).reversed())
		.collect(Collectors.toList());
	}

}
