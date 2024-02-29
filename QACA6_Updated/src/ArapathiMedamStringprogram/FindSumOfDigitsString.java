package ArapathiMedamStringprogram;

public class FindSumOfDigitsString {

	//main method
	public static void main(String[] args) {
		 
		//take one string 
		String s="veeranagouda12345";
		
		//convert char by char 
		char[]ch=s.toCharArray();
		
		// sum all the digits i need sum container
		int sum=0;
		
		//al the char extract one by using for loop
		for (int i = 0; i < ch.length; i++) 
		{
			//if the digits sum taken it find in 48 to 57 
			if (ch[i]>='0' && ch[i]<='9') 
			{
				sum=sum+(ch[i]-48);
			}
		}
		System.out.println(sum);
	}
}
