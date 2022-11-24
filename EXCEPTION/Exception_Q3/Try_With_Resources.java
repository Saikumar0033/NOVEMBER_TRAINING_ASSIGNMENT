package Exception_Q3;

import java.io.*;

public class Try_With_Resources  {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileInputStream input = new FileInputStream("file.txt");){
			int data = input.read();
	        while(data != -1){
	            System.out.print((char) data);
	            data = input.read();
	        }
		}
	}
}

