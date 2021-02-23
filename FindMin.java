class FindMin 
{

	public void getMin(int [] numbers){
		
		int min=Integer.MAX_VALUE;
		int small=0;
		for(int number:numbers){
			
			if(number<min){
				small=min;
			}

		}
		System.out.println(small);
	}
	public static void main(String[] args) 
	{

		FindMin findmin=new FindMin();
		int arr[]={1,5,3};
		findmin.getMin(arr);
		
	}
}
