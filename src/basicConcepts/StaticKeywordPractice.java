package basicConcepts;

public class StaticKeywordPractice {
	
	/*
	 Static 
	 1.variable
	 2.blocks
	 3.methods. 
	 4.inner class
	 
	 
	 
	 method
	 static method-   static method- yes
	 non static -- static - no(need to create object)
	 
	 non static-  non static--- yes
	 
	 */
	
	
	static int a=20;   //variable
	
	static {
		System.out.println("Static block");
	}
	
	
	static void method1() {
		System.out.println("This is stratic method");
	}
	
	public static void main(String[] args) {
		StaticKeywordPractice obj1=new StaticKeywordPractice();
		System.out.println(a);
		method1();
		obj1.method2();
		A a=new A();
		a.m1();
	}
	
	
	
	
	static class A{
		void m1() {
			System.out.println("This is inner class method");
		}
	}
	
	
	void method2() {
		method1();
		method3();
		System.out.println("This is non static method");
	}
	
	
	void method3() {
		System.out.println("Non static method3");
	}
	
	
	

}
