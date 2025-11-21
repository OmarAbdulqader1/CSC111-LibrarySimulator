

/* 1- Omar Abdulqader 446101952
 * 
 * 2- Fahad Alboqami 446103819
 * 
 * 3- Saud AlSayyari 446102327
 */

import java.util.Scanner;

public class LibrarySimulator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//predefined library accounts
		Member Account1 = new Member (111, "Account one", 0);
		Member Account2 = new Member (222, "Account two", 0);
		Member Account3 = new Member (333, "Account three", 0);
		
		
		
		//the library:
		while(true) {
			System.out.println("*Welcome to the Library!*");
			System.out.println();
			System.out.println("Please choose an option:");
			System.out.println("1- login as " + Account1.getname() + " ID number:" + Account1.getid());
			System.out.println("2- login as " + Account2.getname() + " ID number:" + Account2.getid());
			System.out.println("3- login as " + Account3.getname() + " ID number:" + Account3.getid());
			System.out.println("4- login as administrator ");
			System.out.println("5- Exit the program");
			System.out.println("Enter you're pick: ");
			
			int pick = input.nextInt(); //the user's pick
			input.nextLine();
			
			
			if(pick >= 1 && pick <= 3) {
				Member account;
				if(pick == 1)
					account = Account1;
				else if(pick == 2)
					account = Account2;
				else
					account = Account3;
				
				boolean Session_Running = true;
				
				while (Session_Running) {
					System.out.println("\nWhat would you like to do? :");
					System.out.println("1- View you're Borrowed Books");
					System.out.println("2- Borrow a book");
					System.out.println("3- Return a book");
					System.out.println("4- view session summary");
					System.out.println("5- Exit to main menu");
					System.out.println("Enter you're pick: ");
					
				int pick2 = input.nextInt();
				    input.nextLine();
				    
				    switch(pick2) {
				    case 1:
				    	account.viewBorrowedCount();
				    	break;
				    case 2:
				    	account.borrowOne();
				    	break;
				    case 3:
				    	account.returnOne();
				    	break;
				    case 4:
				    	account.displayStatistics();
				    	break;
				    case 5:    //to exit to main menu
				    	System.out.println("session ended. Currently have " + account.getBorrowedCount() + " books");
				    	Session_Running = false;
				    	break;
				    default :
				    	System.out.println("invalid option.");
				    	break;
				    }
				}
			}else if(pick == 4) {
			
					boolean admin = true;
					while (admin) {
						System.out.println();
						System.out.println("What would you like to do?");
						System.out.println("1- View Total Revenue");
						System.out.println("2- View Most Frequent Operation");
						System.out.println("3- Exit to main menu");
						
						int pick3 = input.nextInt();
						input.nextLine();
						
						switch (pick3) {
						case 1:
							//Total Revenue
							System.out.printf("The Total Revenue is: %.2f\n" , Member.TotalRevenue );
							break;
						case 2:
							//comparing between the operations
							if (Member.TotalBorrows > Member.TotalReturns) {
								System.out.println("the most frequent operation is: Borrows");
							} else if (Member.TotalReturns > Member.TotalBorrows) {
								System.out.println("the most frequent operation is: Returns");
							} else if (Member.TotalReturns == 0 && Member.TotalBorrows==0) {
								System.out.println("There are no operations yet");
							} else {
								System.out.println("Borrows and Returns are Tied");
							}
							break;
						case 3:
							//returning to main menu
							admin = false;
							break;
							
							default:
								System.out.println("invalid option.");
								System.out.println();
								break;
						}
								
							}
						
				    //exiting the program
					} else if (pick == 5) {
						System.out.println("Goodbye!!");
						break; //break out of the loop
					} else {
						System.out.println("Invalid option.");
				}
				
			}
		input.close();
		}
		
	}


