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

        //1. Tworzymy obiekty klasy samochod 
        Car samochod = new Car();
        samochod.setMarka("seat");
        Car drugi = new Car("audi");
        System.out.println("Poczatkowa: ");
        samochod.setCena(20000);
        drugi.setCena(30000);
        samochod.printCar();
        drugi.printCar();

        //2. dodajemy obiekty na liste
        List<Car> lista = new ArrayList<Car>();
        lista.add(samochod);
        lista.add(drugi.clone());
        System.out.println("Na liscie: ");
        lista.get(0).printCar();
        
        //3. zmieniamy obiekt na liscie - bez klonowania
        lista.get(0).setMarka("toyota");
        System.out.println("Po zmianie na liscie: ");
        lista.get(0).printCar();
        System.out.println("Po zmianie w obiekcie: ");
        samochod.printCar();
        
        //4. drugi samochod jest dodany jako klon - i tez zmieniamy mu marke
        lista.get(1).setMarka("mazda");
        System.out.println("Klonowanie. Po zmianie na liscie: ");
        lista.get(1).printCar();
        System.out.println("Klonowanie. Po zmianie w obiekcie: ");
        drugi.printCar();

        //5. konstruktor kopiujacy
        Car trzeci = new Car(drugi);
        trzeci.printCar();
        drugi.setMarka("zmieniona");
        System.out.println("Konstruktor kopiujący");
        drugi.printCar();
        trzeci.printCar();
        
        //6. driver
        Driver kierowca = new Driver("Adam");
        samochod.setKierowca(kierowca);
        System.out.println("Kierowca");
        System.out.println(samochod.getKierowca().getImie());
        System.out.println(kierowca.getImie());
        kierowca.setImie("Jednak nie Adam");
        System.out.println("Kierowca po zmianie");
        System.out.println(samochod.getKierowca().getImie());
        System.out.println(kierowca.getImie());
        
        //7. klonowanie i driver
        Car klon = samochod.clone();
        kierowca.setImie("Bolek");
        System.out.println("Kierowca po klonowaniu samochodu");
        System.out.println(samochod.getKierowca().getImie());
        System.out.println(klon.getKierowca().getImie());
      
        //8. w klonowanym samochodzie sklonuj tez jego drivera
        
        //interfejs        
  /*
        samochod.setCena(20000);
        drugi.setCena(30000);
        
        System.out.println("przed naliczeniem promocji");
        samochod.printCar();
        drugi.printCar();
        
        IPromocja procent = new PromocjaProcent();
        IPromocja rabat = new PromocjaRabat();
        samochod.naliczPromocje(procent);
        drugi.naliczPromocje(rabat);
        System.out.println("po naliczeniu promocji");
        samochod.printCar();
        drugi.printCar();
  */

    }
    
}
