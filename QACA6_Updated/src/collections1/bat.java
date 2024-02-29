package collections1;

public  class bat implements Comparable<Object>
 {
	String brand;
	double price;
	public bat(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "bat [brand=" + brand + ", price=" + price + "]";
	}
	public int comprableTo(Object o) {
		bat b=(bat) o;
		if(this.price>b.price)
			return 1;
		else if(this.price<b.price)
			return -1;
		else
			return 0;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
