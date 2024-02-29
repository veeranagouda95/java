package sort;
//comapring
public class binarysearch3 {
	public static void main(String[] args) {

		String[]a= {"ramesh","rakesh","raju","ambresh"};
		String key="mahesh";
		int count=0;
		for (int i = 0; i <a.length;i++) {


			if(key.equalsIgnoreCase(a[i])) {
				count++;
				break;
			}
		}

		if(count==1)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is not present");
	}
}
