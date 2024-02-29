package string;
//wajp to find sum of digits in given string
public class a3 {
public static void main(String[] args) {
	String s="abc1234de";
	
	//i need the sum container to add the values 
	int sum=0;
	
	//i will sepearte the eack charcter into one by one tochararrya
	char []ch=s.toCharArray();
	
	//repeat the process again and we need use loops
	for (int i = 0; i < ch.length; i++)
	{
		
		//if the digits are to be 0 to 9 only 
		if(ch[i]>='0' && ch[i]<='9')//here the data will be and(&) i can replace with OR(||) operator we will get the 265 count ascii values
		{
			sum=sum+(ch[i]-48);//here take the value to 48 in hexdecimal value start with 48 
		}
	}
	System.out.println(sum);
}
}
