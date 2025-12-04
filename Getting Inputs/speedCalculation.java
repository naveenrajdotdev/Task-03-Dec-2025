import java.lang.*;
import java.util.Scanner;

class speedCalculation{
public static void main(String args[]){
	
//Task 8: Speed Calculation
System.out.println("Task 8: Speed Calculation");
Scanner getValue=new Scanner(System.in);
System.out.println("Enter total Distance:");
int distance=getValue.nextInt();
System.out.println("Enter total Time:");
int time=getValue.nextInt();
int speed=distance/time;
System.out.println("Total Distance " + distance);
System.out.println("Total Time " + time);
System.out.println("Speed Calculation " + speed);
}
}