/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author nadio
 */
public class Proj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // Testing all class methods
        Pext p = new Pext("John", "Smith", 22, "M", "Married", "None");
        p.talk();
        
        Teacher dean = new Teacher("Dean", "PhD", "Full-time", 1000, 20, 30);
        Staff lunchLady = new Staff("Lunchlady", 30, 200);
        dean.ComputePayRoll();
        dean.assignDep();
        lunchLady.ComputePayRoll();
        lunchLady.assignDep();
        
        Department d = new Department();
        d.checkDep();
        d.writeToFile();
    }
    
}
