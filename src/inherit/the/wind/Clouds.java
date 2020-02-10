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
public class Clouds {
    private String[] cloudLevel = {"none","light","medium","heavy"};
    public String getCloudRandom(){
      String  randCloudLevel = cloudLevel[(int)Math.random() * 4 + 1];
      return randCloudLevel;
    }
            
}
