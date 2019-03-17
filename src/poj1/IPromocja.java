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
public interface IPromocja {
    double kwotaRabatu = 101;
    
    boolean czyMoge(Car samochod);
    
    double nalicz(Car samochod);
}
