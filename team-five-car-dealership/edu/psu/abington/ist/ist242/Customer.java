package edu.psu.abington.ist.ist242;
/*
Project: Car Dealership Application
Course: IST 242
Author: Team 5
Date Developed: 6/15/2020
Last Date Changed:6/26/2020
Rev: development build 1
*/
// INITIAL WHEN READ:
// INITIAL IF REVISING CLASS:
// PLEASE ADD HEADER COMMENT FOR THIS CLASS :)
// We want to be able to add customers like pizza shop-Khaled
// Print customers by salesadvisor maybe-Khaled
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends Person{
//What are we doing with the customer class and how will make the test drive-Khaled
    private boolean testDriveApproval;
    private String driversLicenseNum;
    private String address;
    private int customerID;

    public Customer(){

    }

    public Customer(boolean testDriveApproval, int customerID, String driversLicenseNum, String firstName, String lastName, String emailAddress, String phoneNumber, String address, role role) {
        super(firstName,lastName,emailAddress,phoneNumber,role);
        this.customerID=customerID;
        this.address = address;
        this.testDriveApproval = testDriveApproval;
        this.driversLicenseNum = driversLicenseNum;
        this.role=role;
    }

    public boolean getTestDriveApproval() {
        boolean testDriveApproval = false;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter your Driver's License Number: ");
        driversLicenseNum = scnr.next();

        if(driversLicenseNum.length() == 9){
            testDriveApproval = true;
        }
        else{
            testDriveApproval = false;
        }
        return testDriveApproval;
    }

    public void setTestDriveApproval(boolean testDriveApproval) {
        this.testDriveApproval = testDriveApproval;
    }

    public String getDriversLicenseNum() {
        return driversLicenseNum;
    }

    public void setDriversLicenseNum(String driversLicenseNum) {
        this.driversLicenseNum = driversLicenseNum;
    }

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    public static void printCustomer(ArrayList<Customer> cList) {       //  TO-DO : pass cust array through method
        for(Customer cust : cList) {
            System.out.println("First Name:" + cust.getFirstName());
            System.out.println("Last Name:" + cust.getLastName());
            System.out.println("Email Address:" + cust.getPhoneNumber());
            System.out.println("Phone number: "+cust.getPhoneNumber());
            System.out.println("Address: " +cust.getAddress());
            System.out.println("Driver's License Number: " +cust.getDriversLicenseNum()+"\n");
        }

        }

        public static void addCustomer(ArrayList<Customer> custList) {
            Customer lastCust = custList.get(custList.size() - 1);  //Get the last car in the Array List
            int lastCustomerID = lastCust.getCustomerID();
            Customer newCust = new Customer()  //Get the last Count //Create a new Car object
            Scanner scnr = new Scanner(System.in);
            System.out.println("Please enter a first name:");
            while (true) { // first name 
                try {
                    String c = scnr.nextLine();
                    if ((c.matches("[a-zA-Z]+"))) {
                        newCust.setFirstName(c);
                        break;
                    } else
                        throw new InputMismatchException();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a first name");
                }
            }
            
            System.out.println("Please enter a last name:");
            while (true) { //last name
                try {
                    String c = scnr.nextLine();
                    if ((c.matches("[a-zA-Z]+"))) {
                        newCust.setLastName(c);
                        break;
                    } else
                        throw new InputMismatchException();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a last name");
                }
            }
    
            System.out.println("Please enter an address:");
            while (true) { //address
                try {
                    String c = scnr.nextLine();
                    if ((c.matches("[a-zA-Z]+"))) {
                        newCust.setAddress(c);
                        break;
                    } else
                        throw new InputMismatchException();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an address");
                }
            }

            System.out.println("Please enter a phone number:");
            while (true) { //phone number
                try {
                    String c = scnr.nextLine();
                    if ((c.matches("[a-zA-Z]+"))) {
                        newCust.setPhoneNumber(c);
                        break;
                    } else
                        throw new InputMismatchException();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a phonbe number");
                }
            }

            System.out.println("Please enter an email address:");
            while (true) { //email address
                try {
                    String c = scnr.nextLine();
                    if ((c.matches("[a-zA-Z]+"))) {
                        newCust.setEmailAddress(c);
                        break;
                    } else
                        throw new InputMismatchException();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an email address");
                }
            }

            System.out.println("Please enter a drivers license number:");
            while (true) { //DL num
                try {
                    String c = scnr.nextLine();
                    if ((c.matches("[a-zA-Z]+"))) {
                        newCust.setDriversLicenseNumber(c);
                        break;
                    } else
                        throw new InputMismatchException();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a drivers license");
                }
            }

            System.out.println("Please enter an email address:");
            while (true) { //email address
                try {
                    String a = scnr.nextLine();
                    Integer.parseInt(a);
                    newCar.setYear(a);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a year");
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
            custList.add(newCust);
        }
    }
