public class Date212 {
//private instance variables that will store the year, month and day
private int year;
private int month;
private int day;

//Constructor that will separate the string that it takes and store them in the instance variables
//substring is the method used to separate the string
public Date212(String yyyymmdd) throws Exception {
	this.year = Integer.parseInt(yyyymmdd.substring(0,4)); 
	this.month = Integer.parseInt(yyyymmdd.substring(4,6));
	this.day = Integer.parseInt(yyyymmdd.substring(6));
} //Constructor

//Getters used to get access to the private instance variables
public int getDay(){return day;}
public int getMonth(){return month;}
public int getYear(){return year;}

//Setters used to set or change values of the private instance variables
public void setDay(int day){this.day = day;}
public void setMonth(int month){this.month = month;}
public void setYear(int year){this.year = year;}

//returns the date(s) as a string
public String toString() {
	return convertMonth(month) + " " + day + "," + year;}


//method that checks if the dates are equal
public boolean equals(Date212 other){
	if (this == other){
		return true;
	} //if equal, return true
	if (other != null && this.getClass().equals(other.getClass())){
		Date212 o = (Date212) other;
		if (year == o.year && month == o.month && day == o.day){
			return true; //if the year, month and day are equal then return true
		} else return false;
	}
	return false;
}


//This method is used to compare the elements of the array with each other so we know if it needs to be sorted
//if yes then later we can sort it in the DateGUI file
public int compareTo(Date212 other) 
{
  //Checks if the years are the same
  if (this.year < other.year)
  {
      return -1;
  }
  else if (this.year > other.year)
  {
      return 1;
  }
  //Checks if the months are the same if years turn out to be the same
  else
    {
      if (this.month < other.month)
      {
          return -1;
      }
      else if (this.month > other.month)
      {
          return 1;
      }
      //Then if the Months are also the Same then it checks the Days
   else
  {
       if (this.day < other.day)
       {
           return -1;
       }
       else if (this.day > other.day)
       {
           return 1;
       }
  }
}
return 0;
}


//Here an integer is being taken in while a string value is being returned
//The Method is converting the integer values(numbers/digits) to months
public String convertMonth(int num) {
    switch (num) { //It's going to switch between all the cases 
    //based on what the number is then return the month which is a string
        case 1: return "January";
        case 2: return "February";
        case 3: return "March";
        case 4: return "April";
        case 5: return "May";
        case 6: return "June";
        case 7: return "July";
        case 8: return "August";
        case 9: return "September";
        case 10: return "October";
        case 11: return "November";
        case 12: return "December";
        default: return "error"; //if it doesn't fit any of the cases then it returns "error"
    }
}



}