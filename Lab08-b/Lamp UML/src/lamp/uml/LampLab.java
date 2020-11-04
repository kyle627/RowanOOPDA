
package lamp.uml;

/**
 *
 * @author kylee
 */
public class LampLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        lamp.setLampShadeColor("Blue");
        System.out.println(lamp.getLampShadeColor());
    }
    
}
