/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quackable;

/**
 *
 * @author carol
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck =  duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck =  duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        
        System.out.println("Duck Simulator: WIth observer");
        
        Flock flockOfDucks = new Flock();
        
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);
        
        Flock flockOfMallards = new Flock();
        
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();
        
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);
        
        flockOfDucks.add(flockOfMallards);
        
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
      
        simulate(flockOfDucks);
      
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() +
                                " times");
    }
    
    
    void simulate(Quackable duck){
        duck.quack();
    }
}
