package javaArray;

public class FinallyExample {
	public static void main(String[] args) {
		String str = null;
		 try {
			 System.out.println(str.length());
		 } 
		 catch (ArithmeticException ae)
		 { 
			 System.out.println(ae.getMessage());
		 }
		 finally 
		 {
			 System.out.println("programme completed");
		 }
	}
	
	
	

}
