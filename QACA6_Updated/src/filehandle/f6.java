
package filehandle;

import java.io.FileInputStream;

public class f6 {
	public static void main(String[] args) {
	String path=
	FileInputStream fis=new FileInputStream();
	int data=fis.read();
	char finaldata=(char)data;
	System.out.println(finaldata);
	}
	

}
