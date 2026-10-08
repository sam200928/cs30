package skillbuilder;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class myfilep2 
{

	public static void main(String[] args) 
	{
		File textFile;
		String response;
		Scanner input = new Scanner(System.in);
	//create a file
		textFile = new File("C:\\Users\\49118011\\git\\cs30\\chapter11\\src\\skillbuilder\\zzz.txt");
	// check if file exists
		if(textFile.exists())		
		{
			System.out.println("zzz.txt exists.");
		}
		else
		{
		try
		{
			textFile.createNewFile();
		}
		catch(IOException e)
		{
		System.out.println("file could not be created");	
		System.err.println("IOException: " + e.getMessage());
		}
	
	}

}}
