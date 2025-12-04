import java.lang.*;
import java.util.Scanner;

class swapNumber{
public static void main(String args[]){

//Task 10: Swap number
System.out.println("Task 10: Swap number");
Scanner getValue=new Scanner(System.in);
System.out.println("Enter X Value");
int x=getValue.nextInt();
System.out.println("X Value is: " + x);
System.out.println("Enter Y Value");
int y=getValue.nextInt();
System.out.println("Y Value is:" + y);
int z=x;
x=y;
y=z;
System.out.println("Values swapped:");
System.out.println("X = " + x);
System.out.println("Y = " + y);
}
}