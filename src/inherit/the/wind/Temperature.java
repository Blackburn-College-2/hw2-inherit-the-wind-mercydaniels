/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit.the.wind;

/**
 * Abstract class to set up the basic blueprint for the morning and midday temps
 * @author mercy
 */
public abstract class Temperature {
    private double temperature;
    private String unit;

    public Temperature(double temperature, String unit) {
        this.temperature = temperature;
        this.unit = unit;
    }
    
    public abstract double tempChange();
}
