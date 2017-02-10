// Author: Cori Nicole Bradshaw
// Class: DateType
// This class holds the date = day, month, and year. 


public class DateType {

  private String month;
  private String day;
  private String year;

  public DateType(){
      this.day="";
      this.month="";
      this.year="";

  }
  public DateType(String day,String month,String year){
      this.day=day;
      this.month=month;
      this.year=year;

  }


  public void setMonth(String mo){// setMonth
        month = mo;
  }

  public void setDay(String da){
        day = da;
  }

  public void setYear(String ya){
         year = ya;
  }
  public String getMonth(){
      return month;
  }
  public String getDay(){
      return day;
  }
  public String getYear(){
      return year;
  }

  public String toString(){
        return(day+" "+month+" "+year);
  }

}
