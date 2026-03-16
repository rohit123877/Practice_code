package logic_building;

import java.util.Arrays;

public class resizeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] oldArray = {1,2,3};
		int [] newArray = new int [5];
		
				for(int i=0; i<oldArray.length;i++)
				{
					newArray[i]=oldArray[i];
				}
				System.out.println(Arrays.toString(newArray));
		}

	}


