package skillbuilder;
import java.io. *;
import java.util.Scanner;
public class myfilep1 {

	public static void main(String[] args) 
	{
 // do not use scanner to access files
		
		File textFile;
String fileName;
		Scanner input = new Scanner(System.in);
	// obtain file name
		System.out.println("enter file name: ");
	fileName = input.next();
	textFile = new File(fileName); 
	if(textFile.exists())
	
	{
		System.out.println("file does exist.");
		
		
	}
	else {
			System.out.println("file does not exist.");

	}
	}
}
