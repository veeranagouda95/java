package javaprograms;
//write java program find out smallest element in given array
public class a3 {
	public static void main(String[] args) {
		int[]a= {10,5,30,50};
		int small=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println(small);
	}
}