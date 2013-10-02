/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.ove.src;

/**
 *
 * @author lisastenberg
 */
public class Person {

    private int idNumber;
    private String name;
    private String mail;
    private String phoneNbr;
    private String address;
    
    public Person(int idNumber, String name, String mail, String phoneNbr, String address) {
        this.idNumber = idNumber;
        this.name = name;
        this.mail = mail;
        this.phoneNbr = phoneNbr;
        this.address = address;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getPhoneNbr() {
        return phoneNbr;
    }

    public String getAddress() {
        return address;
    }
    
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr = phoneNbr;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.idNumber;
        return hash;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o == null) {
            return false;
        } else if(this == o) {
            return true;
        } else if(this.getClass() != o.getClass()) {
            return false;
        } else {
            Person tmp = (Person)o;
            return this.getIdNumber() == tmp.getIdNumber();
        }
    }
    
}
