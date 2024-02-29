package sort;

import java.util.Arrays;
// to sort elemnts of arrya we have method known sort which is present inside in built class knowns as arrys
//sort static method 
//sort is overloaded method
//array built in class  present java.util.pacakge;
//Arrays.sort(array refernce variable)
//by using sort method only in ascending order 
//to sort elements both in ascending and descending order we go different types sorting techinque
//1)bubble sort,selection sort,quick sort,heap sort,insertion sort,merge sort types
public class s1 {
public static void main(String[] args) {
	int[]a= {10,5,15,12,20};
//	int[]a={10,5,-1,12,20};it will take negative take it
//	int []a= {10,5,(int) 0.2,12,20};//in arrya we pass decimal only one element you can do the typecast operter
	System.out.println("before sorting");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	Arrays.sort(a);
	System.out.println("after sorting");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
}
}
