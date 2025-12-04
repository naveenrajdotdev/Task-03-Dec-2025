import java.lang.*;
import java.util.Scanner;

class rectangleArea{
public static void main(String args[]){

//Task 2: Area of rectangle
System.out.println("Task 2: Area of rectangle");
Scanner getValue=new Scanner(System.in);
System.out.println("Enter Length of the rectangle:");
int l=getValue.nextInt();
System.out.println("Enter Width of the rectangle:");
int w=getValue.nextInt();
int ra=l*w;
System.out.println("Length of the rectangle is " + l);
System.out.println("breadth of the rectangle is " + w);
System.out.println("Area of the rectangle is " + ra);

}
}