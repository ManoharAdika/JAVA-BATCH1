package batch1java.oopsexamples;

class A{
	
	
	public void m1() {
		
		System.out.println("A class m1 method calling ............");
	}
	public void m2() {
		
		System.out.println(" A class m2 method calling ............");
	}
	public void m3() {
	
	System.out.println("A class m3 method calling ............");
	}
}

class B{
	public void m6() {
		System.out.println("Bclass m6 method calling ............");
	}
}


public class InheritanceExample extends A{
	
public void m4() {
		
		System.out.println(" InheritanceExample m4 method calling ............");
	}
public void m5() {
		
		System.out.println(" InheritanceExample m5 method calling ............");
	}

				
public static void main(String args[]) {
	
	
		//child to child
		InheritanceExample inheritanceExample = new InheritanceExample();
		
		inheritanceExample.m5();
		inheritanceExample.m1();
		inheritanceExample.m2();
		inheritanceExample.m3();
		inheritanceExample.m4();
		
		
		A a = new InheritanceExample();//parent to child
		
		a.m1();
		a.m2();
		a.m3();
		
		
		A a1 = new A();//parent to parent
		
		a1.m1();
		a1.m2();
		a1.m3();
		
		
		
		
	//InheritanceExample InheritanceExample2 = new A();//child to parent
		

	
}
	
		
}

