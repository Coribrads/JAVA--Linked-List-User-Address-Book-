// Author: Cori Nicole Bradshaw
// Class: ProgrammingAssignment1
// This class contains the main method and objects for view and controller.
// It prompts the user to select from a menu (a gui in VIEW) of the address book and the controller repsonds with the proper use cases.

import java.util.Scanner;

public class ProgrammingAssignment1 {
  
    public static void main(String args[]){
        View v1 = new View();
        Controller c1 = new Controller();
        v1.Menu();


        Scanner keyboard = new Scanner(System.in);
        int getMenuKey = keyboard.nextInt();
        boolean check;
        if(getMenuKey==1||getMenuKey==2||getMenuKey==3||getMenuKey==4||getMenuKey==5||getMenuKey==6||getMenuKey==7){
        check = true;
        }
        else  {
            check = false;
            //Tell system to exit here.
        }
        while(check == true){
        switch(getMenuKey){
            case 1:
                c1.UC1LoadData();
                break;
            case 2:
                c1.UC2DisplayData();
                break;
            case 3:
                c1.UC3DisplayNameMonth();
                break;
            case 4:
                c1.UC4DisplayNameStatus();
                break;
            case 5:
                c1.UC5AddNewEntry();
                break;
            case 6:
                c1.UC6DeleteEntry();
                break;
            case 7:
                c1.UC7SaveData();
                break;
            default:
                System.out.println("Invalid Entry.... System Exit.....");


        }
        v1.Menu();
        getMenuKey = keyboard.nextInt();
        }


    }
}
