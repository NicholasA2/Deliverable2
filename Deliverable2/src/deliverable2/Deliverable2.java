/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable2;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author 2145747
 */
public class Deliverable2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
                // Testing all class methods
        
        Teacher dean = new Teacher("Dean", "PhD", 1000, 20, 30, "Jeanne", "Lovelace", 22, "F", "Married");
        Staff lunchLady = new Staff("Lunchlady", 30, 200, "Joanne", "Jone", 45, "F", "Single");
        dean.ComputePayRoll();
        dean.assignDep();
        lunchLady.ComputePayRoll();
        lunchLady.assignDep();
        
        Department d = new Department();
        d.checkDep();
        d.writeToFile();
    }
    
}
