package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

	/*
	 	1)FileNotFoundException: 
	 		a)The file with the specified path does not exist
	 		b)If the file is unaccessible
	    2)IOException:
	        a)It can handle all exceptions about Input and Output
	    Note: IOException is the parent of FileNotFoundException
	    Note: If you are using IOException Class, no need to use FileNotFoundException Class
	    
	    Note: When you see an Exception, you have 2 options
	    		a)Using "throws" declaration in the method name line
	    		b)Using try-catch block
	 */

public class E01 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("src/day27exceptionsX/TextFile01");
		
		int i = 0;
		while((i = fis.read()) != -1) {
			System.out.print((char)i);			
		}		
		fis.close();
	}

}
