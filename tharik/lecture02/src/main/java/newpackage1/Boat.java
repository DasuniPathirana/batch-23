/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

/**
 *
 * @author tharik
 */
public class Boat implements Vehicle {

    @Override
    public void move() {
       System.out.println("Rotating properller");
    }

    @Override
    public void consume() {
        System.out.println("Consuming petrol");
    }
    
}
