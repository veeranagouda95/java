package part1JavaProgram;
//write simple program for pattern
//1 2 3 4 
//5 6 7 8
//9 10 11 12 
//13 14 15 16
public class pattern12 {
public static void main(String[] args) {
	int n=4;
	int a=1;
	for (int i = 0; i < n; i++) 
	{
		for (int j = 0; j < n; j++) 
		{
			System.out.print(a++ +" ");
			
		}
		System.out.println();
	}
}
}
