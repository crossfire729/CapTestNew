import java.io.*;
import java.util.*;
public class Main{
 public static void main(String args[]){
	Scanner scan  = new Scanner(System.in);
	System.out.println("Enter 1 for addition, 2 for multiplication");
	int option  = scan.nextInt();
	Operation operation=null; 
	switch(option){
		case 1: operation = new Addition();break;
		case 2: operation = new multiplication();break;
		default: System.out.println("Please enter a valid input");
	}
	double a = scan.nextDouble();
        double b = scan.nextDouble();
	System.out.println(operation.method(a,b));
 }
}
