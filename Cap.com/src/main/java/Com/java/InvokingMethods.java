package Com.java;
class Student {
	char name;
	int rollNo;
	int marks;
}

public class InvokingMethods {
    static void marksTotal(){
    	 System.out.println("List of the student are :");
     }
	public static void main(String[] args) {
        Student vijay = new Student();
        vijay.rollNo=7;
        vijay.marks=478;
        
        Student ajay=new Student();
        ajay.rollNo=6;
        ajay.marks=475;
        
        System.out.println(vijay.marks);
        System.out.println(ajay.rollNo);
        
        

	}

}
