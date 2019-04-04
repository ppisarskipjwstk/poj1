/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poj1;

/**
 *
 * @author pawel
 */
public class Driver implements Cloneable {
    private String imie;
    
    public Driver(String imie){
        this.imie = imie;
    }
    
    public String getImie(){
    return this.imie;
    }
    
    public void setImie(String imie){
        this.imie = imie;
    }
    
    //klonowanie
    public Driver clone(){
        try {
            Driver clonedDriver = (Driver) super.clone();
            return clonedDriver;
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
            return null;
        }
    }
}
