
package race;

public class Wheels {
    private static final double MAX_WHEEL_SIZE = 20;
    private String brand;
    private double size;
    
    public Wheels(String brand, double size) {
        this.brand = brand;
        this.size = size;
    }
    
    public double getFactor() {
        return this.size / MAX_WHEEL_SIZE ;
    }
}
