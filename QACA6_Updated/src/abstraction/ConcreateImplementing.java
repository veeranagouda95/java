package abstraction;

public abstract class ConcreateImplementing {

	void test() 
	{
		System.out.println("from test()");
	}
	abstract void print();
}


   class b extends ConcreateImplementing{
	
	void print()
	{
		System.out.println("implementation inside class b");
	}
	
	public static void main(String[] args) {
		
		ConcreateImplementing obj=new b(); //upcasting
		obj.test();
		obj.print();
	}

	
}
