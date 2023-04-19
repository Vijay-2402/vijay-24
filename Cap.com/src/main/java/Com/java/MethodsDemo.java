package Com.java;


public class MethodsDemo {
	  static int boxVolume(int l ,int b, int h){ //Static method need not require object creation
		  int volume;
		  volume = l*b*h;
		  return volume;
	}

	public static void main(String[] args) {
		System.out.println(boxVolume(2,4,6));//passing arguments or parameters

	}

}
