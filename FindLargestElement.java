import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;


class FindLargestElement 
{
	public static void main(String[] args)throws Exception 
	{
		System.out.println("ENTER NUMBER...");
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		int arr[]=Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		
		int k=1;
		
	
		
		for(int i;i<=arr.length-1;i++){

			for(int j=i+1;j<arr.length;j++){
				
							if(arr[i]<arr[j]){
					
								int	temp=arr[i];
								arr[i]=arr[j];
								arr[j]=temp;
				}
			}
			if(i==k){
			System.out.println(arr[i]);
		//	break;
		}	

		}
		
		
	}
}
