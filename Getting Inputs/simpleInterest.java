import java.lang.*;
import java.util.Scanner;

class simpleInterest{
public static void main(String args[]){

//Task 1: Simple interest
System.out.println("Task 1: Simple interest");
Scanner getValue=new Scanner(System.in);
System.out.println("Enter the Principal Amount:");
int p=getValue.nextInt();
System.out.println("Enter the Interest Rate:");
int r=getValue.nextInt();
System.out.println("Enter Time period:");
int t=getValue.nextInt();
int si=(p*r*t)/100;

System.out.println("Principal amount is : " + p);
System.out.println("Interest Rate is : " + r);
System.out.println("Total Time period : " + t);
System.out.println("Simple interest calculation : " + si);
}
}