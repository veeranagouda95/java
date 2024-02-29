package array;

public class Student {
	int s_id=100;
	String s_name;
	int S_age;
	static int count=100;
	{
		count++;
		this.s_id=count;


	}
	public Student(){}
	public Student(String s_name, int s_age) {
		super();
		this.s_name = s_name;
		S_age = s_age;
	}
	public void display()
	{
		System.err.println("*********************************************");
		System.out.println("Student id  : "+s_id);
		System.out.println("Student name: "+s_name);
		System.out.println("Student age : "+S_age);
		System.err.println("*********************************************");

	}


}
