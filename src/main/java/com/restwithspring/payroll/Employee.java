package com.restwithspring.payroll;

import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    
    private @Id @GeneratedValue Long id;
    /*private String name; updating to includ first and last name fields
    name is in the old version of the app*/
    private String firstName;
    private String lastName;
    private String role;

    Employee(){}

    Employee(String firstName, String lastName, String role){
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    /**
     * @return @Id @GeneratedValue Long return the id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        String[] parts = name.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    /**
     * @return String return the role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o){
        
        if(this == o)
        return true;
        if(!(o instanceof Employee))
        return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.firstName, employee.firstName) 
        && Objects.equals(this.lastName, employee.lastName) && Objects.equals(this.role, employee.role);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.id, this.firstName, this.lastName, this.role);
    }

    @Override
    public String toString(){
        return "Employee{" + "id=" + this.id + ", firstName='" + this.firstName + '\'' + ", lastName='" + this.lastName + '\'' + ", role ='" + this.role + '\'' + '}';
    }

}
