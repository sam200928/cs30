package skillbuilder;
import java.io. *;
import java.util.Scanner;
public class myfilep1 {

	public static void main(String[] args) 
	{
 // do not use scanner to access files
		
		File textFile;
String response;
		Scanner input = new Scanner(System.in);
	// obtain file name
		System.out.println("enter file name: ");
	response = input.next();
	textFile = new File(response); 
	if(textFile.exists())
	
	{
		System.out.println("file does exist.");
		
		
	}
	else {
			System.out.println("file does not exist.");

	}
	
	// del if user wants
	System.out.println("would you like to (k)eep or (d)elete file");
	response = input.next();
	if(response.equalsIgnoreCase("d"))
	{
		if(textFile.delete())
		{
			System.out.println("file is gone");
		}
	
	}
	else
	{
		System.out.println("file is kept");
	}
}
}
