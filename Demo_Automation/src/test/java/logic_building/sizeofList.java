package logic_building;

import java.util.ArrayList;

public class sizeofList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

                         int[] array = {1,2,3,4,5,6,7,8};
			        // Preallocate capacity to avoid frequent resizing
			        ArrayList<Integer> arraylist = new ArrayList<>(array.length);
			
			        for (int i = 0; i < array.length; i++) {
			        	arraylist.add(i);
			        }
			
			        System.out.println("Size: " + arraylist.size());
			    }
			
	}

