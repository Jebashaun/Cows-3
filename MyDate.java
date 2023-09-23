
public class MyDate {
  int day;
  int month;
  int year;
    
  public MyDate(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }
  
  public int getDay(){
    return day;
  }
  
  public int getMonth(){
    return month;
  }
  
  public int getYear(){
    return year;
  }
  
  public String toString(){
    return month + "\\" + day + "\\" + year;
  }
  
  public boolean equals(MyDate otherDate){
    return (day == otherDate.getDay()) && (month == otherDate.getMonth()) && (year == otherDate.getYear());
  }
  
  public int compareTo(MyDate otherDate){
      if (year < otherDate.getYear()){
        return -1;
      } else if (year > otherDate.getYear()){
        return 1;
      } else if (month < otherDate.getMonth()){
        return -1;
      } else if (month > otherDate.getMonth()){
        return 1;
      } else if (day < otherDate.getDay()){
        return -1;
      } else if (day > otherDate.getDay()){
        return 1;
      } else {
        return 0;
      }
      
  }
    
    
}
