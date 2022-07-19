package basicConcepts;

public class Methods {
	
	public static void main(String[] args) {
		int d=addition(10,20);
		System.out.println(d);
		System.out.println("Rest of code");
		int x=addition(50, 100);
		System.out.println(x);
		additon1();
		
		int y=factorial(5);
		System.out.println("Factorial:"+y);
		
	}
	
	static int addition(int a, int b) {
		int c;
		c=a+b;
		return c;
	}
	
	
	static void additon1() {
		int a=60,b=30;
		int c;
		c=a+b;
		System.out.println("Addition is:"+c);
		
	}
	
	// write a program to find factorial of number
	// 5- 120,  5= 1*2*3*4*5=120,  4=24
	
	static int factorial(int n) {
		
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		
	return fact;
	}
	
	

}
