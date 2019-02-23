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
public class Poj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car samochod = new Car();
        samochod.setMarka("seat");
        samochod.printCar();

        Car drugi = new Car("audi");
        drugi.printCar();
        
        Car[] tablica = new Car[10];
        tablica[0].setMarka("bmw");
    }
    
}
