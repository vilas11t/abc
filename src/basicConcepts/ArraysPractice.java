package basicConcepts;

public class ArraysPractice {
	
	/*
	// Arrays- collection elements of same data type.
	
	2 type
	1. Signle dim
	2. multi dim- matrix
	
	- Arrays stores element in continous memory location.
	- fast to access
	- Array element index starts from 0.
	
	
	
	*/
	
	public static void main(String[] args) {
		/*
		int a[]= {2,4,7,23,89}; // 
		//System.out.println(a[1]);
		
		int a1[]=new int[100];
		
		int k=10;
		for(int i=0;i<100;i++) {
			a1[i]=k;
			k=k+10;
		}
		
		for(int i=0;i<100;i++)
		  System.out.println(a1[i]);
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	*/
	     int a;
		int[][] matrix= new int[2][2];
		
		matrix[0][0]=4;
		matrix[0][1]=5;
		matrix[1][0]=6;
		matrix[1][1]=7;
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++)
				System.out.print(matrix[i][j]+" ");
			
			System.out.println();
		}
			
		
		
		
		
		
		
		          
		
	}
	
	
	 void m1() {
		int a;
		
	}

}
