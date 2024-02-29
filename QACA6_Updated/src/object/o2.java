package object;

public class o2 {
int i;
o2(){}
o2(int i)
{
this.i=i;
}
public String toString()
{
	return i+"";
}
}
 class o3{
	public static void main(String[] args) {
		o2 obj=new o2();
		System.out.println(obj);
	}
}