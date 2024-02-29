package part1JavaProgram;
//1 2 3 4 5
//A B C D E
//$ $ $ $ $
//A B C D E
//1 2 3 4 5
public class pattern14 {
public static void main(String[] args) {
	int n=5;
	for (int i = 0; i < n; i++)
	{
		int a='A';
		int b=1;
		for (int j = 0; j < n; j++)
		{
			if(i==2)
			{
				System.out.print("$" +" ");
			}
		//	System.out.println();
			else if(i%2==0)
			{
				System.out.print(b++ +" ");
				
			}
			else if(i%2==1)
			{
			
			System.out.print(a++ +" ");
		}
			else {
				System.out.println();
			}
		
	}
		System.out.println();
	
}
}
}