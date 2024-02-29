package javaprograms;

public class a13 {
public static void main(String[] args) {
	int []a= {1,3,5,7,9,11,12};
	int[]b= {2,4,6,8,10,12,14,16,18,20};
	int[]res=new int[a.length+b.length];
	int j=0;//hold the index of a and b array
	int i=0;//hold the index of res array
	while(j<a.length && j<b.length) {//if put OR (||) here it get arrayoutof exception
		res[i]=a[j];
		i++;
		res[i]=b[j];
		i++;
		j++;
		
	}
	while(j<a.length)//if  a arrya length is greater
	{
		res[i]=a[j];
		i++;
		j++;
	}
	while(j<b.length)//if b array length is  greater
	{
		res[i]=b[j];
		i++;
		j++;
	}
	for (int k = 0; k < res.length; k++) {
		System.out.println(res[k]);
	}
}
	
}
