import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class Advance_IO {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        

		String str = "MN";
		int value = 125;
		
		
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter("output.txt");
			pw.println(str); // write a string
			pw.println(value); // write an integer
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
       FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("output.bin");
			for(char c: str.toCharArray())
				fos.write(c);
			fos.write(value);
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("output.bin");
			int next = fis.read();			
			while(next != -1) {
				System.out.println(next);
				next = fis.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
