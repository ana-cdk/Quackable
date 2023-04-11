/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quackable;

/**
 *
 * @author carol
 */

import java.util.Iterator;
import java.util.*;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();
    
    public void add(Quackable quacker){
        quackers.add(quacker);
    }
    
    public void quack(){
        Iterator iterator = quackers.iterator();
            while(iterator.hasNext()){
                Quackable quacker = (Quackable)iterator.next();
                quacker.quack();
            }
    }
    
    public void registerObserver(Observer observer){
        Iterator iterator = quackers.iterator();
        while(iterator.hasNext()){
            Quackable quacker = (Quackable)iterator.next();
            quacker.registerObserver(observer);
        }
    }
    
    public void notifyObservers(){}
    
    public String toString(){
        return "Flock of Ducks";
    }
}
