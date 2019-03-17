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
public class PromocjaProcent implements IPromocja {
    
    public PromocjaProcent(){
    }
    
    @Override
    public boolean czyMoge(Car samochod){
        if(samochod.getCena()>10000){
            return true;
        }
        return false;
    }
    
    @Override
    public double nalicz(Car samochod){
        return samochod.getCena() * 0.9;
    }
}
