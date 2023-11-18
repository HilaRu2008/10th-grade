import java.util.Scanner;

public class Main
{
    
    
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    
	    
	    
	    //ex num 1
	    
	    System.out.println("enter a number : ");
	    int number = scan.nextInt();
	    if (number >= 0)
	    {
	        System.out.println(number + " is positive");
	        
	    }
	    
	    else 
	    {
	        System.out.println(number + " is negative");
	    }
	    
	    
	    //ex num 2
	    
	    System.out.println("enter number x: ");
	    int x = scan.nextInt();
	    System.out.println("enter number y: ");
	    int y = scan.nextInt();
	    
	    if (x > y) 
	    {
	        System.out.println("number x is bigger");
	    }
	    
	    else
	    {
	        System.out.println("number y is bigger");
	    }
	  
	    
	    
	    // ex number 3
	    
	    System.out.println("enter letter 1: ");
	    String rider1 = scan.next();
	    System.out.println("enter letter 2: ");
	    String rider2 = scan.next();
	    
	    System.out.println("enter distace1: " );
	    int d1 = scan.nextInt();
	    System.out.println("enter distace2: " );
	    int d2 = scan.nextInt();
	    
	    System.out.println("enter speed1: " );
	    int speed1 = scan.nextInt();
	    System.out.println("enter speed2: " );
	    int speed2 = scan.nextInt();
	    
	    double t1 = d1 / speed1;
	    double t2 = d2 / speed2;
	    
	    // WHO WILL TAKE LESS TIME?
	    if (t1 > t2)
	        System.out.println(rider2);
	    if (t1 < t2)
	        System.out.println(rider1);
	    if (t1 == t2)
	        System.out.println("equal");
	    
	    
	    
	   //ex number 4:
	   
	   System.out.println("enter grade 1: ");
	   int grade1 = scan.nextInt();
	   System.out.println("enter grade 2: ");
	   int grade2 = scan.nextInt();
	   System.out.println("enter grade 3: ");
	   int grade3 = scan.nextInt();
	   
	   float avg = (float)(grade1+grade2+grade3) / 3;
	   System.out.println(avg);
	   
	   
	   
	   
	   
	   //ex 5
	   
	   System.out.println("enter num 1: ");
	   int num1 = scan.nextInt();
	   System.out.println("enter num 2: ");
	   int num2 = scan.nextInt();
	   System.out.println("enter num 3: ");
	   int num3 = scan.nextInt();
	   
	   int min = num1;
	   if (num2 < min)
	        min = num2;
	   
	   if (num3 < min)
	        min = num3;
	        
	   System.out.println(min);

	}
}
