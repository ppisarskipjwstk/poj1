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
public class Promocja1 {
    public boolean czyMoge(Car samochod){
        if(samochod.getCena()>300){
            return true;
        }
        return false;
    }
    
    public double nalicz(Car samochod){
        return samochod.getCena() * 0.9;
    }
}
