/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author nguyentrungduc
 */
public interface Observable {
    public void registerObserver(Observer O);
    public void notifyObservers();
    public void removeObserver(Observer O);
}
