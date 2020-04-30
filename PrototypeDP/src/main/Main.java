/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.gameunit.impl.Swordsman;
import javafx.geometry.Point3D;

/**
 *
 * @author urosv
 */
public class Main {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman swordsman = new Swordsman();
        swordsman.move(new Point3D(-10,0,0), 20);
        swordsman.attack();
        
        System.out.println(swordsman);
        System.out.println("***********");
        
        Swordsman clonedSwordsman = (Swordsman) swordsman.clone();
        System.out.println(clonedSwordsman);
    }
    
}
