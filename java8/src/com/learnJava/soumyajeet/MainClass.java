package com.learnJava.soumyajeet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class MainClass {

	public static void welcomePlanet(Planet planet) {
		if (planet instanceof Planet) {
			System.out.println("Planet");
		}
		if (planet instanceof Mars) {
			System.out.println("Mars");
		}
	}
	public static void main(String[] args) {
		Planet planet = new Planet();
		welcomePlanet(planet);
		
		Stream<String> of = Stream.of("jscs","sjbds");
		Stream<Student> of2 = Stream.of(new Student());
		of2 = StudentDataBase.getAllStudents().stream();
		System.out.println(of2.isParallel());
		
	}

}
