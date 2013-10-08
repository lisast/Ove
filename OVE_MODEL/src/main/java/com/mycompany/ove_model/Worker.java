/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ove_model;

/**
 * A class representing a Worker.
 * 
 * A worker is a person with a salary. 
 * 
 * @author lisastenberg
 */
public class Worker extends Person {
    
    private int salary;
    
    public Worker(int idNumber, String name, String mail, String phoneNbr, String address) {
        super(idNumber, name, mail, phoneNbr, address);
    }

    public Worker(int idNumber, String name, String mail, String phoneNbr, String address, int salary) {
        super(idNumber, name, mail, phoneNbr, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.salary;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Worker{" + "salary=" + salary + '}';
    }
    
}
