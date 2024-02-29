package aripathMedamArrayProgram;

public class Largestname {

	public static void main(String[] args) {
		String[] names= {"virat khoil" ,"rohit sharma" ,"kl rahal","sachin tendulkar","tendai chatara"};
		String large=names[0];
		for (int i = 0; i < names.length; i++) 
		{
			if (names[i].length()>large.length()) 
			{
				large=names[i];
			}
		}
		System.out.println(large);
	}
}
