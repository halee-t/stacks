package workingPackage;

import textbook.StackWork;

public class packetSelector {
	
	static StackWork packets = null;

	public static void main(String[] args) {
		
		System.out.println("Packet selector is now running...");
		
		packets = new StackWork(10, 10, 10);
		
		packets.Push(95, 0);
		packets.Push(103, 0);
		packets.Push(81, 0);
		packets.Push(120, 0);
		packets.Push(74, 0);
		packets.Push(134, 0);
		packets.Push(62, 0);
		packets.Push(101, 0);
		packets.Push(59, 0);
		packets.Push(148, 0);
		
		packets.displayStackData();
		
		reorganizeNetworkTraffic();
		
		packets.displayStackData();
	}
	
	// Precondition: The StackWork object packets is different than null.
		// Postcondition: The elements of the stack S0 that are equal to, or less than 100, are inserted in the stack S1.
		// The elements of the stack S0 that are greater than 100 are inserted in the stack S2.
	public static void reorganizeNetworkTraffic()   
	{ 
		if (packets != null) {
			
			int top = packets.getS0top();
			
			for (int i = 0; i <= top; i++) {
				int element = packets.Pop(0);	//this is how you get each element of S0
				
				if (element <= 100) {
					packets.Push(element, 1);	//goes to S1
				}
				
				else if (element > 100) {
					packets.Push(element, 2);	//goes to S2
				}
			}
		}
	} 

}
