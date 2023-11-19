package gradeYud;


import java.util.Scanner;


public class yud_grage {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    
	    //ex num 1
	    
	    System.out.println("enter name: ");
	    String name = scan.nextLine();
	    System.out.println("enter age: ");
	    int age = scan.nextInt();
	    System.out.println("your name is: " + name);
	    System.out.println("your age is: " + age);
	    
	    
	    //ex num 2
	    
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
	   
	   
	   

	   
	    
	   
	   //ex 7 
	   
	   System.out.println("enter the difference: ");
	   int d = scan.nextInt();
	   System.out.println("enter the first num in the series: ");
	   int first_num = scan.nextInt();
	   
	   int index10 = first_num + (10 - 1) * d;
	   System.out.println("index 10 = "  + index10);
	   
	   int index5 = first_num + (5 - 1) * d;
	   System.out.println("index 5 = "  + index5);
	   
	    
	    
	    
	    //ex 8
	    
	   double price_for_one = 1.2;
	   int price_for_ten = 10, price_for_54 = 50;
	   
	   int compleat , reminder;
	   double u_need_to_pay = 0;
	
	   System.out.println("how many popsicals u want to buy: ");
	   int amount = scan.nextInt();
	   
	   
	   if ((amount > 49)&&(amount<55))
	   {
		   u_need_to_pay = 50;
		   System.out.println(u_need_to_pay);
	   }
	   
	   else if (amount < 50)
	   {
		   compleat = amount / 10; //int / any number will output int
		   reminder = amount % 10;
		   u_need_to_pay= (compleat * 10) + (reminder * 1.2);
		   System.out.println(u_need_to_pay);
	   }
	   
	   else if (amount < 10)
	   {
		   u_need_to_pay = amount * 1.2;
		   System.out.println(u_need_to_pay);
	   }
	   
	   else if (amount == 108)
	   {
		   u_need_to_pay = 100;
		   System.out.println(u_need_to_pay);
	   }
	   
	   else if ((amount > 54) && (amount <108))
	   {
		   compleat = (amount - 54)/10;
		   reminder = (amount - 54) % 10;
		   u_need_to_pay = 50 + (compleat * 10) + (reminder * 1.2);
		   System.out.println(u_need_to_pay);
	   }
			   
			
	    
	    //ex 9
	    
	    System.out.println("enter first and last name: ");
	    String name = scan.next();
	    System.out.println("enter your school name: ");
	    String school = scan.next();
	    System.out.println("enter num of subjects: ");
	    String subjects = scan.next();
	    
	    System.out.println("My name is " + name +  ", My school is "+ school+ ", The number of subjects I study is" + subjects);
	    
	    
	    
	    
	    //ex10
	    
	    System.out.println("enter 3-digit number: ");
	    int num = scan.nextInt();
	    int num1 = num % 10;
	    int num2 = num / 10 % 10;
	    int num3 = num / 100;
	    int sum = num1 + num2 + num3;
	    System.out.println(sum);
	    if (sum % 2 == 0)
	    	System.out.println("this number is even");

	    else
	    	System.out.println("this number is odd");
	    
	    

	}

}
