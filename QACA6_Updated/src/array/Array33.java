
//WAJP to design a blue print of student object with the states student_id,student name,Student age, and  create one display method to display the details of student
package array;

import java.util.Scanner;

public class Array33 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students data to be store");
		int size=sc.nextInt();
		Student s[]=new Student[size];
		System.out.println("Enter the below mentioned details of the student");
		for(int i=0;i<s.length;i++)
		{
			sc.nextLine();
			System.out.println("Enter the name of the student");
			String name=sc.nextLine();
			System.out.println("Enter the age of the student");
			int age=sc.nextInt();
			Student s1=new Student(name, age);
			s[i]=s1;
			System.out.println("Student record stored successfully");
		}
		System.out.println("The students details as per the records");
		System.out.println();
		for(int i=0;i<s.length;i++)
		{
			s[i].display();
		}
	}
}