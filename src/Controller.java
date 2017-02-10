// Author: Cori Nicole Bradshaw
// Class: Controller
// This class is the Controller following the MVC model. 
// It contains an object for View and AddressBook. 

public class Controller{

    private View v1 = new View();
    private AddressBook a1 = new AddressBook();

    public Controller(){
        //empty constructor

    }
    public void UC1LoadData(){
    a1.LoadData();
    }
    public void UC2DisplayData(){
    a1.DisplayData();
    }
    public void UC3DisplayNameMonth(){
    v1.getBirthdayMonthUC3();
    a1.DisplayNameMonth();
    }
    public void UC4DisplayNameStatus(){
    v1.getRelationshipStatusUC4();
    a1.DisplayNameStatus();

    }
    public void UC5AddNewEntry(){
    v1.getAddNameUC5();
    a1.AddNewEntry();
    }
    public void UC6DeleteEntry(){
     v1.getDeleteNameUC6();
     a1.DeleteEntry();
    }
    public void UC7SaveData(){
    a1.SaveData();
    }
}
