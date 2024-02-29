package part1JavaProgram;
//1 A 2 B
//3 C 4 D
//5 E 6 F
//7 G 8 H
public class pattern10 {
	public static void main(String[] args) {
		int n=4;
		for (int i = 0; i < n; i++)
		{
			char ch='A';
			int a=1;
			for (int j = 0; j < n; j++) 
			{
				if(j%2==0)
				{
					System.out.print(a +" ");
					a++;
				}
				else 
				{
					System.out.print(ch +" ");
					ch++;	
				}

			}
			System.out.println();

		}

	}
}
