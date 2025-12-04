import java.lang.*;
import java.util.Scanner;

class rectangleArea{
public static void main(String args[]){
//Task 3; Area of circle
System.out.println("Task 3; Area of circle");
Scanner getValue=new Scanner(System.in);
System.out.println("Enter Radius of the circle:");
int r=getValue.nextInt();
float pie=3.14f;
float ca=pie*r*r;
System.out.println("Radius of the circle is " + r);
System.out.println("Value of Pie is " + pie);
System.out.println("Area of the circle is " + ca);
}
}

