// Author: Cori Nicole Bradshaw
// Class: View
// This class uses the MVC model. 
// View displays a gui to the user. All the user does is select from the menu and enter the required fields. 




public class View {

    public View() {
    }
    public void Menu() {
        System.out.println("              ADDRESS BOOK PROGRAM                 ");
        System.out.println();
        System.out.println("\t 1. Load from Address Book");
        System.out.println("\t 2. Display Address Book");
        System.out.println("\t 3. Display Specific Birthday Month");
        System.out.println("\t 4. Display Relationship");
        System.out.println("\t 5. Add a New Entry");
        System.out.println("\t 6. Delete an Entry");
        System.out.println("\t 7. Save to Address Book");
        System.out.println("\n\t Enter Option Here: ");

    }

    public void getBirthdayMonthUC3(){
        System.out.println("Enter a Birthday Month: ");
    }
    public void getRelationshipStatusUC4(){
         System.out.println("Enter the Relationship Status: ");
    }
    public void getAddNameUC5(){
         System.out.print("Enter the First and Last Name: ");
    }
    public void getDeleteNameUC6(){
         System.out.println("Enter the Contact's LAST NAME: ");
    }

}
