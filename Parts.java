package edu.psu.abington.ist.ist242;

import java.util.ArrayList;
import java.util.Scanner;

public class Parts {
//Data members

    private String partName;
    private int partNumber;//OR ID but in real life it is number
    private String partType;//So like under what category is this part. Example Shocks go under suspension category
    private double partPrice;

// Constructor methods
    public Parts(String _partName, int _partNumber, String _partType) {
    this.partName=_partName;
    this.partNumber=_partNumber;
    this.partType=_partType;
    }

    public Parts(String _partType) {
        this.partType = _partType;
    }

    public Parts(int _partNumber) {
        this.partNumber = _partNumber;
    }

   // Setters and getters
    public String getPartName() {
        return partName;
    }
    public void setPartName(String _partName) {
        this.partName = _partName;
    }


    public int getPartNumber() { return partNumber; }
    public void setPartNumber(int _partNumber) { this.partNumber =_partNumber; }


    public String getPartType() {
        return partType;
    }
    public void setPartType(String _partType) {
        this.partType = _partType;
    }


    //Make an arraylist for the parts
    public static void listParts(ArrayList<Parts> pList) {
        for (Parts part : pList) {
            System.out.println("Part ID: " + part.getPartName());
            System.out.println("Part Name: " + part.getPartNumber());
            System.out.println("Part Type: " + part.getPartType());
        }
    }

    //  print parts
    public static void printParts(ArrayList<Parts> pList) {
        for (Parts parts : pList) {
            System.out.printf(parts.getPartName());

        }
    }

    // remove parts by ID number
    public static void removeParts(ArrayList<Parts> pList, int _partNumber) {
        for (Parts parts : pList) {
            if (parts.getPartNumber() == _partNumber) {
                pList.remove(parts);
            }
        }
    }
}
