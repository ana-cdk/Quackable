/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quackable;

/**
 *
 * @author carol
 */
public class RubberDuck implements Quackable {
    Observable observable;

    public RubberDuck() {
	observable = new Observable(this);
    }
 
    public void quack() {
	System.out.println("Squeak");
	notifyObservers();
    }

    public void registerObserver(Observer observer) {
	observable.registerObserver(observer);
    }

    public void notifyObservers() {
	observable.notifyObservers();
    }
  
    public String toString() {
	return "Rubber Duck";
    }
}
