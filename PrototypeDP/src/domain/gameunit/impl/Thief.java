/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.gameunit.impl;

import domain.gameunit.GameUnit;

/**
 *
 * @author urosv
 * 
 * This class DOES NOT SUPPORT CLONING.
 */
public class Thief extends GameUnit{
    
    private String state = "idle";
    
    public void steal(){
        this.state = "is stealing...";
    }

    @Override
    public String toString() {
        return "Thief " + state + " @" + getPosition();
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset not supported"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException(this.getClass().getSimpleName() + " does not support clonning !");
    }
    
    
    
    
    
}
