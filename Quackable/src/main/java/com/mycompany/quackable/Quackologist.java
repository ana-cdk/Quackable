/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quackable;

/**
 *
 * @author carol
 */
public class Quackologist implements Observer {
    public void update(QuackObservable duck){
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
    public String toString() {
	return "Quackologist";
    }
}
