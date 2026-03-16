package logic_building;

import java.util.LinkedList;

public class linklistAddRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList <String> linklist = new LinkedList<>();
		linklist.add("BOB");
		linklist.add("marley");
		linklist.add("charlie");
		linklist.add(1,"maria");
		linklist.remove(2);
		System.out.println("Link list after add remove " +linklist);
		
	}

}
