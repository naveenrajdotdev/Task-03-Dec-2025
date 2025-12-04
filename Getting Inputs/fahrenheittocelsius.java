import java.lang.*;
import java.util.Scanner;
class fahrenheittocelsius{
public static void main(String args[]){

//Task 5: Fahrenheit to Celsius Conversion
System.out.println("Task 5: Fahrenheit to Celsius Conversion");
Scanner getValue=new Scanner(System.in);
System.out.println("Enter Fahrenheit Value:");
int fah=getValue.nextInt();
int c=(fah-32)*5/9;
System.out.println("Fahrenheit Value is " + fah);
System.out.println("Celsius value of given fahrenheit value: " + c);

}
}