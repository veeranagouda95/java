package sort;
//binary search:to do binary seach in array should be sorrted in ascending or descending order
import java.util.Scanner;

public class BINARYSEARCH {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of arrya");
	int size = sc.nextInt();
	int []a=new int[size];
	System.out.println("enter elemnts of arrya ");
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	int low=0;
	int high=a.length-1;
	int key=50;
	int count=0;
	while(low<=high)
	{
		int mid=(low+high)/2;
		if(key==a[mid]) {
			count++;
			break;
			
		}
		else if(key>a[mid])
			low=mid+1;
		else
			high=mid+1;
		
	}
	if(count==1)
		System.out.println("key element is found");
	else
		System.out.println("key element is not found");
	
	
}
	

}
