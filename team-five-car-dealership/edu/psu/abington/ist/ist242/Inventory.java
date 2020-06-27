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
//To do make the search inventory

import java.util.ArrayList;         //  suggest modifications:

public class Inventory {

    //Data members for the Inventory
    private ArrayList carList;
    private ArrayList partsList;

    private String make;
    private String model;
    private int year;
    private String color;


    //Constructor Methods
    public Inventory() {
        carList = new ArrayList<Cars>();
        partsList = new ArrayList<Parts>();
    }

    //  added these to search
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

    public int getYear() {
        return year;
    }

    public void setYear(int _year) {
        this.year = _year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String _color) {
        this.color = _color;
    }

    //Setters and getters

    public Cars getCars(int _car) {
        return (Cars) carList.get(_car);
    }

    public void setCars(Cars _car) {
        carList.add(_car);
    }


    public Parts getParts(int _part) {
        return (Parts) partsList.get(_part);
    }

    public void setParts(Parts _part) {
        partsList.add(_part);
    }

    public void searchCarInventory(ArrayList<Cars> carList) {
        for (Cars search : carList) {
            System.out.println("Make: " + getMake());
        }
    }
}

//We need to have something to allow to exit the search