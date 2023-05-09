package com.mr;

import java.util.stream.Collectors;

public class First {
	public static void main(String[] args) {
		String input = "Java Hungry Blog Alive Is Awesome";
		String result = input.chars()
				.mapToObj(ch->String.valueOf(Character.toLowerCase(character.valueOf((char)ch)))))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet()
				.stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst().get();
				System.out.println(result);
	
	}

}
