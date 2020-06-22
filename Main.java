package edu.psu.abington.ist.ist242;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static int leadIdCount = 0;

    public static void main(String[] args) {


        final char EXIT_CODE = 'E';
        final char SEE_CARS = 'C';
        final char SEE_PARTS = 'P';
        char userAction;
        final String PROMPT_ACTION = "To see cars inventory type'C', to see parts inventory type'P', to exit type 'e'";


        ArrayList<Cars> carList = new ArrayList<>();//To add cars
        ArrayList<Parts> partList = new ArrayList<>();// To add parts
        ArrayList<SalesLead> leadList = new ArrayList<>(); // to add sales leads (non-converted customers)

        Cars car1 = new Cars(1, "Toyota", "Camry", 2007, "Black", 2000000);
        Cars car2 = new Cars(2, "Toyota", "Camry", 2008, "Grey", 3245);
        Cars car3 = new Cars(3, "Toyota", "Camry", 2009, "White", 2333);

       carList.add(car1);
       carList.add(car2);
       carList.add(car3);


       Parts part1 = new Parts("Shocks", 123434, "Suspension");
        Parts part2 = new Parts("Brake pad", 56656, "Brakes");

       partList.add(part1);
        partList.add(part2);

        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch (userAction) {
                case SEE_CARS:
                    Cars.listCars(carList);
                    break;
                case SEE_PARTS:
                    Parts.listParts(partList);

    }

            userAction = getAction(PROMPT_ACTION);
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
        
        Cars newCar = 
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

}

//Search string by vehicleId
      for (Cars c : cList) {
        if (car== c.getcarID()) {
            System.out.println(c.getColor());
            break;
        }
    }

    //Update Search string by vehicleId set Color
      for (Cars v : carList) {
        if (vehicleId == v.getcarID()) {
            v.setColor(Color.Purple);
            break;
        }
    }

    //Print all vehicle objects in ArrayList
      for (Cars v : carList) {
        System.out.println("Id: " + v.getId() + " Make: " + v.getMake());
    }

    //Remove Search string by vehicleId set Color
      for (Cars v : carList) {
        if (carID == v.getcarID()) {
            vehicleList.remove(v);
            break;
        }
    }

    //Print all vehicle objects in ArrayList
      for (Cars v : carList) {
        System.out.println("Id: " + v.getId() + " Make: " + v.getMake());
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
}
    //public stat add cars just like add orders
    //Do while to limit access to this action
    //public stat add parts
    //Do while to limit access to this action
    //public stat remove cars
    //Do while to limit access to this action
    //public stat remove parts
    //Do while to limit access

    //public stat add customer just like pizza customer

    //public stat Add employees
    //do while to limit access
    //We can add as much of things that we like
