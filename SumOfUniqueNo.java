import java.util.Scanner;
import java.util.Arrays;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class SumOfUniqueNo 
{
	public static void main(String[] args)throws IOException 
	{

		
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER ELEMENT ...");
		/*
		 * split("\\s+")            ::- will split the string into string of array with separator as space or multiple spaces. 
		 * \s+ is a regular expression for one or more spaces.
		 * 
		 * 
		 * The Integer::parseInt()  ::- is equal to lambda expression String str -> Integer.parseInt(str), 
		 * hence used to convert each number String to the int value.
		 * 
		 * toArray()                ::-used for converting ArrayList to Array
		 * */

		
		int []input=Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		
		Arrays.sort(input);
		

		

		int temp[]=new int [input.length];
		int j=0;
		
		int sum=0;
	
		
		
		for(int i=0;i<input.length-1;i++){
			if(input[i]!=input[i+1])
				
				temp[j++]=input[i];
			
		}

		temp[j++]=input[input.length-1];
			
			for(int i=0;i<j;i++){
				sum=sum+temp[i];
			
		}
		System.out.println("unique sum is ::-"+sum);
	}
}
