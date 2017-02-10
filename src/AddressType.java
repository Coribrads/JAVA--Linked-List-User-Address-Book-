// Author: Cori Nicole Bradshaw
// Class: AddressType
// This class  contains the street address, city, state, and zipcode.


public class AddressType {

    private String streetAddress, city, state, zipCode;


    public void AddressType(){
        streetAddress="";
        city="";
        state="";
        zipCode="";
    }


    public void AddressType(String newStreet,String newCity,String newState,String newZip){
  
        this.streetAddress=newStreet;
        this.city =newCity;
        this.state=newState;
        this.zipCode=newZip;
   
    }

    public void setStreet(String s){
        streetAddress = s;
   }
    public void setCity(String c){
        city = c;
    }
    public void setState(String st){
        state = st;
    }
    public void setZip(String z){
        zipCode = z;
    }

    public String getStreet(){
        return streetAddress;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getZip(){
        return zipCode;
    }


   public String toString(){
    return("\n"+streetAddress +"\n"+city+"\n"+state+"\n"+zipCode+"\n");

   }






}

