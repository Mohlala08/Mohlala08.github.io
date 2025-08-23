import java.util.Scanner;

public class ClassTest2{



public static boolean isValid(double inBalance,double rate)
{
	if(inBalance>0 && rate>0)
	{
		return true;
	}
	else
	{
		return false;
	}
}
public static double calcTime(double initBal,double finalAmt,double interest)
{
	double time = (finalAmt - initBal)/(initBal*interest);
	return time;
}
public static void displayValues(double initBal,double time,double interest,double finalAmt)
{
	System.out.println("If you invest "+initBal+" for "+time+" years");
	System.out.println("at "+interest+" simple interest per year,");
	System.out.println("you will have "+finalAmt);
}
public static void displayMeanings()
{
		System.out.println("Meanings of symbols in the formula:"); 
 	 	System.out.println("A = final amount"); 
 	 	System.out.println("P = initial balance"); 
 	 	System.out.println("r = annual interest rate"); 
 	 	System.out.println("t = time (in years)"); 
 	 	System.out.println(); 

}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	displayMeanings();
	
	char ans;
	double initBal,finalAmt,interest,time;
	
	
	do{
		
		
		System.out.print("Do you want to contnue?...[Y/N]: ");
		ans = Character.toUpperCase(sc.next().charAt(0));
		
		if(ans == 'Y'){
			
			System.out.print("Please supply the initial balance: R"); 
			initBal=sc.nextDouble(); 
			System.out.print("Please supply the final amount: R"); 
			finalAmt=sc.nextDouble(); 
			System.out.print("Please supply the interest rate as a decimal: ");
			interest=sc.nextDouble(); 
			if(isValid(initBal,interest)){
				
			time = calcTime(initBal,finalAmt,interest);
			displayValues(initBal,time, interest,finalAmt);
				
			}else{
				System.out.println("invalid");
			}
		
		}else{
			
			
		}

		
	}while(ans == 'Y');
	
}}



// public static void method1(){
	// if(){
		// int age = 8;
	// }
	
	// print(age);
// }

// int mainMethod(){
	// int age = 20;
	// print(age)
// }

// if(nds){
	// int age = 5;
// }

// print

