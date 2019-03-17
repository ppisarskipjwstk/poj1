/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poj1;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println("Poczatkowa: ");
        samochod.printCar();

        Car drugi = new Car("audi");
        
//        Car[] tablica = new Car[10];
//        tablica[0]=new Car();
//        tablica[0].setMarka("bmw");
//        tablica[0].printCar();
        
        List<Car> lista = new ArrayList<Car>();
        lista.add(samochod);
        lista.add(drugi.clone());
        lista.add(new Car("listowy"));
        System.out.println("Na liscie: ");
        lista.get(0).printCar();
        
        //dodajemy samochod na liste i zmieniamy mu marke - bez klonowania
        lista.get(0).setMarka("toyota");
        System.out.println("Po zmianie na liscie: ");
        lista.get(0).printCar();
        System.out.println("Po zmianie w obiekcie: ");
        samochod.printCar();
        
        //drugi samochod jest dodany jako klon - i tez zmieniamy mu marke
        lista.get(1).setMarka("mazda");
        System.out.println("Klonowanie. Po zmianie na liscie: ");
        lista.get(1).printCar();
        System.out.println("Klonowanie. Po zmianie w obiekcie: ");
        drugi.printCar();
        
        //interfejs        
        samochod.setCena(20000);
        drugi.setCena(30000);
        
        System.out.println("przed naliczeniu promocji");
        samochod.printCar();
        drugi.printCar();
        
        IPromocja procent = new PromocjaProcent();
        IPromocja rabat = new PromocjaRabat();
        samochod.naliczPromocje(procent);
        drugi.naliczPromocje(rabat);
        System.out.println("po naliczeniu promocji");
        samochod.printCar();
        drugi.printCar();
        
    }
    
}
