/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit.the.wind;

/**
 *
 * @author mercy
 */
public class Wind {

    private double speed;
    private String[] direction = {"North", "South", "West", "East"};
    private String unit;

    public Wind(double speed, String unit) {
        
        this.speed = speed;
        this.unit = unit;
       
    }

    public double getSpeed() {
        return speed;
    }

    public String getUnit() {
        return unit;
    }
    
    public String getDirection(){
        int directionI = (int) Math.random()*3 +1;
        return this.direction[directionI];
    }
}
