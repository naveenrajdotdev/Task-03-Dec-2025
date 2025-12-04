import java.lang.*;
import java.util.Scanner;


class areaoftriangle{
public static void main(String args[]){

//Task 11: Area of the triangle
System.out.println("Task 11: Area of the triangle");
Scanner getValue=new Scanner(System.in);
System.out.println("Enter Base value:");
int base=getValue.nextInt();
System.out.println("Enter Height value:");
int height=getValue.nextInt();
int area=(base*height)/2;
System.out.println("Base of the triangle : " + base);
System.out.println("Height of the triangle : " + height);
System.out.println("Area : " + area);

}
}