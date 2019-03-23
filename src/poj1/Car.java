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
public class Car implements Cloneable {
    private String marka;
    private int przebieg;
    private boolean nowy;
    private double cena;
    
    public Car clone(){
        try {
            Car cloned = (Car) super.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
            return null;
        }
    }
    
    public String getMarka(){
        return this.marka;
    }
    
    public void setMarka(String marka){
        this.marka = marka;
    }


    public double getCena(){
        return this.cena;
    }
       
    public void setCena(double cena){
        this.cena = cena;
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
    
    public void naliczPromocje(Promocja1 p){
    if(p.czyMoge(this)){
        this.cena = p.nalicz(this);
        }
        else{
            System.out.println(this.marka +" nie spelnia warunkow promocji");
        }
    }
    
    public void naliczPromocje(Promocja2 p){
    if(p.czyMoge(this)){
        this.cena = p.nalicz(this);
        }
        else{
            System.out.println(this.marka +" nie spelnia warunkow promocji");
        }
    }
    
    /*
    public void naliczPromocje(IPromocja p){
        if(p.czyMoge(this)){
        this.cena = p.nalicz(this);
        }
        else{
            System.out.println(this.marka +" nie spelnia warunkow promocji");
        }
    }
    */
}
