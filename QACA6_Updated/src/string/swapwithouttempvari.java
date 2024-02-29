package string;
//wajp to swap the two strings without using tempavary container
import java.util.Scanner;

public class swapwithouttempvari {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter two String");
	String s1 = sc.next();
	String s2=sc.next();
	System.out.println("before sorting");
	System.out.println("s1 :"+s1);
	System.out.println("s2 :"+s2);
	s1=s1+s2;                         
	s2=s1.substring(0, s1.length()-s2.length());
	s1=s1.substring(s2.length());
	System.out.println("after sorting");
	System.out.println("s1 :"+s1);
	System.out.println("s2 :"+s2);
	
	//with help tempvary container
	//String temp=s1;
	//s1=s2;
	//s2=temp;
}


}
