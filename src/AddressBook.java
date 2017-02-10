// Author: Cori Nicole Bradshaw
// Class: AddressBook
// This class inherits from BCSortedLinkedBasedList - meaning we can add/delete/modify the linked list. 
// We begin by loading the data from a user specified text file. We then parse through the data and seperate it using an ExtPersonType object. 
// SortData() sorts the contents of the address book by the persons last name. 
// We are able to add/delete/modify/display all the data inside of the address books' linked list. 


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class AddressBook extends BCSortedLinkedBasedList {
    //private variables

    private ExtPersonType data;
    private BCSortedLinkedBasedList list;
    private String fileName;

    //controller[Address Book]: UC1 LoadData()
    public void LoadData() {

        System.out.println();
        System.out.println("Enter Filename (Programming Assignment 1 Data.txt): ");
        Scanner fileNameScan = new Scanner(System.in); // FOR USER INPUT [not used in program]
        fileName = "Programming Assignment 1 Data.txt";// fileName = fileNameScan.next();
        data = new ExtPersonType();
        list = new BCSortedLinkedBasedList();
        int length = list.BCsize();
        Scanner file = null;
        try {
            file = new Scanner(new FileInputStream(fileName));
            while (file.hasNextLine()) {
                data = new ExtPersonType(); // SET UP NEW DATA FOR EACH PERSON FROM FILE
                data.setFirst(file.next()); // set first name
                data.setLast(file.next()); // set last name
                file.nextLine();
                data.setDob(file.next(), file.next(), file.next()); // set dateofbirth(month, day, year)
                file.nextLine();
                data.setAddress(file.nextLine(), file.nextLine(), file.nextLine(), file.nextLine()); // set address(street, city, state, zip)
                data.setPhoneNumber(file.nextLine());// set phone
                data.setStatus(file.nextLine()); // set status
               // list.BCadd(SortData(data.getlastName()),data);
                list.BCadd(0, data); // add to beginning of list
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File " + fileName + " was not found");
            System.exit(0);
        }

        file.close();

        System.out.println("\t\t\n\t\t\t PRESS ANY KEY TO CONTINUE.......");
        Scanner keyboard = new Scanner(System.in);
        String getMenuKey = keyboard.nextLine();

    }

    public int SortData(String lastname) {
        ExtPersonType sortD;
        int index = 0;
        int length = list.BCsize();
        if (length == 0) {
            index= length;
        }
        else {
            for (int i = length - 1; i >= 0; i--) {
                sortD = (ExtPersonType) list.BCget(i);
                String last = sortD.getlastName();
                if (lastname.compareTo(last) < 0 ) {
                    index = i;

                } else {
                    index = length;

                }
            }
        }
        return index;
    }
    /*  ExtPersonType sortD;
    int length = list.BCsize();
    if(length == 0){
    return length; // returns the index location 0
    }
    else{
    for(int i = length -1 ; i >=0; i--){
    sortD = (ExtPersonType) super.BCget(i);

    }
    }
    return 1;*/

    //controller[Address Book]: UC2 DisplayData()
    public void DisplayData() {
        System.out.println("ADDRESS BOOK: ");


        int length = list.BCsize(); // length of the list

        for (int i = 0; i < length; i++) {
            System.out.println((ExtPersonType) list.BCget(i));
        }

        System.out.println("\n\n\n ADDRESSBOOK LOOKUP : \n\n \t Please Enter the (lowercase) Last Name: ");
        Scanner getNameKey = new Scanner(System.in);
        ExtPersonType addressLookUp = new ExtPersonType();

        boolean check = false;

        String lastName = getNameKey.nextLine();

        for (int i = 0; i < length; i++) {
            addressLookUp = (ExtPersonType) list.BCget(i);
            if (addressLookUp.getlastName().toLowerCase().compareTo(lastName) == 0) {
                check = true;
                System.out.println(addressLookUp);
            }
        }

        if (check == false) {
            System.out.println("Person not found");

        }
        System.out.println("\n\n\t\t\n\t\t\t PRESS ANY KEY TO CONTINUE.......");
        Scanner keyboard = new Scanner(System.in);
        String getMenuKey = keyboard.nextLine();

    }
    //controller[Address Book]: UC3 DisplayNameMonth()

    public void DisplayNameMonth() {
        Scanner keyboard = new Scanner(System.in);
        ExtPersonType dataMonth = new ExtPersonType();
        String month;
        boolean found = false;

        month = keyboard.nextLine();


        System.out.println("ADDRESS BOOK BIRTHDAY MONTH LOCATOR: ");


        int length = list.BCsize();

        for (int i = 0; i < length; i++) {


            dataMonth = (ExtPersonType) list.BCget(i);


            if (dataMonth.getMonth().toLowerCase().compareTo(month) == 0) {
                found = true;
                System.out.println(dataMonth);
            }
        }

        if (found == false) {
            System.out.println("Person not found");
        }
        System.out.println("\t\t\n\t\t\t PRESS ANY KEY TO CONTINUE.......");

        String getMenuKey = keyboard.nextLine();

    }
    //controller[Address Book]: UC4 DisplayNameStatus()

    public void DisplayNameStatus() {
        Scanner keyboard = new Scanner(System.in);

        ExtPersonType findStatus = new ExtPersonType();
        String status;




        boolean check = false;
        status = keyboard.nextLine();


        System.out.println("ADDRESS BOOK RELATIONSHIP STATUS LOCATOR: ");


        int length = list.BCsize();

        for (int i = 0; i < length; i++) {

            findStatus = (ExtPersonType) list.BCget(i);
            if (findStatus.getStatus().toLowerCase().compareTo(status) == 0) {
                check = true;
                System.out.println(findStatus);
            }
        }

        if (check == false) {

            System.out.println("Relationship status not found");
        }
        System.out.println("\t\t\n\t\t\t PRESS ANY KEY TO CONTINUE.......");

        String getMenuKey = keyboard.nextLine();

    }
    //controller[Address Book]: UC5 AddNewEntry()

    public void AddNewEntry() {
        data = new ExtPersonType(); // new person

        //PROMPT FOR NEW PERSON DATA
        Scanner keyboard = new Scanner(System.in);
        String first = keyboard.next();
        String last = keyboard.next();
        keyboard.nextLine();
        data.newPerson(first, last);
        System.out.println("Enter the date: ");
        String day = keyboard.next();
        String month = keyboard.next();
        String year = keyboard.next();
        data.setDob(month, day, year);
        String extraLine = keyboard.nextLine();
        System.out.println("Enter the street address: ");
        String streetAddress = keyboard.nextLine();
        System.out.print("Enter the city: ");
        String city = keyboard.nextLine();
        System.out.print("Enter the state: ");
        String state = keyboard.nextLine();
        System.out.print("Eneter the 7-Digit zipcode: ");
        String zipCode = keyboard.nextLine();
        data.setAddress(streetAddress, city, state, zipCode);
        System.out.print("Eneter the Phone Number: ");
        String phoneNumber = keyboard.nextLine();
        System.out.print("Enter the Relationship Status: ");
        String status = keyboard.nextLine();
        data.setPhoneNumber(phoneNumber);
        data.setStatus(status);
        // END NEW PERSON DATA


        list.BCadd(0, data); // add to list
        System.out.println("\t\t\n\t\t\t PRESS ANY KEY TO CONTINUE.......");
        String getMenuKey = keyboard.nextLine();


    }
    //controller[Address Book]: UC6 DeleteEntry()

    public void DeleteEntry() {
        Scanner keyboard = new Scanner(System.in);

        boolean check = false;
        ExtPersonType deleteEntry = new ExtPersonType();
        int i = 0;

        String lastName = keyboard.nextLine();

        int length = list.BCsize();

        while (i < length && !check) {
            deleteEntry = (ExtPersonType) list.BCget(i);
            if (deleteEntry.getlastName().toLowerCase().compareTo(lastName) == 0) {
                list.BCremove(deleteEntry);
                check = true;

            }
            
            i++;
        }
        System.out.println("\t\t\n\t\t\t PRESS ANY KEY TO CONTINUE.......");
        String getMenuKey = keyboard.nextLine();


    }
    //controller[Address Book]: UC7 SaveData()

    public void SaveData() {

        PrintWriter out = null;

        try {
            out = new PrintWriter(new FileOutputStream(fileName));


            int length = list.BCsize();
            int i;

            for (i = 0; i < length; i++) {
                out.println(((ExtPersonType) list.BCget(i)).toString());
            }
            out.close();


        } catch (FileNotFoundException e) {
            System.out.println("Error file " + fileName + " not found");
            System.exit(0);
        }
        System.out.println("\t\t\n\t\t\t PRESS ANY KEY TO CONTINUE.......");
        Scanner keyboard = new Scanner(System.in);
        String getMenuKey = keyboard.nextLine();

    }
}
