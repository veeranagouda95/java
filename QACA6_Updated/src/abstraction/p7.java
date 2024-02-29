package abstraction;

abstract class p7 {
 p7() //constractor is possible
 {
	 System.out.println("hi");
 }
	
 public static void main(String[] args) {
	System.out.println("bye");
	p7 obj=new p7();  //object create not possible
	System.out.println(obj);
}
}


