/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit.the.wind;

/**
 * Determines the morning temperature based on the previous day's weather
 * @author mercy
 */
public class MorningTemperature extends Temperature{
    double temp;
 public MorningTemperature(double temperature, String unit){
    super(temperature, unit); 
    temp = temperature;
}
    @Override
    public double tempChange() {
       
    }
    
}
