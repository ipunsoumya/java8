package com.learnJava.soumyajeet;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class GroupingByCollector {

	public static void main(String[] args) {
		Map<String, List<Student>> collect = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender));
		System.out.println(collect);

		Map<String, List<Student>> collect2 = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(student -> student.getGpa()>=3.8 ? "Outstanding" : 
						"Average"));

		System.out.println(collect2);

		Map<Integer, Map<String, List<Student>>> collect3 = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, 
						Collectors.groupingBy(student -> student.getGpa()>=3.8 ? "Outstanding" : 
								"Average")));

		System.out.println(collect3);

		Map<String, Integer> collect4 = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName, 
						Collectors.summingInt(Student::getNoteBooks)));

		System.out.println(collect4);

		LinkedHashMap<String, Set<Student>> collect5 = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, 
						Collectors.toSet()));

		System.out.println(collect5);

		Map<Integer, Student> collect6 = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), 
								Optional::get)));

		System.out.println(collect6);

		Map<Integer, Student> collect7 = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)), 
								Optional::get)));

		System.out.println(collect7);

		String collect8 = StudentDataBase.getAllStudents().stream().
				map(Student::getName).collect(Collectors.joining("-", "pre", "suf"));

		System.out.println(collect8);
	}

}
