package collections1;

import java.util.ArrayList;
import java.util.Iterator;

public class pen {
	int productid;
	String brand;
	double price;
	
	public pen(int productid, String brand, double price) {
		super();
		this.productid = productid;
		this.brand = brand;
		this.price = price;

}
		
		@Override
	public String toString() {
		return "pen [productid=" + productid + ", brand=" + brand + ", price=" + price + "]";
	}
}
public class d1
{
	public static void main(String[] args) {
		ArrayList<pen> ls=new ArrayList();
		ls.add(new pen(101,"classmate",20));
		ls.add(new pen(102,"rendols",25));
		ls.add(new pen(103,"flair",32));
		ls.add(new pen(104,"cello",45));
		System.out.println(ls);
		for (int i = 0; i < ls.size(); i++) {
			pen p=(pen)ls.get(i);
			System.out.println(p.price*1.2);
			
			
		}
			}
}
		

