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
public class PromocjaRabat implements IPromocja {
    
    public PromocjaRabat(){
    }
    
    @Override
    public boolean czyMoge(Car samochod){
        return true;
    }
    
    @Override
    public double nalicz(Car samochod){
        return samochod.getCena() - IPromocja.kwotaRabatu;
    }
}
