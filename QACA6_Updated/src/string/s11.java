package string;
//wajp to print pattern in right angle trianle 
public class s11 {
	public static void main(String[] args) {
		String s="Bangalore*";
		char [] ch=s.toCharArray();//this method will converted string into charcters
		int n=4;
		int k=0;
		for (int i = 0; i < n; i++)
		{//first for loop
			for (int j = 0; j < n; j++)
			{//second for loop
				if(i>=j)//this will give RT angle  form 
				{
					System.out.print(ch[k++]);
					
			 	}
				else 
				{
					System.out.print(" ");

				}

			}//end of the  second loop
			System.out.println( );
		}//end of the first for loop
	}
	
}
