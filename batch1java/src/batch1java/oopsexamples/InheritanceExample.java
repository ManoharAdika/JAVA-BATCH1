package batch1java.oopsexamples;


class Parent{
	
	public void m1() {
		
		System.out.println("m1 method calling .............");
	}
public void m2() {
		
		System.out.println("m1 method calling .............");
	}
}


public class InheritanceExample extends Parent {

	/*
	 * Definition :  Inherit the properties from one class to another class(superclass to sub
	 * class (or) parent class to child class
	 * 
	 */	
			
				public void m3() {
				
					System.out.println("m1 method calling .............");
				}
				public void m4() {
				
					System.out.println("m1 method calling .............");
				}
				
public static void main(String args[]) {
	
	
           Parent a = new Parent();
           a.m1();
           a.m2();
           
           Parent b = new InheritanceExample();
           b.m1();
           b.m2();
           
           InheritanceExample c = new InheritanceExample();
           
           c.m1();
           c.m2();
           c.m3();
           c.m4();
           
       //    InheritanceExample d = new Parent(); here will get type miss match error
           
           
           
}
	

		

		
	}

