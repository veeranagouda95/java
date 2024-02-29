package sort;

public class student1 {
public static void main(String[] args) {
	student[]s=new student[3];
	s[0]=new student(1,25,"raju");
	s[1]=new student(2,26,"bai");
	s[2]=new student(3,24,"jai");
	for (int i = 0; i < s.length; i++) {
		s[i].display();
	}
	
	
}
}
