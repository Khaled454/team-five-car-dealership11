package edu.psu.abington.ist.ist242;
/*
Project: Car Dealership Application
Course: IST 242
Author: Team 5
Date Developed: 6/15/2020
Last Date Changed:6/26/2020
Rev: development build 1
*/

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Parts {
    //Data members
    private int partID;//Added partID-Khaled
    private String partName;
    private String partNumber;//
    private String partType;//So like under what category is this part. Example Shocks go under suspension category
    private double partPrice;

    public Parts(int _partID) {
        this.partID = _partID;
    }

    // Constructor methods
    public Parts(int _PartID, String _partName, String _partNumber, String _partType, double _partPrice) {//Added double partPrice-Khaled
        this.partID = _PartID;
        this.partName = _partName;
        this.partNumber = _partNumber;
        this.partType = _partType;
        this.partPrice = _partPrice;
    }

    //Setters and Getters
    public int getPartID() {
        return partID;
    }

    public void setPartID(int partID) {
        this.partID = partID;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String _partName) {
        this.partName = _partName;
    }


    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String _partNumber) {
        this.partNumber = _partNumber;
    }


    public String getPartType() {
        return partType;
    }

    public void setPartType(String _partType) {
        this.partType = _partType;
    }

    public Double getPartPrice() {
        return partPrice;
    }//Added setters and getters for the price-Khaled

    public void setPartPrice(double _partPrice) {
        this.partPrice = _partPrice;
    }

    //Make an arraylist for the parts
    public static void listParts(ArrayList<Parts> pList) {
        for (Parts part : pList) {
            System.out.println("Part ID: " + part.getPartID());
            System.out.println("Part Name: " + part.getPartName());
            System.out.println("Part Number: " + part.getPartNumber());
            System.out.println("Part Type: " + part.getPartType());
            System.out.println("Part Price $: " + part.getPartPrice() + "\n");
        }
    }

    public static void printPartsByCategory(ArrayList<Parts> partsList, String _partType) {
        int i = 1;
        for (Parts parts : partsList) {
            if (parts.getPartType().equals(_partType)) {
                System.out.println("Part ID: " + parts.getPartID() + " Part Number: " + parts.getPartNumber() + " " + parts.getPartName() + " Part Type: " + parts.getPartType() + " $" + parts.getPartPrice());
                i++;
            }
        }
    }
    //System.out.println(i + parts.getPartName() + "(" + parts.getPartType() + ")");

    public static void addParts(ArrayList<Parts> pList) {// AddedParts method-Khaled
        Parts lastPart = pList.get(pList.size() - 1);  //Get the last part in the Array List
        int lastPartId = lastPart.getPartID();  //Get the last Count
        Parts newPart = new Parts(lastPartId++);  //Create a new Part object
        Scanner scnr = new Scanner(System.in);// I might wanna throw a partID  and Part Price here not sure-Khaled
        System.out.println("Please Enter part Id :");
        System.out.println("Please enter the Part Name:");
        while (true) { // Name
            try {
                String c = scnr.nextLine();
                if ((c.matches("[a-zA-Z]+"))) {
                    newPart.setPartName(c);
                    break;
                } else
                    throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter the Part Name");
            }
        }

        System.out.println("Please enter the Part Number:");
        while (true) { //Part Number
            try {
                String a = scnr.nextLine();
                Integer.parseInt(a);
                newPart.setPartNumber(a);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a Part Number");
            }
        }

        System.out.println("Please enter the Part Type:");
        while (true) { //Part Type
            try {
                String c = scnr.nextLine();
                if ((c.matches("[a-zA-Z]+"))) {
                    newPart.setPartType(c);
                    break;
                } else
                    throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a Part Type");
            }
        }

        pList.add(newPart);
    }


    // remove parts by ID number
    public static void removeParts(ArrayList<Parts> pList, int _partID) {
        for (Parts p : pList) {
            if (_partID == p.getPartID()) {//Changed from Part Number to ID-Khaled:Thought it was easier but it doesn't matter
                pList.remove(p);
                break;
            }
        }
    }
}
