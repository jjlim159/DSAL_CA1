/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSAL_CA1;


/**
 *
 * @author LIM JING JIE
 */
public class Student {
    
    private String name;
    private String adminNo;
    private String course;
    private String gender;
    
    public Student() {
        
    }
    
    public Student(String adminNo, String name, String course, String gender) {
        this.name = name;
        this.adminNo = adminNo;
        this.course = course;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(String adminNo) {
        this.adminNo = adminNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
