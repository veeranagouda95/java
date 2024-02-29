package string;
//wajp to count occurence of each character in a string(Duplicate character)
public class s1 {
	public static void main(String[] args) {
		String str="sheela";
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length;i++)
		{
			System.out.println(ch[i]);

		}
		System.out.println("after tocharArryamethod we will get");
	for (int i = 0; i < ch.length; i++) {
		int count=0;
		if(ch[i]==ch[i+1]) {
			count++;
			break;
		}
		System.out.println(ch[i]);
		
	}
		
//	System.out.println(ch[i]);	
		
	}
}

