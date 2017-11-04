/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSAL_CA1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author LIM JING JIE
 */
public class Main {

    public static void main(String[] args) {
        
        ProjectFile inputFile = new ProjectFile(new File("Projects.txt"));
        
        try {
            
            inputFile.readFile(inputFile.getFile());
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
