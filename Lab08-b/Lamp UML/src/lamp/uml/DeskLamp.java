/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamp.uml;

/**
 *
 * @author kylee
 */
public class DeskLamp extends Lamp {
    
    private boolean canBendAround;
    private boolean hasLEDBulb;
    private String LEDColor;
    
    public DeskLamp(){
        super();
        this.canBendAround = true;
    }
    
    public void adjustLamp(){
        
    }
    
    public String getLEDColor(){
        return LEDColor;
    }
    
    public void setLEDColor(String s){
        this.LEDColor = s;
    }
    
    public boolean hasLEDBulb(){
        return true;
    }
    
}
