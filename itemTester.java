

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.*;




public class itemTester {
	
	static int counter=0;
	/**
	 * main class
	 * @param args
	 */
	public static void main(String args[]) {

	
	int max=100;
	int id,q;
	item A[]= new item[max];
	book B;
	gift G;
	int a;
	Scanner sc=new Scanner(System.in);
	/**
	 * loop of the program
	 */
	while(true) {
	System.out.println("\nPlease select option:\n1)Add Item\n2)Purchase\n3)Display\n4)Display books\n5)Display gifts\n6)Remove an Item\n0)Exit");
	a=sc.nextInt();
	if(a!=0 && a!=1 && a!=2 && a!=3 && a!=4 && a!=5 && a!=6) {
		System.out.println("Not recognized");
		continue;
	}
	/**
	 * exit from loop condition
	 */
	else if(a==0) {
		
		System.out.println("Good Bye!");
		break;
	}
	/**
	 * Adding condition
	 */
	else if(a==1) {
		
		System.out.println("Select what to add:\n1)Books\n2)Gifts");
		a=sc.nextInt();
		/**
		 * condition to add books inside the initial condition 
		 */
		if(a==1) {
			B=new book();
			System.out.printf("Title:");
			B.setTitle(sc.next());
			System.out.printf("Author:");
			B.setAuthor(sc.next());
			System.out.printf("Year of publish:");
			B.setYear(sc.nextInt());
			System.out.printf("Price of the book:");
			B.setPrice(sc.nextDouble());
			System.out.printf("Quantity:");
			B.setQty(sc.nextInt());
			A[counter]=B;
			counter++;
			A[counter-1].setItem_id(counter);
		}
	/**
	 * condition to add gifts inside the initial condition 
	 */
	else if(a==2) {
		
		G=new gift();
		sc.nextLine();
		System.out.printf("label:");
		G.setLabel(sc.nextLine());
		System.out.printf("Manufacturer:");
		G.setManuf(sc.nextLine());
		System.out.printf("Price of the Gift:");
		G.setPrice(sc.nextDouble());
		System.out.printf("Quantity:");
		G.setQty(sc.nextInt());
		A[counter]=G;
		counter++;
		A[counter-1].setItem_id(counter);
	}
	
	}
	
	else if(a==2) {
		
		
		System.out.print("ID to purchase an item:");
		id=sc.nextInt();
		for(int k=0;k<counter;k++) {
			if(A[k]!=null)
		{
			if((A[k].getItem_id())==id) {
				System.out.print("Please tell the quantity:");
				q=sc.nextInt();
				
				A[k].setQty(A[k].getQty()-q);
				if(A[k].getQty()<=0)
					A[k]=null;
					
			}
			
			
		}
		}
	item.Purchased();	
		
	}
	/**
	 * Display condition
	 */
	else if(a==3) {
		for(item x: A)
		{
			if(x!=null)
				x.Display();
		}
	}
	/**
	 * Display books
	 */
	else if(a==4) {
		ArrayList<book> list=new ArrayList<book>();
		for(item x : A) {
		if(x instanceof book)
		{
			list.add((book)x);
		}
		}
		 Collections.sort(list, new Comparator<book>() {
		        @Override
		        public int compare(book o1, book o2) {
		            return o1.getAuthor().compareTo(o2.getAuthor());
		        }
	});
		 for(book bk: list) {
			 bk.Display();
		 }
	}
	/**
	 * Display gifts	
	 */
	else if(a==5) {
		
		ArrayList<gift> list=new ArrayList<gift>(); //array list for gift
		for(item x : A) {
		if(x instanceof gift) //loop for gift items
		{
			list.add((gift)x); //adding gift to x object
		}
		}
		 Collections.sort(list, new Comparator<gift>() {
		        public int compare(gift a, gift b) {
		            return a.getLabel().compareTo(b.getLabel());
		        }
	});
		 for(gift gt: list) {
			 gt.Display();
		 }
		
		
	}
		/**
		 * deleting items by id
		 */
	else if(a==6) {
		
		

		System.out.print("ID to delete an item:");
		id=sc.nextInt(); //getting id here
		// 
		for(int k=0;k<counter;k++) //loop for array
		{
			if(A[k]!=null)
		{
			if((A[k].getItem_id())==id) //comparing ids
			{
					A[k]=null;
					counter--;
					
			}
			
			
		}
		}
		
	}
			
	}
	sc.close();
	
	
	}
}
