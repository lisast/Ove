/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.ove.src;

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author lisastenberg
 */
public class School {
    
    private String name;
    private String address;
    private List<Person> contactPersons;

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public School(String name, String address, List<Person> contactPersons) {
        this.name = name;
        this.address = address;
        this.contactPersons = contactPersons;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Person> getContactPersons() {
        return contactPersons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactPersons(List<Person> contactPersons) {
        this.contactPersons = contactPersons;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + Objects.hashCode(this.address);
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
        final School other = (School) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "School{" + "name=" + name + ", address=" + address + '}';
    }
    
}
