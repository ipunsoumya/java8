package com.learnJava.soumyajeet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class FilterDuplicateElements {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 3, 5, 3, 1, 5, 3, 8, 7, 9, 5);
		Map<Integer, Long> collect = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);

		Set<Integer> unique = new HashSet<Integer>();
		Set<Integer> duplicate = list.stream().filter((s) -> !unique.add(s)).collect(Collectors.toSet());
		System.out.println(duplicate);

		Set<Integer> collect2 = list.stream().filter((s) -> Collections.frequency(list, s) > 1)
				.collect(Collectors.toSet());
		System.out.println(collect2);

		System.out.println(Runtime.getRuntime().availableProcessors());
		
		StudentDataBase.getAllStudents().stream().map(Student::getName)
		.sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(s -> System.out.println(s));
		
		StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.toList())
		.sort(Comparator.naturalOrder());	
	}

}
