/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

/**
 *
 * @author nadio
 */
public class Pext extends Person{
    String ex;
    
    public Pext(String fname, String lname, int age, String gender, String status, String ex) {
        super(fname, lname, age, gender, status);
        this.ex = ex;
    }
    public void setEx(String ex) {
        this.ex = ex;
    }
    public String getEx() {
        return ex;
    }
    @Override
    public String toString() {
        return ex + "";
    }
    @Override
    public boolean equals(Person person) {
        if (this == person) {
            return true;
        }
        else {return false;}
    }
    @Override
    public void talk(){}
}
