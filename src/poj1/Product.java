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
public class Product {
    
    private String kod;
    private String nazwa;
    private double cena;
    
    public Product(String kod, String nazwa, double cena){
        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
    }
    
    /**
     * zwraca cene
     * @return aktualna cena produktu
     */
    public double getCena(){
        return this.cena;
    }
    
    public void setCena(double cena){
        this.cena = cena;
    }
    
    @Override
    public String toString(){
        return this.nazwa + "; cena: " + this.cena;
    }
    
}
