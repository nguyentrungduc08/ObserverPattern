/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern.Observer;

import Interface.Observer;
import Stock.Stock;

/**
 *
 * @author nguyentrungduc
 */
public class Mobile implements Observer{

    @Override
    public void update(Stock stock) {
        System.out.println("MOBILE - The Price of "+stock.getName()+" has changed:"+stock.getPrice());
    }
    
}
