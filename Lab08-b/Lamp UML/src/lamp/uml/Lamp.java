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
public class Lamp {
    
    private static Lamp instance;

    public static Lamp getInstance() {
        if (instance == null){
            instance = new Lamp();
        }
        return instance;
    }
    
    private String lampShadeColor;
    private boolean isOn;
    private boolean hasLightBulb;
    
    
    public Lamp(){
        super();
        this.hasLightBulb = true;
        this.isOn = false;
        this.lampShadeColor = "black";
    }
    
    public String getLampShadeColor(){
        return lampShadeColor;
    }
    
    public void setLampShadeColor(String s){
        this.lampShadeColor = s;
    }
    
    public boolean isOn(){
        return false;
    }
    
    public boolean isOff(){
        return false;
    }
    
    public boolean hasLightBulb(){
        return false;
    }
    
    public String toString(){
        return "";
    }
    
    public void hasElectricty(){
        
    }
    public void pushButton(){
        
    }
    
    
    
    
}
