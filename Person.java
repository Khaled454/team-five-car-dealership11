package edu.psu.abington.ist.ist242;

public class Person {

    String firstName;
    String lastName;
    String emailAddress;
    String phoneNumber;
    String address;
    boolean status;
    role role;

    public enum role {
        MANAGER, SALESMAN, CUSTOMER
    }

    public Person(String firstName, String lastName, String emailAddress, String phoneNumber, String address, boolean status, role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.status = status;
        this.role = role;
    }

    public boolean hasRole(String role){
        boolean hasRole;
        if(role.equals(this.role)){
            hasRole = true;
        }
        else {
            hasRole = false;
        }
        return hasRole;
    }

    public role getRole(){
        return role;
    }

    public void setRole(role role){
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
