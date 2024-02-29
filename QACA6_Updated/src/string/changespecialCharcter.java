package string;

public class changespecialCharcter {

	public static void main(String[] args) {
		
		String str="veerana @ gouda";
		
		System.out.println(printdiffentspecialcharcter(str));
		
	}
	public static String printdiffentspecialcharcter(String str) 
	{
		return str.replace('@', '_');
	}
}
