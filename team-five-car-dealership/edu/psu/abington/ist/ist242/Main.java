
package edu.psu.abington.ist.ist242;
/*
Project: Car Dealership Application
Course: IST 242
Author: Team 5
Date Developed: 6/15/2020
Last Date Changed:6/26/2020
Rev: development build 2
*/
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Iterator;

/*
These are some notes that might help explain the current  main() method:


Main Class Logic:

Welcome Screen (ask for char)

*user enters 'S' for 'SEARCH'

drop into method  --->  Cars.printCarYearMakeModel(carList);
            			             ^	^		      ^
		                class   start method	    argument


Underneath the
main(String[] args) {
}
are methods for setting variables. These variables are determined by
the Class (.java file) returns (from its methods).

Let these help guide you in determining a class's
functions/purpose (the get() methods).




------------Suggestions/Revisions (totally keep open discussion for questions if possible)

***using "Car" NOT "Vehicle"...also NOT using Vehicle Class .java file***

3.  Inventory Class
	***note, please also update inventory in Main, or where necessary
	create methods: various methods to search inventory (part name, car year, etc...); various methods to print inventory; etc...
	add: add parts to inventory; separate by used cars versus new cars

4. Main Class
	revise: PROMPT_ACTION String; switch statements to match flow
	create methods:


*/


//  INITIAL WHEN READ:
//  INITIAL IF REVISING CLASS:
//  PLEASE ADD HEADER COMMENT FOR THIS CLASS :)



public class Main {

