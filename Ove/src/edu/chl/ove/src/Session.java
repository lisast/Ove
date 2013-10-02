/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.ove.src;

import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author lisastenberg
 */
public class Session {
    
    private GregorianCalendar startTime;
    private GregorianCalendar endTime;
    private int nbrOfStudents;
    private List<Worker> tutors;
    private String notation;

    public Session(GregorianCalendar startTime, GregorianCalendar endTime, int nbrOfStudents, List<Worker> tutors) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.nbrOfStudents = nbrOfStudents;
        this.tutors = tutors;
    }

    public GregorianCalendar getStartTime() {
        return startTime;
    }

    public GregorianCalendar getEndTime() {
        return endTime;
    }

    public int getNbrOfStudents() {
        return nbrOfStudents;
    }

    public List<Worker> getTutors() {
        return tutors;
    }
    
    public String getNotation() {
        return notation;
    }

    public void setStartTime(GregorianCalendar startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(GregorianCalendar endTime) {
        this.endTime = endTime;
    }

    public void setNbrOfStudents(int nbrOfStudents) {
        this.nbrOfStudents = nbrOfStudents;
    }

    public void setTutors(List<Worker> tutors) {
        this.tutors = tutors;
    }
    
    public void setNotation(String notation) {
        this.notation = notation;
    }
    
}
