package com.mr;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springdatajpa3Application {

	public static void main(String[] args) {
		SpringApplication.run(Springdatajpa3Application.class, args);
		
		String input="govindagiri";
		input.chars().mapToObj(ch->(char)ch).
		collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst().get();
		System.out.println(input);
	}
}
		
