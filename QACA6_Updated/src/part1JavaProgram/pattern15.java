package part1JavaProgram;
//*
//**
//***
public class pattern15
{
public static void main(String[] args) 
{
	int n=4;
	for (int i = 0; i < n; i++) 
	{
		for (int j = 0; j < n; j++) 
		{
			if(j==0|| i==j) 
			{
				System.out.print("*" +" ");
			}
			
		}
		System.out.println("  ");
	}
}
}
