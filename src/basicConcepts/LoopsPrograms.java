package basicConcepts;

public class LoopsPrograms {

	public static void main(String[] args) {
		//checkPrimeNumber(23);
		patternProgram();
	}
	
	// to check prime no.
	 // 7- 1, 7
	//n -  2 to n-1
	
	static void checkPrimeNumber(int n) {
		int temp=0;
		
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				temp=1;
			    break; 
			}
		}
		
		if(temp==1) 
			System.out.println("Not prime no");
		else 
			System.out.println("Prime no.");
		
		}
		
	/*
	 
	 *     i=1
	 **    i=2
	 ***
	 ****
	 *****
	 
	 */
	
	static void patternProgram() {
		
		for (int i = 1; i <=5; i++) {
			
			for(int j=1;j<=i;j++) {
			   System.out.print(j);
			}
			
		 System.out.println();
		}
	}
		
	
}
