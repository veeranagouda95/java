package sort;
////design blue print object with states student id,student name,student age and one display method to display
//details                   create container to store the 5 student object in it display the details of all 
//student
public class student {
int id;
int age;
String name;
public student(int id, int age, String name) {
	super();
	this.id = id;
	this.age = age;
	this.name = name;
}
@Override
public String toString() {
	return "student [id=" + id + ", age=" + age + ", name=" + name + "]";
}
public  void display() {
	System.out.println("details os student");
	System.out.println("student id:"+id );
	System.out.println("student age:"+age);
	System.out.println("student name:"+name);
	System.err.println("-----------------------");
}
}
