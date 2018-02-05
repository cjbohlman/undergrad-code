/*-------------------------------------------------------------------
 * 
 Class CalenderDate
 
 Author: Chris Bohlman
 
 Purpose: 
 
 Inherits from: None
 
 Interfaces: None
 
 _____________________________________________________________________
 
 Constants:
 
 _____________________________________________________________________
 
 Constructors:
 
 Class Methods:
 
 Instance Methods:
 
 -------------------------------------------------------------------*/

//The class
public class CalenderDate {
  
  private int year, month, day;
  private String Month;
  
  //The constructor
  public CalenderDate(int year, int month, int day) {
    
    this.year = year;
    this.month = month;
    this.day = day;
  }
  
  //The methods
  public void setDate (int year, int month, int day) {
    if (year<1753) {
      year = 1753;
      month = 1;
      day = 1;
    }
    if (month<1) {
      month = 1;
    }
    if (month>12) {
      month = 12;
    }
    if (day<1) {
      day  = 1;
    }
    if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
      if (day>31) {
        day = 31;
      }
    }
    if (month==4||month==6||month==9||month==11) {
      if (day>30) {
        day = 30;
      }
    }
    if (month==2) {
      if (year%4==0 && year %100!=0) {
        if (day>29) {
          day = 29;
        }
      }
      else {
        if (day>28) {
          day = 28;
        }
      }
    }
  }
  
  public int getYear() {
    return year;
  }
  
  public int getMonth() {
    return month;
  }
  
  public String getMonthAsString() {
    if (month==1) {
      Month = "January";
    }
    if (month==2) {
      Month = "February";
    }
    if (month==3) {
      Month = "March";
    }
    if (month==4) {
      Month = "April";
    }
    if (month==5) {
      Month = "May";
    }
    if (month==6) {
      Month = "June";
    }
    if (month==7) {
      Month = "July";
    }
    if (month==8) {
      Month = "August";
    }
    if (month==9) {
      Month = "September";
    }
    if (month==10) {
      Month = "October";
    }
    if (month==11) {
      Month = "November";
    }
    if (month==12) {
      Month = "December";
    }
  return Month;
  }
  
  public int getDay() {
    return day;
  }
  
  public String toString() {
    return Month+ " " +day+ " " +year;
  }
    public boolean equals (CalenderDate otherDate) {
      boolean equalCalender = false;
      if (otherDate.year==this.year && otherDate.month == this.month && otherDate.day == this.day) {
        return !equalCalender;
      }
      return equalCalender;
    }
  
  public String tomorrow() {
    if (day==31){
      if (month==1||month==3||month==5||month==7||month==8||month==10) {
        if (day==31) {
          day = 1;
        }
        else {
          day++;
        }
      }
    }
    
    if (month==4||month==6||month==9||month==11) {
      if (day==30) {
        day = 1;
      }
      else {
        day++;
      }
    }
    if (month==2) {
      if (year%4==0 && year %100 != 0) {
        if (day==29) {
          day = 1;
        }
      }
      else if(day==28) {
        day = 1;
      }
      else {
        day++;
      }
    }
    month++;
    
    if (month==1) {
      Month = "January";
    }
    if (month==2) {
      Month = "February";
    }
    if (month==3) {
      Month = "March";
    }
    if (month==4) {
      Month = "April";
    }
    if (month==5) {
      Month = "May";
    }
    if (month==6) {
      Month = "June";
    }
    if (month==7) {
      Month = "July";
    }
    if (month==8) {
      Month = "August";
    }
    if (month==9) {
      Month = "September";
    }
    if (month==10) {
      Month = "October";
    }
    if (month==11) {
      Month = "November";
    }
    if (month==12) {
      Month = "December";
    }
    return Month+ " " +day+ " " +year;
  }
  
}