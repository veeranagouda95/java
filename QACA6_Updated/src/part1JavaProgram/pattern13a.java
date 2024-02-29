package part1JavaProgram;
//1 2 3 4
//5 6 7 8 
//9 1 2 3 
//4 5 6 7
public class pattern13a {
 public static void main(String[] args) {
	int n=4;
	int a=0;
	for (int i = 0; i < n; i++) 
	{
		for (int j = 0; j < n; j++) 
		{
			System.out.print(a%9+1 +" ");
			a++;
			
		}
		System.out.println();
		
	}
}
}
