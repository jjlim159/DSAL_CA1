/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSAL_CA1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LIM JING JIE
 */
public class ProjectFile {

    private File file;

    public ProjectFile(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void readFile(File inputFile) throws FileNotFoundException, IOException, ClassNotFoundException {
        //File outFile = new File("output.txt");

        ArrayList<Student> studentList = null;
        int noOfStudents = 1; int noOfProjects = 0;
        int count = 1;
        String title; String school; String supervisor; Project project = null; 
        ArrayList<Project> projectList = new ArrayList<>();

        Scanner scan = new Scanner(new FileReader(inputFile));
        String line = null;

        while (scan.hasNextLine()) {
            studentList = new ArrayList<>();
            
            if (count == 1) {
                line = scan.nextLine();
                noOfProjects = Integer.parseInt(line);
                System.out.println(line);
            }

            line = scan.nextLine();
            String[] projectInfo = line.split(",", 5);
            noOfStudents = Integer.parseInt(projectInfo[3]);
            String[] studentInfo = projectInfo[4].split(",");

            Student student = null;
             
            for (int k = 0; k < studentInfo.length; k+=4) {
                //new Student(AdminNo, Name, Course, Gender)
                student = new Student(studentInfo[k], studentInfo[k+1], studentInfo[k+2], studentInfo[k+3]);
                studentList.add(student); //Add new Student to List
            }

            title = projectInfo[0];
            school = projectInfo[1];
            supervisor = projectInfo[2];
            project = new Project(title, school, supervisor, noOfStudents, studentList);
            
            System.out.println(line);
            count++;
            
            projectList.add(project);
        }

        for (Student stud: studentList) {
            System.out.println(stud.getAdminNo() + stud.getCourse() + stud.getGender() + stud.getName());
        }
        
        writeToFile(project);
        
        scan.close();
    }

    public void writeToFile(Project project) {
        try {
            int count = 0;
            
            PrintWriter pw = new PrintWriter(new FileOutputStream("output.txt"));
            
            pw.println("Title: " + project.getTitle());
            pw.println("School: " + project.getSchool());
            pw.println("Supervisor: " + project.getSupervisor());
            pw.print("Students: ");
            
            ArrayList<Student> studentList = project.getStudents();
            
            for (Student student: studentList) {
                if (count < studentList.size()-1) {
                    pw.print(student.getName() + " ==> ");
                    count++;
                }
                else {
                    pw.print(student.getName());
                }
            }
            
            pw.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
