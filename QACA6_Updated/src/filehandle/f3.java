package filehandle;


import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class f3 {
	public static void main(String[] args)throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the path");
		String path=sc.nextLine();
		FileOutputStream fos=new FileOutputStream(path);
		System.out.println("enter the data");
		char ch=sc.next().charAt(0);
		fos.write(ch);
		System.out.println("done..");
		
		
	}

}
