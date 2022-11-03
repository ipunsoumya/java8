package com.learnJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class World {
	
	
	static List<Integer> list = new ArrayList<Integer>();
	static List<Integer> list2 = new Vector<>();

	public static void main(String[] args) {
		Country country1;
		country1 = new Country();
		country1.name = "India";
		country1.nationalFlag = "Tiranga";
		country1.language = "Hindi";
		list2 = list;
		
		Country country2;
		country2 = new Country();
		country2.name = "England";
		country2.nationalFlag = "Cross";
		country2.language = "English";
		
		
		printCountry(country2);
	}
	
	static void printCountry(Country jyoti) {
		System.out.println(jyoti.name);
		System.out.println(jyoti.language);
	}
	
	
}
