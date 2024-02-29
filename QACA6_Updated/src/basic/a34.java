package basic;

public class a34 {
public static void main(String[] args) {
	int n=4;
	for (int i = 1; i < n; i++)
	{
		for (int j = 1; j < n; j++) 
		{
			if(i==n-1 || j==n-1|| i==0 ||j==0) 
			{
				System.out.print("* ");
			}
			else {
				System.out.println("*");
			}
				
			
		}
		
	}
}
}