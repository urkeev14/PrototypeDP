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
 * This class SUPPORTS CLONING
 */
public class Swordsman extends GameUnit {

    private String state = "idle";

    public void attack() {
        this.state = "attacking";
    }

    @Override
    public String toString() {
        return "Swordsman " + state + " @" + getPosition();
    }

    @Override
    protected void reset() {
        this.state = "idle";
    }

}
