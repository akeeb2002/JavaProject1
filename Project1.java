//Name: Khandaker Hossain
//Lab 11A-Li

import java.io.IOException;
/**
 * Here the main program is being executed
 * "throws IOException" is used in the main method because we are dealing with a file operation
 * Dates.txt is the name of the text file that's passed to the "DateGUI" file that's being called
 */
public class Project1 {
	public static void main(String[] args) throws IOException
	{
	  new DateGUI("Dates.txt");
	}
	
	}
