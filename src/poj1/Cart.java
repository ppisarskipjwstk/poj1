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
public class Cart {
    private List<Product> lista;
    private double suma;
    
    /**
     * konstruktor
     */
    public Cart(){
        this.lista = new ArrayList<Product>();
        this.suma = 0;
    }
    
    /**
     * dodaje produkt
     * @param p 
     */
    public void addProduct(Product p){
        this.lista.add(p);
        this.suma+=p.getCena();
    }
}
