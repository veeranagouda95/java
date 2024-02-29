package collections1;

import java.util.ArrayList;

public class book {
	int id;
	String title;
	double price;
	book(){}
	public book(int id, String title, double price) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "book [id=" + id + ", title=" + title + ", price=" + price + "]";
	}
}

//public class g1
//{
///public static void main(String[] args) {
//		ArrayList<book> bs
//	}
//}



