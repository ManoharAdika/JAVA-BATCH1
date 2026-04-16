package batch1java.oopsexamples;


class A1{
	
	static void  m1() {
		
		System.out.println("m1 method calling...method..");
		
	}
}

public class DataTypesExamples {
		
		public static void main(String args[] ) {
			
			A1.m1();
			
			int e = 1242;
			//Integer
			float f = 1.3f;
			float x = 1.2f;
			//Float
			char c = 'a'; //String is a class and data type in java
			//Character
			String s = "java";
			
			double d = 1111.0000d;
			//Double
			short h= 7;
			//Short
			boolean b = true ;
			//Boolean
			long l = 39489389398l;
			//Long
	        byte t = 127;
	        //Byte
			
			/*
			 * System.out.println("integer value======="+e);//
			 * System.out.println("double value======="+d); System.out.println(f);
			 * System.out.println(s); System.out.println(b); System.out.println(h);
			 * System.out.println(t);
			 * 
			 * System.out.println(f+x);
			 * 
			 */
	        String n = new String("java0");//new constant pool and as well as non constant poo
	        
	        String p = "java";
	        
	        String a1 = "java";//constant
	        
	        String a2 = new String ("java");//non constant pool

	        
	        System.out.println(a1);
	        
	        //
			
		

	}

}
