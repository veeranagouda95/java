package collections1;
//to sort arraylist
public class marker implements Comparable
{
	int id;
	String color;
	double price;
	public marker(int id, String color, double price)
	{
		super();
		this.id = id;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString()
	{
		return "marker [id=" + id + ", color=" + color + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Object o) 
	{
		marker m=(marker) o;
		if(this.id>m.id)
			return 1;
		else if(this.id<m.id)
			return -1;
		else
		return 0;
	}
	/*public int compareTo(Object o) 
	{
		marker m=(marker) o;
		if(this.color>m.color)
			return 1;
		else if(this.color<m.color)
			return -1;
		else
		return 0;
	
	

}*/
}
