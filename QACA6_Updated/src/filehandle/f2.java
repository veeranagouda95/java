package filehandle;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class f2 {
	public static void main(String[] args) throws FileNotFoundException
	{
		String path="C://QACA6_new/dell/filehandling";
		FileOutputStream fout=FileOutputStream(path+"/f2.txt");//filehandlingf2.txt
		char ch=90;
		fout.write(ch);
		System.out.println("charcter is written into afile...!");
		fout.close();
		
	}
	

}
