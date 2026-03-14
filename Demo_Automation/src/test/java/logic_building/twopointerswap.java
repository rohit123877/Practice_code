package logic_building;

public class twopointerswap {

	public static void main(String[] args) {
		int [] numbs = {1,2,3,4};
	
		int i = 0 , j=numbs.length ;
		System.out.println(numbs.length);
		int i = 0 , j=numbs.length-1 ;
		while(i<j)
		{
			int temp = numbs[i];
			numbs[i] = numbs[j];
			numbs[j] = temp;
			i++;
			j--;
		}
		// TODO Auto-generated method stub
for(int nums:numbs)
{
	System.err.println(nums);
}
	}

}
