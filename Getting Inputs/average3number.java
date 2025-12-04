import java.lang.*;
import java.util.Scanner;
class average3number{
public static void main(String args[]){

//Task 6: Average of 3 Numbers
System.out.println("Task 6: Average of 3 Numbers");
Scanner getValue=new Scanner(System.in);
System.out.println("Enter 1st Number:");
int aa=getValue.nextInt();
System.out.println("Enter 2st Number:");
int bb=getValue.nextInt();
System.out.println("Enter 3st Number:");
int cc=getValue.nextInt();
int average=(aa+bb+cc)/3;
System.out.println("a: " + aa + ". b: " + bb + ". c: " + cc + ". Average of the given 3 Number is : " + average);
}
}