package javaprograms;
//in array we have to find sorting array
public class a8 {
	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60,70,80};
		int i=0;
		int j=a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		System.out.println("after reversing");
		for (int j2 = 0; j2 < a.length; j2++) {
			System.out.println(a[j2]+" ");
		}



	}
}
