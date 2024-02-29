package javaprograms;

public class a17 {
	public static void main(String[] args) {
		int []a= {1,3,5,7,9,11,12};
		int[]b= {2,4,6,8,10,12,14,16,18,20};
		int[]res=new int[a.length+b.length];
		int j=0;//hold the index of a and b array
		int i=0;//hold the index of res array
		while(j<a.length &&j<b.length) {
		//res[0]=a[0];
		//res[9]=b[4];
	//	while(j<b.length-1 && j<a.length-1)
		//	if(res[i%2==1]) {
				res[i]=b[j];
				i++;
				j++;
			}
		else
			{
				res[i]=a[j];
				i++;
				j++;


				//}
				for (int k = 0; k < res.length; k++) {
					System.out.println(res[k]);
				}
			}
	}
}