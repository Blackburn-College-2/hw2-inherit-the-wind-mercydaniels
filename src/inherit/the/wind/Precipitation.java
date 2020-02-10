/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit.the.wind;

/**
 * abstract class to set up rain and snow
 * @author mercy
 */
public abstract class Precipitation {
    double amount;
    String unit;
    public Precipitation(){
        amount = Math.random()* 30 + 1;
    }
    public abstract boolean isPrecipitating();
}
