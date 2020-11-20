import java.util.Arrays;
class RemoveDuplicate 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5,6,1,2,3};
		Arrays.sort(a);
		
		int result[]=new int[a.length];
		int j=0;
		
		for(int i=0;i<a.length-1;i++){
			
				if(a[i]!=a[i+1]){
					
					result[j++]=a[i];
				}
				
			
			
		}
		result[j++]=a[a.length-1];
		for(int i=0;i<j;i++){
			System.out.println(" "+result[i]);
		}
		//System.out.println("Hello World!");
	}
}
