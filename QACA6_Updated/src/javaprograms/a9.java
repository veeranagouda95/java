package javaprograms;
//to find the given array find out prime number only
public class a9 {
	public static void main(String[] args) {
		int[]a= {10,20,23,29,13};
		for (int i = 0; i < a.length; i++) {
			boolean res=isprime(a[i]);
			if(res) {
				System.out.println(a[i]);
			}
		}
	}

	public static boolean isprime (int n) {
		int i=2;
		while(i<=n/2) {
			if(n%i==0)
			{
				return false;
			}
			i++;
		}
		return true;
	}
}

