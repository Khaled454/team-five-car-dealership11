package edu.psu.abington.ist.ist242;
/*
Project: Car Dealership Application
Course: IST 242
Author: Team 5
Date Developed: 6/15/2020
Last Date Changed:6/26/2020
Rev: development build 1
*/
//To do with salesAdvisor Setrole to interact with customers, to add customers and print customers. As well as print saleadvisor information

import java.util.ArrayList;

public class SalesAdvisor extends Person{

   // private int advisorId; Do we really need an AdvisorID?-Khaled

    public SalesAdvisor(String firstName, String lastName, String emailAddress, String phoneNumber,role role) {
        super(firstName, lastName, emailAddress, phoneNumber,role);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String getEmailAddress() {
        return super.getEmailAddress();
    }

    @Override
    public void setEmailAddress(String emailAddress) {
        super.setEmailAddress(emailAddress);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }


    //public int getAdvisorId() {
     //   return advisorId;
    //}

  //  public void setAdvisorId(int _advisorId) {
     //   this.advisorId = _advisorId;
   //}



    public static void printSalesAdvisor(ArrayList<SalesAdvisor> sList){
        for (SalesAdvisor SD: sList){
            System.out.println("First Name:" + SD.getFirstName());
            System.out.println("Last Name:" + SD.getLastName());
            System.out.println("Email Address:" + SD.getPhoneNumber());
            System.out.println("Phone number: "+SD.getPhoneNumber()+"\n");
        }
    }

SalesAdvisor salesAdvisor1 = new SalesAdvisor("Steve","James","SteveJ12@gmail.com","18132138927", Person.role.SalesAdvisor);
SalesAdvisor salesAdvisor2 = new SalesAdvisor("Alex","Potor","Alexp13@gmail.com","18132138928", Person.role.SalesAdvisor);

}
