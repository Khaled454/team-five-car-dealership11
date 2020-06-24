package edu.psu.abington.ist.ist242;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static int leadIdCount = 0;
    private static int partsCount = 0;
    private static int carCount = 0;

    public static void main(String[] args) {


        final char EXIT_CODE = 'E';
        final char SEE_CARS = 'C';
        final char SEE_PARTS = 'P';
        final char ADD_PARTS = '1';
        final char ADD_VEHICLE = '2';
        final char SEARCH = 'S';
        char userAction;
        final String PROMPT_ACTION = "To see cars inventory type'C', to see parts inventory type'P', to exit type 'e'";


        ArrayList<Cars> carList = new ArrayList<>();//To add cars
        ArrayList<Parts> partList = new ArrayList<>();// To add parts
        ArrayList<SalesLead> leadList = new ArrayList<>(); // to add sales leads (non-converted customers)

        // Instantiate objects and add them to the appropriate ArrayList
        Cars car1 = new Cars(1, "Toyota", "Camry", 2007, "Black", 2000000);
        Cars car2 = new Cars(2, "Toyota", "Camry", 2008, "Grey", 3245);
        Cars car3 = new Cars(3, "Toyota", "Camry", 2009, "White", 2333);
        Cars car4 = new Cars(4, "Toyota", "Tacoma", 2017, "Sand", 15478);

        Cars car5 = new Cars(5, "Chevrolet", "Cruze", 2011, "Gray", 67000 );
        Cars car6 = new Cars(6, "Chevrolet", "Cruze", 2012, "Gray", 67000 );
        Cars car7 = new Cars(7, "Chevrolet", "Cruze", 2013, "Gray", 67000 );

        Cars car8 = new Cars(8, "Ford", "F150", 2016,"Black", 20000 );
        Cars car9 = new Cars(9, "Ford", "F150", 2017,"White", 12057 );
        Cars car10 = new Cars(10, "Ford", "F150", 2019,"Black", 10239 );

        Cars car11 = new Cars(11, "Honda", "Civic", 2008, "Green", 112005 );
        Cars car12 = new Cars(12, "Honda", "Civic", 2009, "Blue", 104888 );
        Cars car13 = new Cars(13, "Honda", "Civic", 2014, "Red", 78394 );

        Cars car14 = new Cars(14, "Kia", "Forte", 2012, "Bronze", 119000 );
        Cars car15 = new Cars(15, "Kia", "Forte", 2012, "Bronze", 119000 );
        Cars car16 = new Cars(16, "Kia", "Forte", 2013, "Bronze", 119000 );


        Parts part1 = new Parts("Shocks", 123434, "Suspension");
        Parts part2 = new Parts("Brake pad", 56656, "Brakes");


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

        // prompt user

        System.out.println ("DEALERSHIP MAIN MENU");
        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch (userAction) {
                case SEE_CARS:
                    Cars.listCars(carList);
                    break;
                case SEE_PARTS:
                    Parts.listParts(partList);
                    break;
                case SEARCH:
                    String inv_type = getType();  // part or vehicle
                    switch (inv_type) {
                        case "car":
                            System.out.println("Enter Type ('color'/'model'/'maker'/'location'): ");
                            String searchType = input.nextLine().toLowerCase();
                            Scanner scnr = new Scanner(System.in);

                            switch (searchType) {
                                case "color":

                                    System.out.println("Please enter color: ");
                                    String input_ = scnr.nextLine();

                                    Cars.printCarByColor(carList, input_);

                                    break;
                                case "make":

                                    System.out.println("Please enter make: ");
                                    input_ = scnr.nextLine();

                                    Cars.printCarByColor(carList, input_);

                                    break;
                                case "model":

                                    System.out.println("Please enter model: ");
                                    input_ = scnr.nextLine();

                                    Cars.printCarByModel(carList, input_);

                                    break;
                                case "VIN":
                                    break;
                            }

                        case ADD_PARTS:
                            partList.add(Main.addParts());

                            break;

                        case ADD_VEHICLE:
                            System.out.println("Enter Vehicle Make: ");
                            inv_type = input.nextLine().toLowerCase();

                            switch (inv_type) {
                                case "car":
                                    carList.add(Main.addCar());
                                    break;
                            }
                            break;
                    }
                    }
            }
        }

    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }

    //  adding cars to inventory (cList)
    public Cars addCars (ArrayList<Cars>cList) {
        Cars newCar = new Cars(carCount++);
        Scanner scnr = new Scanner(System.in);
            for(Cars carList : cList) {
                System.out.println("Please enter the make:");
                carList.setMake(scnr.nextLine());
                carList.getMake();
                System.out.println("Please enter the model:");
                String model = scnr.nextLine();
                System.out.println("Please enter the year:");
                int year = scnr.nextInt();
                System.out.println("Please enter the color:");
                String color = scnr.next();
                System.out.println("Please enter the MPG:");
                int MPG = scnr.nextInt();

            }

            return newCar;
    }

    public static SalesLead addSalesLead(ArrayList<SalesLead> leadList) {
        SalesLead lead = new SalesLead(leadIdCount++);
        Scanner in = new Scanner(System.in);
        for (SalesLead s : leadList) {
            System.out.println("Lead First Name: " + s.getFirstName());
            s.setFirstName(in.nextLine());
            System.out.println("Lead Last Name: " + s.getLastName());
            s.setLastName(in.nextLine());
            System.out.println("Lead Email: " + s.getEmail());
            s.setEmail(in.nextLine());
            System.out.println("Lead Phone: " + s.getPhone());
            s.setPhone(in.nextLine());
            System.out.println("Lead ID: " + s.getleadId());
            s.setleadId(leadIdCount);
        }
        return lead;
    }

 /*   public static void searchCarInventory(ArrayList<Inventory> carList, ArrayList<Parts> partList) {
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
    }*/

    public static String getType() {
        Scanner scnr = new Scanner (System.in);
        System.out.println ("Enter Search Type ('car'/'parts'): ");
        String type = scnr.nextLine ().toLowerCase ();
        return type;
    }


    //  add cars to inventory (by manager)
    public static Cars addCar(ArrayList<Cars> carList) {

        Cars addCarToArray = new Cars(carCount++);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter part name: ");
        String input = in.nextLine();
        addCarToArray.setMake(input);
        addCarToArray.setID(carCount);

        return addCarToArray;
    }

    //  add parts to inventory (only manager)
    public static Parts addParts() {

        Parts parts = new Parts(partsCount++);
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter part name: ");
        String partName = in.nextLine();
        parts.setPartName(partName);
        //parts.setPartType();
        parts.setPartNumber(partsCount);

        return parts;
    }

    //  prompt user for part type
    public Parts setPartType() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Parts Type ('motor', 'interior', 'exterior'): ");
        Parts partType = new Parts(in.nextLine());

        return partType;
    }

    // check ID number for sales advisor and manager
    //public stat remove cars
    //public stat remove parts
    //public stat add customer just like pizza customer
    //public stat Add employees
}
