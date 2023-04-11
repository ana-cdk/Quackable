/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quackable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author carol
 */
public class Observable implements QuackObservable {
    ArrayList observers = new ArrayList();
    QuackObservable duck;
    
    public Observable(QuackObservable duck){
        this.duck = duck;
    }
    
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    
    public void notifyObservers(){
        Iterator iterator = observers.iterator();
        while(iterator.hasNext()){
            Observer observer = (Observer)iterator.next();
            observer.update(duck);
        }
    }
}
