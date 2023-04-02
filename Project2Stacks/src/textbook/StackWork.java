package textbook;

public class StackWork {
	
	 private int[] S0;
	 private int S0top;   
	 private int S0length;
	   
	 private int[] S1;
	 private int S1top;   
	 private int S1length;
	  
	 private int[] S2;
	 private int S2top;   
	 private int S2length;
	   
	   
	 // Precondition: S0size, S1size, and S2size are greater than 0.
	 // Postcondition: The stacks S0, S1, and S2, are created, and their respective lengths are initialized.
	 public StackWork(int S0size, int S1size, int S2size)
	 {
		 if ((S0size > 0) && (S1size > 0) && (S2size > 0)) {
			 S0 = new int[S0size];
			 S0length = S0size;
			 S0top = -1;
		  
			 S1 = new int[S1size];
			 S1length = S1size;
			 S1top = -1;
		  
			 S2 = new int[S2size];
			 S2length = S2size;
			 S2top= -1;
		 }
	 }

       // Precondition: StackSelector is equal to 0, 1, or 2.
	   // Postcondition: If StackSelector is 0, then the new element x is inserted in stack S0. If StackSelector is 1, 
	   // then the new element x is inserted in stack S1. If StackSelector is 2, then the new element x is inserted 
	   // in stack S2.
	 public void Push(int x, int StackSelector)
	 {	 
		 //code for S0
		 if (StackSelector == 0) {
			 if (S0top == S0length - 1) {
				 throw new java.lang.ArrayIndexOutOfBoundsException();	
			 }
				
			 else {
				 S0[++S0top] = x;
				 //increment the top and set insert x at it's place in the array
			 }
		 }
		 
		 //code for S1
		 else if (StackSelector == 1) {
			 if (S1top == S1length - 1) {
				 throw new java.lang.ArrayIndexOutOfBoundsException();	
			 }
				
			 else {
				 S1[++S1top] = x;	
			 }
		 }
	
		 //code for S2
		 else if (StackSelector == 2) {
			 if (S2top == S2length - 1) {
				 throw new java.lang.ArrayIndexOutOfBoundsException();	
			 }
				
			 else {
				 S2[++S2top] = x;	
			 }
		 }
		 
		 //in case it wasn't 0,1, or 2
		 else {
			 
		 } 
	 }
	   

	   // Precondition: StackSelector is equal to 0, 1, or 2.
	   // Postcondition: If StackSelector is 0, then an element is taken out of stack S0 and is returned to the caller. 
	   // If StackSelector is 1, then an element is taken out of stack S1 and is returned to the caller.
	   // If StackSelector is 2, then an element is taken out of stack S2 and is returned to the caller.
	 
	 public int Pop(int StackSelector)
	 {
		 //S0
		 if (StackSelector == 0) {
			 if (S0top >= 0) {
				 return S0[S0top--];
				 //return the element at the top, then decrease the top so the stack doesn't include that element
			 }
			 
			 else {
				 throw new java.lang.ArrayIndexOutOfBoundsException();
			 }
		 }
		 
		 //S1
		 else if (StackSelector == 1) {
			 if (S1top >= 0) {
				 return S1[S1top--];
			 }
			 
			 else {
				 throw new java.lang.ArrayIndexOutOfBoundsException();
			 }
		 }
		 
		 //S2
		 else if (StackSelector == 2) {
			 if (S2top >= 0) {
				 return S2[S2top--];
			 }
			 
			 else {
				 throw new java.lang.ArrayIndexOutOfBoundsException();
			 }
		 }
		 
		 //in case it is not 0,1,2
		 else {
			 return -1;
		 }

	 }
	   
	   
	   // Precondition: 
	   // Postcondition: The elements of the stack S0 are displayed, followed by the elements of the stack S1, and in the end
	   // the elements of the Stack S2.
	 public void displayStackData()
	 {		 
		 //S0
		 System.out.println("Data in S0:");
		 
		 if (S0top >= 0) {
			 for (int i = 0; i <= S0top; i++) {
				 System.out.print(S0[i] + " ");
			 }
			 
			 System.out.println();
			 //I started from what was first put into the stack and worked until the most recent addition
		 }
		 
		 //S1
		 System.out.println("Data in S1:");
		 
		 if (S1top >= 0) {
			 for (int i = 0; i <= S1top; i++) {
				 System.out.print(S1[i] + " ");
			 }
			 
			 System.out.println();
		 }
		 
		 //S2
		 System.out.println("Data in S2:");
		 
		 if (S2top >= 0) {
			 for (int i = 0; i <= S2top; i++) {
				 System.out.print(S2[i] + " ");
			 }
			 
			 System.out.println();
		 }

	 }

	      
	   // Precondition: The StackWork object exists.
	   // Postcondition: The instance variable S0top is returned.
	 public int getS0top()   
	 {
		 if (this != null) {
			 return S0top;
		 }
		 
		 return -1;
	 }
	   
}
