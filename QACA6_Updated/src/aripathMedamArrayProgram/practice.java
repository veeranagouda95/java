package aripathMedamArrayProgram;

public class practice{

	public static void main(String[] args) {
		
		//remove the dupicate in arrya
		
		
	//	String s="veeranagouda";
		//char[]ch=s.toCharArray();
		int[]a= {1,23,5,23,4,5,7,7,6,6};
		for (int i = 0; i < a.length; i++) 
		{
			
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]>a[j]) 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
			
			
		
	}
}
	
	
	
		
	

