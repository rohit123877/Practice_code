package logic_building;

import java.util.Collections;
import java.util.LinkedList;

public class reverselinklistString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList <String> name = new LinkedList<>();
		name.add("one ");
		name.add("two ");
		name.add("Three");
		name.add("Four");
		name.add("Five ");
		System.out.println("All the orignal names " +name);
		Collections.reverse(name);
		System.out.println("After swap name is " +name);
	}

}
