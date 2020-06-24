package edu.psu.abington.ist.ist242;

import java.time.LocalDate;
import java.util.ArrayList;

public class SalesLead extends Person {

    //  for sales leads, we should only need basic information about the non-converted customer

    private int leadId;
    SalesLead.department dept;

    public enum department {
        SALES, GENERAL
    }

    public SalesLead(SalesLead.department dept, int salary, LocalDate hireDate, int employeeID, String firstName, String lastName, String emailAddress, String phoneNumber, String address, boolean status, role role) {
        super(firstName, lastName, emailAddress, phoneNumber, address, status, role);
        this.dept = dept;
        setRole(role.SALESMAN);
    }
    //Constructor

    // setters/getters

    public int getLeadId() {
        return leadId;
    }
    public void setLeadId(int _leadId) {
        this.leadId = _leadId;
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

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean isStatus() {
        return status;
    }

    @Override
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public role getRole() {
        return role;
    }

    @Override
    public void setRole(role role) {
        this.role = role;
    }


    //  class methods
    public static void listSalesLeads(ArrayList<SalesLead> leadList) {
        for (SalesLead leads : leadList) {
            System.out.println("Lead ID: " + leads.getLeadId());
            System.out.println("First Name: " + leads.getFirstName());
            System.out.println("Last Name: " + leads.getLastName());
            System.out.println("Email: " + leads.getEmailAddress());
            System.out.println("Phone: " + leads.getPhoneNumber());
        }
    }
}

/*

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String _lastName) {
        this.lastName = _lastName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String _lastName) {
        this.lastName = _lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String _email) {
        this.emailAddress = _email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhone(String _phoneNumber) {
        this.phoneNumber = _phoneNumber;
    }
 */
