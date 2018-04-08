//AUTHOR: Thar Soe
//modified: 02/22/2018

import java.util.Scanner;


public class TocEntryDriver {
	
public static void main (String [] args) {
	

		final int TOCSIZE = 100; 

		TocEntry toc[] = new TocEntry[TOCSIZE]; 
		int toc_curlength = 0;
		String title = " ";
		int page = 0;
		int maxTitle = 0;
		
		Scanner input = new Scanner(System.in); 
		
		while (!"****".equals(title)) {
		
		System.out.println("Enter the chapter title: ");
		title = input.nextLine(); 
		
		if (title.equals("****")) {
			
			break; 
		}
		
		System.out.println ("Enter the starting page number: "); 
		page = input.nextInt(); 
		
		input.nextLine();  
		
		toc[toc_curlength] = new TocEntry(title, page); 
		
		toc_curlength++; 
		
		
		if (toc_curlength > 100) {
			
			System.out.println ("Too many entries");
			System.exit(0); 
			
		}

		}

		
	
		for (int count = 0; count < toc_curlength; count++) {
			
		
		System.out.println(toc[count]); 
			
			
		}
		
			
		}
		

}
	
	
	
	