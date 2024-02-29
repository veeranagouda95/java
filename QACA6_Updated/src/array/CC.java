package array;

public class CC {
public static void main(String[] args) {
	int a=10;
	int b=40;
	int sum=0;
	while(b!=0)
	{
		int carry=(a&b);
		a=a^b;
		b=carry<<1;
	}
	sum=a;
	System.out.println(sum);
	
	
}
}
