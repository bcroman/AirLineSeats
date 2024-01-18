package airlineseats;

import java.util.*;

public class AirlineSeats {

    //Methods
    static void option1() {
        Scanner kboard = new Scanner(System.in);
        int seat = 0;
        System.out.println("Enter A Seat Number (1 - 14)?");
        seat = kboard.nextInt();
    }
    
    static void option2(String name[], int type[]) {
        System.out.println("Seat Details:");
        System.out.println("Seat,Name,Type");
        System.out.println("----------------------");
        for(int x = 0; x < 14; x++){
            System.out.println(x+1 +","+name[x]+","+type[x]);
        }
    }
    

    //Main Code
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);

        //Variables
        int choice = 0;
        float TotalCost;

        //Arrys
        String[] Passenagers = new String[14];
        int[] Types = new int[14];

        //Display Menu
        while (choice != 5) {
            System.out.println("1 - Book A Seat");
            System.out.println("2 - Display All Seats Showing Passenger Deatils");
            System.out.println("3 - Cancel A Seat");
            System.out.println("4 - Display Report Of Total Takings");
            System.out.println("5 - Exit Program");

            //User Input
            System.out.println("Enter a number from the menu above?");
            choice = kboard.nextInt();

            //Add Space
            System.out.println("");

            //Switch Statement
            switch (choice) {
                case 1:
                    System.out.println("Booking Seat");
                    option1();
                    break;
                case 2:
                    System.out.println("");
                    option2(Passenagers,Types);
                    break;
                case 3:
                    System.out.println("Cancel Seat");
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Ending Program");
                    break;
                default:
                    System.out.println("This number is out of range, try again.");
                    break;
            }

            //Add Space
            System.out.println("");
        }

    }

}
