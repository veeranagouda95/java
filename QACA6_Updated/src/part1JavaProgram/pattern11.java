package part1JavaProgram;
//e d c b a
//1 2 3 4 5
//e d c b a
//1 2 3 4 5
//e d c b a

public class pattern11 {
public static void main(String[] args) {
	int n=5;
	for (int i = 0; i < n; i++) {
		int a=1;
		char ch='e';
		for (int j = 0; j <n; j++) 
		{
			if(i%2==0) 
			{
				System.out.print(ch +" ");
				ch--;
			}
			else 
			{
				System.out.print(a +" ");
				a++;
			}
			
		}
		System.out.println();
		
	}
}
}
