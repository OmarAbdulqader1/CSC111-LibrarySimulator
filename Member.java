
public class Member {
	
	/* 1- Omar Abdulgader 446101952
	 * 
	 * 2- Fahad Alboqami 446103819
	 * 
	 * 3- Saud AlSayyari 446102327
	 */
	
 //instance attributes
 private int id;
 private String name;
 private int borrowedCount;
 

 private int numViewBorrowed;
 private int numBorrows;
 private int numReturns;
 private double sessionFees;
 
 
 public static double TotalRevenue;
 public static int TotalViewBorrowed;
 public static int TotalBorrows;
 public static int TotalReturns;
 
 //Methods
 
 //Constructor
 public Member(int id, String name, int borrowedCount) {
	 this.id=id;
	 this.name=name;
	 this.borrowedCount=borrowedCount;
 }
 
 private boolean canBorrow() {
	 return borrowedCount < 5;  //cannot borrow more than 5 books
 }
 private boolean canReturn() {
	 return borrowedCount > 0; //can return only when there are books
 }
 
//view borrowed books
 public void viewBorrowedCount() {              
	 System.out.println("You currently have: " + borrowedCount + " Book(s)");
	 System.out.println();
	 numViewBorrowed++;
	 TotalViewBorrowed++;
 }
 //borrowing a book
 public boolean borrowOne() {                 
	 if(canBorrow()) {             //if books < 5
		 System.out.println("borrowed 1 book. Fee = 0.50");
			System.out.println();
		borrowedCount++;
		numBorrows++;
		TotalBorrows++;
		sessionFees+=0.50;
		TotalRevenue+=0.50;
		
		return true;
	 }
	 else {                      //if books >= 5
		 System.out.println("you can't borrow more than 5 books");
	        System.out.println();
		 return false;
	 }
	
 }
 //returning a book
 public boolean returnOne() {   
	 if (canReturn()) {         //if books > 0
		 System.out.println("you returned 1 book successfully");
			System.out.println();
		borrowedCount--;
		numReturns++;
		TotalReturns++;
		return true;
	 }
	 else {                    //if books <= 0
		 System.out.println("you have no books to return");
		    System.out.println();
		return false;
	 }
 }
 //prints session's statistics
 public void displayStatistics() {
	 System.out.println();
	 System.out.println("Session Summary:");
	 System.out.println();
	 System.out.println("You have borrowed " + numBorrows + " Book(s)");
	 System.out.println("You have returned " + numReturns + " Book(s)");
	 System.out.println("You have viewed you're books " + numViewBorrowed + " times");
	 System.out.println("You're Fees: " + sessionFees);
	 System.out.println();
 }
 //resets session statistics
 public void reset() {
	 numViewBorrowed=0;
	 numBorrows=0;
	 numReturns=0;
	 sessionFees=0;
 }
 public String getname() {
	 return name;
 }
 public int getid() {
	 return id;
 }
 public int getBorrowedCount() {
	 return borrowedCount;
 }
 
 
}

