import java.lang.*;
import java.util.Scanner;
class celsiustofahrenheit{
public static void main(String args[]){

//Task 4: Celsius to Fahrenheit Conversion
System.out.println("Task 4: Celsius to Fahrenheit Conversion");
Scanner getValue=new Scanner(System.in);
System.out.println("Enter Celsius value:");
int cel=getValue.nextInt();
float fah=(cel*9/5)+32;
System.out.println("Celsius Value is " + cel);
System.out.println("Fahrenheit Value of given Celsius Value " + fah);
}
}