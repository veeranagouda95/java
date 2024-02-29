package part1JavaProgram;
//1 2 3 4 
//5 6 7 8
//9 1 2 3
//4 5 6 7
public class pattern13 {
	public static void main(String[] args) {
		int n=4;
		int a=1;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				if (a==10) 
				{
			     a=1;
	 		    }
			
				
				System.out.print(a++ +" ");
			}//inner for loop closed next line will be start
			System.out.println();
			
		}//outer for loop closed 
		
		
	}
}
