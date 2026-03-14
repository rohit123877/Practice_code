package logic_building;

import java.util.ArrayList;

public class removeLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> fruits = new ArrayList<>();
fruits.add("Mango");
fruits.add("Pineapple");
fruits.add("banana");
fruits.add("cherry");
fruits.remove("Mango");
System.out.println(fruits);
fruits.add(2,"apple");
System.out.println("after update " +fruits.get(2));
System.out.println(fruits);

	}

}
