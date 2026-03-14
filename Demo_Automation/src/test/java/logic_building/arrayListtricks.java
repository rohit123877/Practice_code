package logic_building;

import java.util.ArrayList;

public class arrayListtricks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     ArrayList<String> animals = new ArrayList<>();
	            animals.add("Dog");
	             animals.add("Cat");
	            animals.add("Bird");
	     
	         System.out.println(animals.contains("Cat")); // true
	             System.out.println(animals.indexOf("Bird")); // 2
	             System.out.println("the value before swap" +animals);
	     
	           // Replace "Cat" with "Tiger"
	            animals.set(2, "Tiger");
	     
	          System.out.println(animals);
	       }
	     
}