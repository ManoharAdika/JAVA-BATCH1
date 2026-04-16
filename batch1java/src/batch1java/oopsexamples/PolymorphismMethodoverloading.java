package batch1java.oopsexamples;




public class PolymorphismMethodoverloading {
	
	static int a(int x,int y) {
		
		return x+y;
	}
	
	static double a(double x,double y) {
		
		return x+y;
	}
	
	
	
	public static void main(String args[]) {
		
		int n = a(8,9);
		double m = a(4.5,5.5);
		
		System.out.println(n);
		System.out.println(m);
		
	}

}
