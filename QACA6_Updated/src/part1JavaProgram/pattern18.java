package part1JavaProgram;
//*
// *
//  *
//   *
public class pattern18 {
public static void main(String[] args) {
	int n=4;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if(i==j)
			{
				System.out.print("*"+"" );
			}
			else
			{
				System.out.println("*");
				
			}
			
		}
		System.out.println();
	}
}
}
