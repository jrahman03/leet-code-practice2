// Name: Jewel Rahman
// Class: CS211
// Date: 5/26/22
// Instructor: Craig Niiyama
// Description: This is the Test Class for the 4 methods created in ArrayIntList
public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testUpToNowTotal();
		testIsPairSorted();
		testRemoveLast();
		testRemoveFront();
	}
	
	// This method tests upToNowTotal
	public static void testUpToNowTotal() {
		
		//test variables
		int test_list[] = {2, 3, 5, 4, 7, 15, 20, 7};
		
		// creating new array to manipulate
		ArrayIntList list = new ArrayIntList(test_list);
		
		//calling the upToNowTotal in list2
		ArrayIntList list2 = list.upToNowTotal();
		
		//printing returned values in the list
		System.out.println(list2);
	}
	
	// This method Tests isPairSorted
	public static void testIsPairSorted() {
		
		//test variables
		int test_listT[] = {3, 8, 2, 5, 19, 24, -3, 0, 4, 4, 8, 205, 42};
		
		// creating new array to manipulate
		ArrayIntList listT = new ArrayIntList(test_listT);
		
		//printing manipulated list (true)
		System.out.println(listT.isPairSorted());
		
		//another test list to prove when false
		int test_listF[] = {1, 9, 3, 17, 4, 28, -5, -3, 0, 42, 308, 409, 19, 17, 2, 4};
		
		//new ArrayIntList for false test
		ArrayIntList listF = new ArrayIntList(test_listF);
		
		//printing manipulated list (false)
		System.out.println(listF.isPairSorted());
	}
	
	// This method tests RemoveLast
	public static void testRemoveLast() {
		
		// test list
		int test_list[] = {8, 17, 9, 24, 42, 3, 8};
		
		// creating new array to manipulate
		ArrayIntList list = new ArrayIntList(test_list);
		
		// calling the removeLast method upon the list
		list.removeLast(4);
		
		//printing the manipulated list
		System.out.println(list);
		
	}
	
	//This method tests RemoveFront
	public static void testRemoveFront() {
		
		// test list
		int test_list[] = {8, 17, 9, 24, 42, 3, 8};
		
		// creating new array to manipulate
		ArrayIntList list = new ArrayIntList(test_list);
		
		// calling the removeLast method upon the list
		list.removeFront(4);
		
		//printing the manipulated list
		System.out.println(list);
		

	}

}
