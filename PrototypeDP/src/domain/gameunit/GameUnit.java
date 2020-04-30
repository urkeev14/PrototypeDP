/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.gameunit;

import javafx.geometry.Point3D;


/**
 *
 * @author urosv
 */
public abstract class GameUnit implements Cloneable{
    
    private Point3D position;

    public GameUnit() {
        initialize();
    }
    public GameUnit(float xCoordinate, float yCoordinate, float zCoordinate) {
        this.position = new Point3D(xCoordinate, yCoordinate, zCoordinate);
    }
    
    public void move(Point3D direction, float distance){
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }
    public Point3D getPosition(){
        return position;
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        
        GameUnit unit = (GameUnit) super.clone();
        unit.initialize();
        
        return unit;
    }
    protected void initialize(){
        this.position = Point3D.ZERO;
        reset();
    }
    protected abstract void reset();
    
}
