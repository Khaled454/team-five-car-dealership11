package edu.psu.abington.ist.ist242;
/*
Project: Car Dealership Application
Course: IST 242
Author: Team 5
Date Developed: 6/15/2020
Last Date Changed:6/26/2020
Rev: development build 1
*/
//  INITIAL WHEN READ:
//  INITIAL IF REVISING CLASS:
//  PLEASE ADD HEADER COMMENT FOR THIS CLASS :)


//to do list remove cars




import java.util.ArrayList;     //  this class is functional for the search in the main menu, but not complete
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cars {

    private int carID;
    private String make;
    private String model;
    private String year;
    private String color;
    private String miles;


    //Constructors
    public Cars(int _carId) {
        this.carID = _carId;
    }

    public Cars(int _carID, String _make, String _model, String _year, String _color, String _miles) {
        this.carID = _carID;
        this.make = _make;
        this.model = _model;
        this.year = _year;
        this.color = _color;
        this.miles = _miles;
    }

    //Setters and Getters
    public int getCarID() {
        return carID;
    }
    public void setID(int _carID) {
        this.carID = _carID;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String _make) {
        this.make = _make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String _model) {
        this.model = _model;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String _year) {
        this.year = _year;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String _color) {
        this.color = _color;
    }
    public String getMiles() {
        return miles;
    }
    public void setMiles(String _miles) {
        this.miles = _miles;
    }


    //Make an arraylist for the WELCOME MENU
    public static void listCars(ArrayList<Cars> cList) {
        for (Cars car : cList) {
            System.out.println(car.getYear() + " " + car.getMake() + " " + car.getModel() + " (" + car.getColor()+") Miles " + car.getMiles());
        }
    }


    //arrayList for searching my make, model, year, and miles

   public static void printCarByMakeModelYearAndMiles(ArrayList<Cars> cList, String _make) {// This prints out all the car models chosen
        int i = 1;
        System.out.println("Ready to Purchase: ");  // TO-DO: add color to method
        for (Cars car : cList) {
            if (car.make.equals(_make)) {
                System.out.println(i + ". " + car.getYear() + " " + car.getMake() + " " + car.getModel() + " " + "(" + car.getMiles() + " miles)");
                i++;
            }
        }
    }

    //  adding cars to inventory (cList)  --> KHALED TO WORK ON/ used try and catch exceptions to put the right input-Khaled and Aidan
    public static void addCars(ArrayList<Cars> cList) {
        Cars lastCar = cList.get(cList.size() - 1);  //Get the last car in the Array List
        int lastCarId = lastCar.getCarID();  //Get the last Count
        Cars newCar = new Cars(lastCarId++);  //Create a new Car object
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter the make:");
        while (true) { // make 
            try {
                String c = scnr.nextLine();
                if ((c.matches("[a-zA-Z]+"))) {
                    newCar.setMake(c);
                    break;
                } else
                    throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a make");
            }
        }
        
        System.out.println("Please enter the model:");
        while (true) { //model
            try {
                String c = scnr.nextLine();
                if ((c.matches("[a-zA-Z]+"))) {
                    newCar.setModel(c);
                    break;
                } else
                    throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a model");
            }
        }

        System.out.println("Please enter the year:");
        while (true) { //year
            try {
                String a = scnr.nextLine();
                Integer.parseInt(a);
                newCar.setYear(a);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a year");
            }
        }

        System.out.println("Please enter the color:");
        while (true) { //color
            try {
                String c = scnr.nextLine();
                if ((c.matches("[a-zA-Z]+"))) {
                    newCar.setColor(c);
                    break;
                } else
                    throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a color");
            }
        }
       
    
        System.out.println("Please enter the miles:");
        while (true) { //miles
            try {
                String a = scnr.nextLine();
                Integer.parseInt(a);
                newCar.setMiles(a);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter miles");
            }
        }   
        cList.add(newCar);
    }

    public static void removeCar(ArrayList<Cars> cList, int _carID) {
        for (Cars c : cList) {
            if (_carID == c.getCarID()) {
                cList.remove(c);
                break;
            }
        }
    }
}

