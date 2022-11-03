package com.learnJava.soumyajeet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		String string = "codede code";
		/*
		 * Map<Character, Integer> map = new HashMap<>(); for(int i=0;
		 * i<string.length(); i++) { if(map.get(string.charAt(i)) != null) { Integer
		 * value = map.get(string.charAt(i)) + 1; map.put(string.charAt(i), value); }
		 * else { map.put(string.charAt(i), 1); } } Set<Character> duplicateCharacters =
		 * new HashSet<Character>(); for (Entry<Character, Integer> entrySet :
		 * map.entrySet()) { if(entrySet.getValue()>1) {
		 * duplicateCharacters.add(entrySet.getKey()); } }
		 * 
		 * System.out.println(duplicateCharacters);
		 */
		Set<Character> duplicCharacters = new HashSet<Character>();
		for(int i=0; i<string.length()-1; i++) {
			if (string.indexOf(string.charAt(i)) != string.lastIndexOf(string.charAt(i))){
				System.out.println(string.charAt(i));
				duplicCharacters.add(string.charAt(i));
				
			}
		}
		System.out.println(duplicCharacters);
		
		Optional<String> string3 = null;
		string3.ifPresent(s -> System.out.println(s));
		Map<String, String> map = new HashMap<String, String>();
		
	}

}
