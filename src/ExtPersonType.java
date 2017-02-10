// Author: Cori Nicole Bradshaw
// Class: ExtPersonType
// This class extends/inherits from class PersonType.
// this class holds everything from persontype including address, dob, phone number, and status. 


public class ExtPersonType extends PersonType{

  // variables
  private AddressType address;
  private DateType dob;
  private String phoneNumber;
  private String status;


  public  ExtPersonType(){

      // first constructor for initializing variables
      super(" "," ");
      address = new AddressType();
      dob = new DateType(" "," "," ");


  }
    public void setDob(String mo, String da, String ya){
        dob.setMonth(mo);
        dob.setDay(da);
        dob.setYear(ya);
    }
    public void setAddress(String st, String c, String stat, String zip){
        address.setStreet(st);
        address.setCity(c);
        address.setState(stat);
        address.setZip(zip);
    }

    public void setPhoneNumber(String num){
        phoneNumber = num;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setStatus(String sta){
        status = sta;
    }
    public String getStatus(){ // call for UC4DisplayStatus
        return status;
    }
    public String getMonth(){

      return dob.getMonth(); // call getMonth to get the month of Person from file
                             // this is used to easily locate the month for UC3DisplayMonth
    }

   public String toString(){
       return (super.toString()+dob.toString()+address.toString()+phoneNumber + "\n"+status);
    }

}

