package com.learnJava.soumyajeet;

import java.util.Comparator;

import com.learnJava.data.Student;

public class SortByNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

	

}
