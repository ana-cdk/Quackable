/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quackable;

/**
 *
 * @author carol
 */
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberofQuacks;
    
    public QuackCounter(Quackable duck){
        this.duck = duck;
    }
    
    public void quack(){
        duck.quack();
        numberofQuacks++;
    }
    
    public static int getQuacks(){
        return numberofQuacks;
    }
    
    public void registerObserver(Observer observer) {
	duck.registerObserver(observer);
    }
 
    public void notifyObservers() {
	duck.notifyObservers();
    }
   
    public String toString() {
	return duck.toString();
    }
}
