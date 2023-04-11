/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.quackable;

/**
 *
 * @author carol
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
