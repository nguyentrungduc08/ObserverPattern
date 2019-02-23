/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stock;

import Interface.Observer;
import Interface.Observable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguyentrungduc
 */
public abstract class Stock implements Observable{
    private List<Observer> observers;
    private String name;
    private int price;
    
    
    public Stock() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observer != null) {
            this.observers.add(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : this.observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observer != null) {
            this.observers.remove(observer);
        }
    }
    
    public int getPrice() {
        return this.price;
    }
    
    public void updatePrice(int newPrice) {
        this.price = newPrice;
        this.notifyObservers();
    }
    
    public void setName(String stockName) {
        this.name = stockName;
    }
    
    public String getName() {
        return this.name;
    }
            
}
