package logic_building;

public class updateArray {

	public static void main (String[]arg)
	{
		int [] Score= {1,2,3,4,5};
		Score[2]=10;
		for(int score:Score)
		{
		System.out.println("the updated score is " +score);
		}
	}
}
