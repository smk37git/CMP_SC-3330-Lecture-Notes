package exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("./files/notes.txt"));
			
			int a = 5;
			int b = 0;
			int c = a/b;
		}
		catch (IOException e | Arithmetic Exception) {
			System.out.println("This is the IO Exception");
			e.printStackTrace();
		}
		finally {
			System.out.println("This is the finally block!");
		}
		
		System.out.println("Let's see if you can print this");

	}

}
