/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import observerpattern.Company.Apple;
import observerpattern.Company.IBM;
import observerpattern.Company.Microsoft;
import observerpattern.Observer.Desktop;
import observerpattern.Observer.DisplayBoard;
import observerpattern.Observer.Mobile;

/**
 *
 * @author nguyentrungduc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create stocks
        IBM ibm = new IBM();
        Microsoft microsoft = new Microsoft();
        Apple apple = new Apple();
        
        //create observer
        Mobile mobile = new Mobile();
        DisplayBoard displayBoard = new DisplayBoard();
        Desktop desktop = new Desktop();
        
        //register observer for stock price change
        microsoft.registerObserver(mobile);
        microsoft.registerObserver(displayBoard);
        microsoft.registerObserver(desktop);
        
        ibm.registerObserver(mobile);
        ibm.registerObserver(displayBoard);
        ibm.registerObserver(desktop);
        
        apple.registerObserver(mobile);
        apple.registerObserver(displayBoard);
        apple.registerObserver(desktop);
        
        for(int i = 0; i< 2; i++){
            System.out.println(String.format("Turn %d stock price change", i));
            ibm.updatePrice((int)(Math.random()*101)+1);
            microsoft.updatePrice((int)(Math.random()*101)+1);
            apple.updatePrice((int)(Math.random()*101)+1);
        }
    }
}
