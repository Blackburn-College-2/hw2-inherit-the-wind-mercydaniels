/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit.the.wind;

/**
 *Determines if it is raining for the next day's temperature
 * @author mercy
 */
public class Rain extends Precipitation{
    boolean raining;
    public Rain (){
        
    }
    public boolean isPrecipitating(){
        
        if(morningTemp() > 32){
           raining = true;
            return true;
        } else {
            raining = false;
            return false;
        }
        
    }
    @Override
    public String toString(){
        if(raining){
            System.out.println("Precipitation :" + amount + "Rain");
        }
}
