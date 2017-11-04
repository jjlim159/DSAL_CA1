/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSAL_CA1;

import java.util.ArrayList;

/**
 *
 * @author LIM JING JIE
 */
public class Project {
    
    private String title;
    private String school;
    private String supervisor;
    private int noOfStudents;
    private ArrayList<Student> students;
    
    public Project(String title, String school, String supervisor, int noOfStudents, ArrayList<Student> students) {
        this.title = title;
        this.school = school;
        this.supervisor = supervisor;
        this.noOfStudents = noOfStudents;
        this.students = students;
    }
    
    public Project() {
    }
    
    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    
}
