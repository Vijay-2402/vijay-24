package Com.java;

public class Hornet extends Model {
    void Price() {
    	System.out.println("Price");
    }
    void Mileage() {
    	System.out.println("Mileage");
    }
	public static void main(String[] args) {
		Hornet h=new Hornet();
		h.Price();
		h.Mileage();
		//methods of grandparent class
		h.Speed();
		h.engine();
		h.brake();
		//methods of parent class
		h.colour();
		h.name();

	}

}
