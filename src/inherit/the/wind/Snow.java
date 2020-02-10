/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit.the.wind;

/**
 * Determines if it is snowing for the next day's temperature
 * @author mercy
 */
public class Snow extends Precipitation{

   boolean snowing;
    public Snow(){
        
        amount = amount * 10;
        if (middayTemp() <= 32){
            snowing = true;
        } else {
            snowing = false;
        }
    }
    public boolean isPrecipitating(){
        return snowing;
    }
   @Override
    public String toString(){
        if(snowing){
            System.out.println("Precipitation :" + amount + "Snow");
        }
    
}
