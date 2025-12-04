import java.lang.*;
import java.util.Scanner;

class compoundFormula{
public static void main(String args[]){

//Task 9: Compound formula
System.out.println("Task 9: Compound formula");
Scanner getValue=new Scanner(System.in);
System.out.println("Enter principal Amount:");
int p=getValue.nextInt(); //Principal amount
System.out.println("Enter Interest rate:");
int r=getValue.nextInt();  //Intrest rate
int amount=p+(p*r/100);
System.out.println("Principal amount " + p);
System.out.println("Interest rate " + r);
System.out.println("Compount interest " + amount);

}
}