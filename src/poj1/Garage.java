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
public class Garage {
    private Car[] samochody;
    private int ilosc;
    
    public Garage(Car samochod){
        this.samochody[0] = samochod;
        this.setIlosc();
    }
    
    public int getIlosc(){
        return this.ilosc;
    }
    
    public void setIlosc(){
        this.ilosc = this.samochody.length;
    }
}
