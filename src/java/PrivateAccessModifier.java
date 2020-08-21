package java;

public class PrivateAccessModifier {
	
	public static void main(String[] args) {
		ABC obj = new ABC();  
		System.out.println(obj.num); 
		System.out.println(obj.square(10));
	

	}

}
class ABC{
	//private access modifier-accessible in same class only
	 double num = 100;
	   int square(int a){
		return a*a;
	   }

}
