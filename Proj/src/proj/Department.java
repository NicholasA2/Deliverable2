/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;
import java.io.*;
/**
 *
 * @author nadio
 */
public class Department{
    Teacher dean = new Teacher("Dean", "PhD", "Full-time", 1000, 20, 30);
    Staff lunchLady = new Staff("Lunchlady", 30, 200);
    
    //if they are assigned to a department already taken there is an error
    public void checkDep() throws Exception{
        if (dean.assignDep() == lunchLady.assignDep()) {
            throw new Exception("There is already someone assigned to that department!");
        }
    }
    
    public void writeToFile() {
        try {
           FileOutputStream write = new FileOutputStream("Departments"); 
           ObjectOutputStream o = new ObjectOutputStream(write);
           o.writeObject(dean);
           o.writeObject(lunchLady);
           o.close();
        }
    
    catch (IOException e) {
        System.out.println("Error");
    }
}
    }

