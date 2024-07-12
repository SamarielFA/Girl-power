package com.datorium.Datorium.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin
public class DatoriumApiApplication {

	public static void main(String[] args) {
		System.out.println("asd");
		SpringApplication.run(DatoriumApiApplication.class, args);
	}

	//Teamwork 2 - Create an object (new class, cheese or wine or whatever) in the endpoint, fill the object, access it from the URL
	//This is part Dog.java (Main.java is below)
	public class Dog{
		public String name;
		public String color;
		public int age;

		public Dog(String name, String color, int age){
			this.name = name;
			this.color = color;
			this.age = age;
		}
	}


	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);  //"Hello " + name;
	}

	@GetMapping("/sum")
	public int sum(@RequestParam(value = "number1") int number1, @RequestParam(value = "number2") int number2){
		return number1 + number2;
	}

	@GetMapping("/multiply")
	public int multiply(@RequestParam(value = "number1") int number1, @RequestParam(value = "number2") int number2){
		return number1 * number2;
	}

	//Teamwork 1. Create an array in the endpoint, fill the array with data and access it from the URL
	//example 1
	@GetMapping("/array")
	public int [] getArray() {
		int[] arrayList = {1, 2, 3, 4, 5};
		return arrayList;
	}

	//example 2
	@GetMapping("/people")
	public String [] people() {
		String[] peopleList = {"Dace", "Ibukun", "Jaana", "Madara", "Samariel", "Kristine", "Maile"};
		return peopleList;
	}

	//Teamwork 2 - Create an object (new class, cheese or wine or whatever) in the endpoint, fill the object, access it from the URL
	//This is part Main.java (second part is up above)
	@GetMapping("/dog")
	public Dog dog() {
		Dog dog = new Dog ("Bella", "brown", 5);
		return dog;
	}

	@GetMapping("/draw")
	public int[][] draw() {
		return new int[][] {
				new int[]{1, 1, 1, 1, 1, 1},
				new int[]{1, 0, 0, 0, 0, 1},
				new int[]{1, 0, 1, 1, 0, 1},
				new int[]{1, 0, 1, 1, 0, 1},
				new int[]{1, 0, 0, 0, 0, 1},
				new int[]{1, 1, 1, 1, 1, 1}};
	}
}
