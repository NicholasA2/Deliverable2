/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;
import java.io.*;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author nadio
 */
public class Staff implements PayRoll{
    String duty;
    int workload;
    double salary;
    
    
    public Staff(String duty, int workload, double salary) {
        this.duty = duty;
        this.workload = workload;
        this.salary = salary;
    }
    public void setDuty(String duty) {
        this.duty = duty;
    }
    public void setWorkload(int workload) {
        this.workload = workload;
    }
    public String getDuty() {
        return duty;
    }
    public int getWorkload() {
        return workload;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public void ComputePayRoll() { 
        if (workload <= 40) {
        salary = (workload * 32 * 2) * 0.75;
        }
        else{System.out.println("Error");}
    }
    
    public String assignDep() throws Exception{
    //Assigns values in file to variables,
    //then assigns variable randomly to class
    ArrayList<String> deps = new ArrayList<String>();
    File file = new File("Departments");
    try (Scanner input = new Scanner(file);) {
    String row = input.nextLine();
    String[] strs = row.split(" ");
    deps.add(strs[0]);
    deps.add(strs[1]);
    deps.add(strs[2]);
    }
    catch (FileNotFoundException e) {
        System.out.println("File not found");
    }
    String assign = deps.get((int)Math.random() * (2 - 0 + 1));
    if (assign == null) {
        throw new Exception("Error");
    }
    return assign;
    }
}
