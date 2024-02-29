package string;

public class charArrytostring {
public static void main(String[] args) {
	char[]ch= {'a','p','e'};
	String s=new String(ch);
	System.out.println(s);
	
	//one more method
	char[]ch1= {'g','o','u','d','a'};
	String s1=String.valueOf(ch1);
	System.out.println(s1);
	
	//without using built in member
	char[]ch2= {'v','e','e','r','a','n','a'};
	String s2="";
	for (int i = 0; i < ch2.length; i++) 
	{
		s2=s2+ch2[i];
		
	}
	System.out.println(s2);
	
	boolean[]b= {true,false,true,false};
	String s5=String.valueOf(false);
	System.out.println(s5);
	
	String s4=String.copyValueOf(ch1);//it will convert copyvalue present in the different
	System.out.println(s4);
	
	String y = String.valueOf(s1);//it take object has cnvert into string type 
	//if any type of primitive data type (int,float)it will converted with respect non-primitive data type(wrapper class) 
			System.out.println(y);
	}

}
