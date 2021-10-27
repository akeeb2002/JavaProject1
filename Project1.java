//Name: Khandaker Hossain
//Lab 11A-Li
//This is a Java Project that takes the numbers from a text file and
//prints them as dates in the order of oldest to newest in a GUI


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