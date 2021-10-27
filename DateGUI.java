import java.awt.*;
import java.io.*;
import java.util.StringTokenizer;
import javax.swing.*;

//Inherits from another class
public class DateGUI extends JFrame{
	private JFrame DateGUI;
	//Info from the file
	private String wordinfile;
	//The Date212 file that stores the array of dates
	private Date212 [] Date;
	//Takes the string
	private StringTokenizer Token;
	//store the number of strings
	private int Acounter;
	
	
	public DateGUI (String filename) {
		DateGUI=new JFrame();
	    DateGUI.setLayout(new GridLayout(1, 2, 10, 10));
	      DateGUI.setSize(500,500); //The GUI size
	      DateGUI.setLocation(100, 100); //GUI location
	      DateGUI.setTitle("Date From File");
	      DateGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Layout
	      DateGUI.setVisible(true);
	      jframefile(filename); //Calls method to read file
	      Sort(); //Sort method called
	}
	//File gets a string value from main that reds the file
	//the constructor is called to store the values to Date[]
	//The value is stored in Date[] and then printed
	
	public void jframefile(String readfile) {
		Date = new Date212[50]; //array assignment
		Acounter = 0;
		TextFileInput file = new TextFileInput(readfile); //TextFileInput class/file called
	    Container mycontentpane=DateGUI.getContentPane();
	      TextArea myTextArea = new TextArea();
	      mycontentpane.add(myTextArea,BorderLayout.WEST);
	    
	    wordinfile = file.readLine();
	    while(wordinfile != null) {
	    	Token = new StringTokenizer(wordinfile,",");
            while(Token.hasMoreTokens()) {
                myTextArea.append(Token.nextToken()+"\n");
                try {
                    Date212 date = new Date212(Token.nextToken());
                    Date[Acounter++]=date;
                }
                catch(Exception Error){
                    System.out.println("Can't be read");
                }
            }
            wordinfile = file.readLine();
        }

	    }
	
	//Sorts the dates stored in Date[] then it calls the toString method which sets each date to print
	
	
	public void Sort() {
	    Container mycontentpane=DateGUI.getContentPane();//Interface between component
	      TextArea TextA = new TextArea();//Text Display
	    mycontentpane.add(TextA,BorderLayout.EAST);//Layout

	        for (int i = 0; i < Acounter - 1; i++)//Sorts the Dates in order
	           {
	            int a = i;
	            for (int b = i + 1; b < Acounter; b++)
	                if (Date[b].compareTo(Date[a]) <0) 
	                {
	                    a = b;
	                }
	            Date212 temp = Date[a];
	            Date[a] = Date[i];
	            Date[i] = temp;
	           }//sorting

	        String PrinttoTextArea = "";
	        for(int i = 0;i<Acounter;i++) {
	                PrinttoTextArea =PrinttoTextArea+ Date[i].toString();
	                if(i!=Acounter-1)
	                {PrinttoTextArea= PrinttoTextArea+"\n";}
	        }
	        TextA.append(PrinttoTextArea);
	        }
	
	}
