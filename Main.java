/*
Alok Ghosh and Farhan Jarif
Program Name: 100 Lockers 
Program Description: A program that lets you choose between Asterisk art, 100 Lockers, Custom Lockers and an exit option.(Menu system)
Creation Date: February  18th, 2021
Last Edit Date: February  19th, 2021
Ethics Declaration: This code is the work of my partner, Alok, and I
*/

import java.io.*; //all classes of the io package are imported
import java.util.*; //accesses the classes that are preset in this import
import java.util.Scanner; //allows for the use of scanners

public class Main{
public static void main (String[]args){
    //Declaring scanner
    Scanner scan = new Scanner(System.in);
    //boolean value for while loop
    boolean menuLoop = true;
    //Declaring input value for menu system
    int choice;

    while(true){ // Refering to the declared boolean variable
    //Menu options 
    System.out.println("\nChoose your option: \n");
    System.out.print("1.) Asterisk art.  \n");
    System.out.print("2.) 100 Lockers. \n");
    System.out.print("3.) Custom Lockers.\n");
    System.out.print("4.) Exit. \n");

    System.out.print("\nEnter Your Menu Choice (1-4): ");
    //Input option for the menu created 
    choice = scan.nextInt();
  
  //Switch case(input options)
  switch(choice){

  case 1:
  //Asterisk art code
  String astrx = "";
          String space = " ";
          //first section of art
          for (int i=0; i<5; i++){
            astrx = astrx + "*";
            System.out.println(astrx); 
          }
          System.out.print("\n");
          //second section of art
          for (int j=5; j>0; j--){
            System.out.println(astrx);
            astrx = astrx.substring(0,(j-1));
          }
          //third section of art
          for (int k=0; k<5; k++){
            int l = 4;
            for (l = l-k; l > 0; l--){
              System.out.print(space);
            }
            astrx = astrx + "*";
            System.out.println(astrx); 
          }
          System.out.print("\n");
          //fourth section of art
          space = "";
          for (int m=5; m>0; m--){
            System.out.print(space);
            space = space + " ";
            System.out.println(astrx);
            astrx = astrx.substring(0,(m-1)) ;
          }
          System.out.print("\n");
          //fifth section of art
          space = " ";
          astrx = "*";
          for (int o = 0; o < 5; o++)
          {
            int p = 4;
            for (p = p-o; p > 0; p--) {
            System.out.print(space);
            }
            System.out.println(astrx);
            astrx = astrx + ("**");
          }
          break;
        case 2: 
        //100 Locker code
        //Assigning numbers 1-100 to each locker
            int[] lockers = new int[100];
            for (int x=0;x<100;x++) {
              lockers[x]=x+1;
            }
            //Setting initial state of each locker to closed
            String[] lockerState = new String[100];
            for (int x=0; x<100; x++){
              lockerState[x]="C";
            }
            //Uses mod to determine which lockers are open/closed and reverses its state
            for(int i=0;i<100;i++){
              for(int x=0;x<100;x++){
                if ((x+1)%(i+1)==0){
                  if (lockerState[x].equals("O")){
                    lockerState[x]="C";
                  }else {
                    lockerState[x]="O";
                  }
                }
              }
            }
            //Prints out which locker nubers are open
            int openCount=0;
            System.out.print("\nLocker numbers: ");
            for (int i=0;i<100;i++){
              if (lockerState[i].equals("O")){
                openCount++;
                System.out.print(i+1+ ", ");
              }
            }
            System.out.println("will be open.\n");
            //Prints out the 10x10 grid to show which lockers are open and which ones are closed
            System.out.println("\nThis 10x10 grid below shows the final state of each locker. \"C\" means closed and \"O\" means open.");
            for (int i=0;i<10;i++){
              System.out.println();
              for (int x=i*10;x<(i+1)*10;x++){
                System.out.print(lockerState[x]+" ");
              }
            }
            //Prints how many lockers are open
            System.out.println("\n\n"+ openCount + " lockers will be open at the end");

        break;
        case 3:
        //Custom lockers code 
        //Assigning numbers 1-user inputted number of lockers to each locker
            System.out.println("How many lockers/students are there? (choose any number)");
            int totalLockers = scan.nextInt();
            int[] customLockers = new int[totalLockers];
            for (int x=0;x<totalLockers;x++) {
              customLockers[x]=x+1;
            }
            //Setting initial state of each locker to closed
            String[] customLockerState = new String[totalLockers];
            for (int x=0; x<totalLockers; x++){
              customLockerState[x]="C";
            }
            //Uses mod to determine which lockers are open/closed and reverses its state
            for(int i=0;i<totalLockers;i++){
              for(int x=0;x<totalLockers;x++){
                if ((x+1)%(i+1)==0){
                  if (customLockerState[x].equals("O")){
                    customLockerState[x]="C";
                  } else {
                    customLockerState[x]="O";
                  }
                }
              }
            }
            //Prints out which locker numbers are open
            int customOpenCount=0;
            System.out.print("\nLockers: ");
            for (int i=0;i<totalLockers;i++){
              if (customLockerState[i].equals("O")){
                customOpenCount++;
                System.out.print(i+1+ ", ");
              }
            }
            System.out.println("will be open.\n");
            //Prints out a grid to show which lockers are open and which ones are closed
            System.out.println("\nThis grid below shows the final state of each locker. \"C\" means closed and \"O\" means open.");
            for (int i=0;i<(int)(totalLockers/10);i++){
              System.out.println();
              for (int x=i*10;x<(i+1)*10;x++){
                System.out.print(customLockerState[x]+" ");
              }
            }
            System.out.print("\n");
            //uses mod to display final line
            for (int z = totalLockers-totalLockers%10;z<totalLockers; z++) {
              System.out.print(customLockerState[z]+ " ");
            }
            //Prints how many lockers are open
            System.out.println("\n\n"+ customOpenCount + " lockers will be open at the end");

        break;
        case 4: 
        //exit code 
        System.out.println("Ending Program. Thank you for participating");
                System.exit(0);
        break; 
          
          default : //Error menu solved 
            System.out.println("This is not a valid Menu Option! Please Select Another: ");
          break;
          }
    }
    
  }
}


