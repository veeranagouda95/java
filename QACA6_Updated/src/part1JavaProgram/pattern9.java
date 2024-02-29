package part1JavaProgram;
//1 2 3 4 5
//a b c d e
//1 2 3 4 5
//a b c d e 
//1 2 3 4 5
public class pattern9 {
public static void main(String[] args) {
	int n=5;
	for (int i = 0; i < n; i++)
	{
		int k=1;
		char ch='a';
		for (int j = 0; j < n; j++) 
		{
			if(i%2==0)
			{
				System.out.print(k++ +" " );
			}
		
		
			else
			{
				System.out.print(ch++ +" ");
			}
		
			//System.out.println();
			
		}
		System.out.println();
		
	}
}
}
