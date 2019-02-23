/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poj1;

/**
 *
 * @author ppisarski
 */
public class Car {
    private String marka;
    private int przebieg;
    private boolean nowy;
    private double cena;
    
    public String getMarka(){
        return this.marka;
    }
    
    public void setMarka(String marka){
        this.marka = marka;
    }
    
    public Car(){
        this.marka = "uzupelnij marke";
        this.przebieg = 1000;
    }
    
    public Car(String marka){
        this.marka = marka;
        this.przebieg = 2000;
    }
    
    public void printCar(){
        System.out.println(this.marka + "; " + this.przebieg + "; " + this.cena);
    }
}
