package gradeYud;
import java.util.Random;
import java.util.Scanner;
import java.util.random;

public class str_try {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/* ex1
		
		System.out.println("enter name 1 : ");
		String name1 = scan.next();
		System.out.println("enter name 2 : ");
		String name2 = scan.next();
		System.out.println("enter name 3 : ");
		String name3 = scan.next();
		
		//String max_name = name1;
		
		if ((name1.compareTo(name2) < 0) && (name1.compareTo(name3) < 0))  //if name1 < name2 and name1 < name3
		{
			if (name2.compareTo(name3) < 0) // if name2 < name 3
			{
				System.out.println(name1);
				System.out.println(name2);
				System.out.println(name3);
			}
			else //(name3.compareTo(name2) < 0) // if name3 < name2
			{
				System.out.println(name1);
				System.out.println(name3);
				System.out.println(name2);
			}
				
		}
		
		else if ((name2.compareTo(name1) < 0) && (name2.compareTo(name3) < 0))  //if name2 < name1 and name2 < name3
		{
			if (name1.compareTo(name3) < 0) // if name1 < name 3
			{
				System.out.println(name2);
				System.out.println(name1);
				System.out.println(name3);
			}
			
			else
			{
				System.out.println(name2);
				System.out.println(name3);
				System.out.println(name1);
			}
		}
		
		else if ((name3.compareTo(name1) < 0) && (name3.compareTo(name2) < 0))  //if name3 < name1 and name3 < name2
		{
			if (name2.compareTo(name1) < 0) // if name2 < name1
			{
				System.out.println(name3);
				System.out.println(name2);
				System.out.println(name1);
			}
			
			else
			{
				System.out.println(name3);
				System.out.println(name1);
				System.out.println(name2);
			}
		}
		
		else
		{
			System.out.println("all names are the same");
		}
		
		
		
		
		//ex2
		
		System.out.println("enter a 4- words sentence: ");
		String sentence = scan.nextLine(); // nextLine- to make it read the whole sentence with spaces
		
		System.out.println(sentence.length());
		
		
		
		
		//ex3
		
		System.out.println("enter a 3-chars word: ");
		String word = scan.next();
		if(word.charAt(0) == word.charAt(2))
		{
			System.out.println("True");
		}
		
		else
		{
			System.out.println("False");
		}
		
		
		
		//ex4
		
		
		System.out.println("enter a 3-chars word: ");
		String word = scan.next();
		System.out.println("" + word.charAt(2) + word.charAt(1) + word.charAt(0));
		
		
		
		
		
		System.out.println("enter a 4 letter string: ");
		String text = scan.next();
		char letter = '*';
		
		if (text.charAt(0) == 'a' || text.charAt(0) == 'e' || text.charAt(0) == 'i' || text.charAt(0) == 'o' || text.charAt(0) == 'u' )
		{
			// text = ("" + text.indexOf(text.charAt(0)) + letter + text.indexOf(letter + 1));	
			text = ("" + letter + text.substring(1));
			
		}

			
			
		if (text.charAt(1) == 'a' || text.charAt(1) == 'e' || text.charAt(1) == 'i' || text.charAt(1) == 'o' || text.charAt(1) == 'u' )
			
		{
			letter = '*';
			// text = ("" + text.indexOf(text.charAt(0)) + letter + text.indexOf(letter + 1));	
			text = (""  + text.charAt(0)+ letter + text.charAt(2) + text.charAt(3));
		}
		

		
		if (text.charAt(2) == 'a' || text.charAt(2) == 'e' || text.charAt(2) == 'i' || text.charAt(2) == 'o' || text.charAt(2) == 'u' )
			
		{
			text = (""  + text.charAt(0)+ text.charAt(1) + letter + text.charAt(3));
		}

		
		
		
		if (text.charAt(3) == 'a' || text.charAt(3) == 'e' || text.charAt(3) == 'i' || text.charAt(3) == 'o' || text.charAt(3) == 'u' )
			
		{
			text = (""  + text.charAt(0)+ text.charAt(1) + text.charAt(2) + letter);
		}

		System.out.print(text);

   
		
		
		// ex6
		
		
		Random r  = new Random();
		
		int num = r.nextInt(100);
		
		
        if (num / 10 == 0) 
            System.out.println( num + " is a one digit number");
        
        
        else
            System.out.println( num + " is a two digit number");
        
		
        
        if (num % 2 == 0) 
            System.out.println("can be divided by 2");
        
        
        else
        	System.out.println("cannot be divided by 2");
        
        if (num % 3 == 0)
            System.out.println( "can be divided by 3");
        
		
        else
        	System.out.println("cannot be divided by 3");
		
        
        
		 //ex 7
		
		System.out.println("enter x1: ");
		int x1 = scan.nextInt();
		
		System.out.println("enter y1: ");
		int y1 = scan.nextInt();
		
		System.out.println("enter x2: ");
		int x2 = scan.nextInt();
		
		System.out.println("enter y2: ");
		int y2 = scan.nextInt();
		
        double d = Math.sqrt( Math.pow( (x1-x2) , 2) +  Math.pow( (y1 - y2) , 2) );
        System.out.println("distance: " + d);
        */
        
	}

}
