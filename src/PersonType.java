// Author: Cori Nicole Bradshaw
// Class: PersonType
// This class holds the information for the persons first and last name. 


public class PersonType{
    private String firstName;
    private String lastName;

    public PersonType(){
        firstName = "";
        lastName = "";
    }

    public PersonType(String firstname, String lastname){
        firstName = firstname;
        lastName = lastname;
    }

    public void setFirst(String fn){
       firstName = fn;
    }
    public void setLast(String ln){
       lastName = ln;
    }

    public String getlastName(){
        return (lastName);
    }
    public String getfirstName(){
        return (firstName);
    }
    public char getlastChar(){
        char last = lastName.charAt(0);
        return last;
    }

    public void newPerson(String first, String last){
         firstName = first;
         lastName = last;
    }

    public String toString(){
        return (firstName+" " +lastName+"\n");
    }

}
