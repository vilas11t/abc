package basicConcepts;

public class BlocksInJava {
	/*
	// 2types
	1. instance block-
	2. static blocks-
	*/
	
	static int a=0;
	
	public static void main(String[] args) {
		BlocksInJava obj1=new BlocksInJava();
		BlocksInJava obj2=new BlocksInJava();
		BlocksInJava obj3=new BlocksInJava();
		
	}
	
	
	{
	    ++a;
		System.out.println("No of objects created :"+a);
		
	}
	
	
	static{
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("This class is designed to undestand blocks");
		
	  }
	
	

}
