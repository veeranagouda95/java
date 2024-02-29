package aripathMedamArrayProgram;

public class frequencyOfElementOneNUmberRepeated {

	public static void main(String[] args) {
		int[]a= {10,10,20,50,50,70,70,70,90};
		boolean[]b=new boolean[a.length];
		for (int i = 0; i < b.length; i++) 
		{
			int count=0;
			if (b[i]==false) 
			{
				for (int j = i+1; j < b.length; j++) 
				{
					if (a[i]==a[j])
					{
						count++;
						b[j]=true;
					}
				}
				System.out.println(a[i]+"==>"+count);
			}
		}
		
	}
}
