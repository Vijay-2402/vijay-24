
package Com.java;

public class Bike {
    void Speed() {
    	System.out.println("Speed");
    }
    void engine() {
    	System.out.println("engine");
    }
    void brake() {
    	System.out.println("brake");
    }
    public static void main(String args) {
    	Bike b = new Bike();
    	b.Speed();
    	b.engine();
    	b.brake();
    	
    }
    
}
