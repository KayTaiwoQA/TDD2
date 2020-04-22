package com.qa.testdrivendevelopment;

import java.util.Random;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Questions stringMerge = new Questions();
		
		System.out.println(stringMerge.zipped("String", "Fridge"));
		System.out.println(stringMerge.zipped("Dog", "Cat"));
		System.out.println(stringMerge.zipped("True", "Tree"));
		System.out.println(stringMerge.zipped("return", "letter"));
		
		Questions noDuplicateArray = new Questions();
		
		Random random = new Random();

		for(int i =1; i<5; i++){
			
		      int randomInteger = random.nextInt();
		      if (randomInteger > 100)
		      {
		    	 // randomInteger = 100;
			      System.out.println("Random Integer in Java: " + randomInteger);
		      }

		 }
		
		
	}
}