    private static int leadIdCount = 0;
    private static int partsCount = 0;
    private static int carCount = 0;
    int cCount = 1;
    public static void main(String[] args) {

        //Add customers menu-Khaled
        //print customers menu-Khaled
        final char CONTACT_SD = 'D';
        final char ADD_CUST = 'B';
        //final char
        final char EXIT_CODE = 'E';
        final char EXIT_CODE2 = 'Q';
        final char SEE_CARS = 'C';
        final char SEE_PARTS = 'P';
        final char ADD_PARTS = 'A';
        final String ADD_Cars = "V";
        final char MANAGE_INV = 'M';
        final char SEARCH = 'S';
        char userAction;
        //Use enums to log in with different menu options
        final String PROMPT_ACTION_Manager = "To manage inventory type'M', to see cars inventory type 'C',to see parts inventory type'P', to search inventory type 'S', to exit type 'e'";
        final String PROMPT_ACTION_Customer = "To see cars inventory type'C',To see Parts inventory type 'P', to search inventory type 'S', To contact SalesAdvisor type'D', to exit type 'e'";
        final String PROMPT_ACTION_SalesAdvisor = "TO add customer type 'B',To see cars inventory type'C',To see Parts inventory type 'P', to search inventory type 'S', to exit type 'e'";
        //Added Too see Parts option-Khaled //Should we add customer option that is done only by Sales Advisor?
        Scanner scnr = new Scanner(System.in);

        ArrayList<Cars> carList = new ArrayList<>();//To add cars
        ArrayList<Parts> partList = new ArrayList<>();// To add parts
        ArrayList<Customer> custList = new ArrayList();


        // Instantiate objects and add them to the appropriate ArrayList

        Cars car1 = new Cars(0, "Toyota", "Camry", "2007", "Black", "2000000");
        Cars car2 = new Cars(1, "Toyota", "Camry", "2008", "Grey", "3245");
        Cars car3 = new Cars(2, "Toyota", "Camry", "2009", "White", "2333");
        Cars car4 = new Cars(3, "Toyota", "Tacoma", "2017", "Sand", "15478");

        Cars car5 = new Cars(4, "Chevrolet", "Cruze", "2011", "Gray", "67000");
        Cars car6 = new Cars(5, "Chevrolet", "Cruze", "2012", "Gray", "67000");
        Cars car7 = new Cars(6, "Chevrolet", "Cruze", "2013", "Gray", "67000");

        Cars car8 = new Cars(7, "Ford", "F150", "2016", "Black", "20000");
        Cars car9 = new Cars(8, "Ford", "F150", "2017", "White", "12057");
        Cars car10 = new Cars(9, "Ford", "F150", "2019", "Black", "10239");

        Cars car11 = new Cars(10, "Honda", "Civic", "2008", "Green", "112005");
        Cars car12 = new Cars(11, "Honda", "Civic", "2009", "Blue", "104888");
        Cars car13 = new Cars(12, "Honda", "Civic", "2014", "Red", "78394");

        Cars car14 = new Cars(13, "Kia", "Forte", "2012", "Bronze", "119000");
        Cars car15 = new Cars(14, "Kia", "Forte", "2012", "Bronze", "119000");
        Cars car16 = new Cars(15, "Kia", "Forte", "2013", "Bronze", "119000");

        //Added parts and partID-Khaled
        Parts part1 = new Parts(0, "Shocks", "56655", "Suspension", 150);
        Parts part2 = new Parts(1, "Brake pad", "56656", "Brakes", 75);
        Parts part3 = new Parts(2, "Brake rotors", "56657", "Brakes", 200);
        Parts part4 = new Parts(3, "Wheels", "56658", "Tires", 55);
        Parts part5 = new Parts(4, "Light bulb", "56659", "Lights", 5);
        Parts part6 = new Parts(5, "Axle", "56660", "Suspension", 75);
        Parts part7 = new Parts(6, "Tire rod", "56661", "Suspension", 50);
        Parts part8 = new Parts(7, "Axle Shaft", "56662", "Suspension", 100);
        Parts part9 = new Parts(8, "Upper Arm control", "56663", "Suspension", 125);
        Parts part10 = new Parts(9, "Lower Arm control", "56664", "Suspension", 110);
        Parts part11 = new Parts(10, "Air filter", "56665", "Engine", 75);
        Parts part12 = new Parts(11, "Air Intake", "56666", "Engine", 100);
        Parts part13 = new Parts(12, "Mufflers", "56667", "Exhaust", 75);
        Parts part14 = new Parts(13, "Headers", "56668", "Exhaust", 140);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        carList.add(car11);
        carList.add(car12);
        carList.add(car13);
        carList.add(car14);
        carList.add(car15);
        carList.add(car16);

        partList.add(part1);
        partList.add(part2);
        partList.add(part3);
        partList.add(part4);
        partList.add(part5);
        partList.add(part6);
        partList.add(part7);
        partList.add(part8);
        partList.add(part9);
        partList.add(part10);
        partList.add(part11);
        partList.add(part12);
        partList.add(part13);
        partList.add(part14);

        // prompt user
        System.out.println("DEALERSHIP MAIN MENU");
        //userAction = getAction(PROMPT_ACTION);

        do {
            userAction = getAction(PROMPT_ACTION_Manager);
            switch (userAction) {
                case SEE_CARS:
                    Cars.listCars(carList);
                    userAction = getAction(PROMPT_ACTION_Manager);
                    break;

                case SEE_PARTS:
                    Parts.listParts(partList);//For some reason it prints an infinite loop and I dunno why-Khaled
                    userAction = getAction(PROMPT_ACTION_Manager);//Added this and fixed it-Khaled
                    break;


                    case SEARCH:
                    String inv_type = getType();  // part or vehicle
                    switch (inv_type) {
                        case "car":
                            System.out.println("Please enter make: ");
                            String input_ = scnr.next();
                            Cars.printCarByMakeModelYearAndMiles(carList, input_);

                            break;

                        case "part":
                            System.out.println("Please enter Part type");
                            String input = scnr.next();
                            Parts.printPartsByCategory(partList, input);
                    }


                case MANAGE_INV:
                    {
                    inv_type = getType();  //inventory type car or Part
                    switch (inv_type) {// input user action method //need to be modified
                        case "car"://Changed and now works, It wasnt working earlier-Khaled
                            String manage_what = getManageInventory();
                            switch (manage_what) {
                                case "add"://Was Add_Cars, now add and works-Khaled
                                    Cars.addCars(carList);//We need exceptions in this method because if there was an invalid input the program crashes and closes or switch all to scnr.nextLine-Khaled
                                    //Fixed the inputs with Aidan using Exceptions-Khaled
                                    break;
                                case "remove":
                                    break;
                            }
                            break;
                        case "part"://Changed and now works, It wasn't working earlier-Khaled
                            manage_what = getManageInventory();
                            switch (manage_what) {
                                case "add":
                                    Parts.addParts(partList);
                                    ;
                                    break;
                                case "remove":
                                    System.out.println("Please enter a part ID to remove.");
                                    int p = scnr.nextInt();
                                    Parts.removeParts(partList,p); //Not Sure here-Khaled
                                    break;
                            }
                            break;
                        }
                    } //case EXIT_CODE2:
                }// break;
        
        
    } while(userAction != EXIT_CODE);
}


    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }

   /* public Customer addCustomer() {// All done by the SalesAdvisor
        Customer cust = new Customer(cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter your First Name: ");
        cust.setFirstName(scnr.nextLine());
        System.out.println("Please Enter Last Name: ");
        cust.setLastName(scnr.nextLine());
        System.out.println("Please Enter the customer's email address: ");
        cust.setEmailAddress(scnr.nextLine());
        System.out.println("Please Enter the customer's local address: ");
        cust.setAddress(scnr.nextLine());
        System.out.println("Please Enter the customer's Driver's license: ");
        cust.setDriversLicenseNum(scnr.nextLine());

        return cust;
    }
*/
    public static String getType() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Search Type ('Car'/'Part'): ");
        String type = scnr.nextLine().toLowerCase();
        return type;
    }
//make a log in method for the manager

    public static String getManageInventory() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter 'Add' or 'Remove': ");
        String manageWhat = scnr.nextLine().toLowerCase();
        return manageWhat;
    }
}
//print SalesAdvisor information method



    //add parts to inventory (only manager)
    /*
    public static Parts addParts() {

        Parts parts = new Parts(partsCount++);
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter part name: ");
        String partName = in.nextLine();
        parts.setPartName(partName);
        parts.setPartType();
        parts.setPartNumber(partsCount);

        return parts;
    }

     */



/*
   public static void searchCarInventory(ArrayList<Inventory> carList, ArrayList<Parts> partList) {
        Scanner in = new Scanner(System.in);
        String input = "";
        for (Inventory c : carList) {  //Search string by vehicleId
            System.out.println("Enter Make: ");
            input = in.nextLine();
            c.getMake();

            if () {
                System.out.println(c.getColor());
                break;
            }
        }
    }
*/



/*
//  prompt user for part type
public Parts setPartType() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Parts Type ('motor', 'interior', 'exterior'): ");//Needs to be changed-Khaled
       // Parts partType = new Parts(in.nextLine());

       // return partType;
        //}

 */



