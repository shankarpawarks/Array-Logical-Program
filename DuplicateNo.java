class DuplicateNo 
{
	public static void main(String[] args) 
	{
		int givenNumber[]={1,2,3,4,5,3,2};
		
		for(int i=0;i<givenNumber.length-1;i++){
			for(int j=i+1;j<givenNumber.length;j++){
				if(givenNumber[i]==givenNumber[j]){
					System.out.println(givenNumber[j]);			
				}
			}
		}
		
	}
}
