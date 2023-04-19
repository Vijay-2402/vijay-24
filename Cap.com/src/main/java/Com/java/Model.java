package Com.java;

public class Model extends Bike {
   void colour () {
	   System.out.println("colour");
   }
   void name () {
	   System.out.println("name");
   }
   public static void main(String args[]) {
	   Model m = new Model();
	   m.colour();
	   m.name();
	   m.colour();
	   m.engine();
	   m.brake();
	   
   }
   
}
