import java.util.Scanner;

public class ScannerClass{
   public static void main(String[] args){

Scanner sc= new Scanner(System.in);
System.out.println("Please enter Student Name: ");
String Sname = sc.nextLine();
System.out.println("Please enter sub1 Marks");
float sub1 = sc.nextFloat();
System.out.println("Please enter sub2 Marks");
float sub2 = sc.nextFloat();
System.out.println("Please enter sub3 Marks");
float sub3 = sc.nextFloat();
System.out.println("Please enter sub4 Marks");
float sub4 = sc.nextFloat();
System.out.println("Please enter sub5 Marks");
float sub5 = sc.nextFloat();
System.out.println("Please enter sub6 Marks");
float sub6 = sc.nextFloat();

float total = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;

System.out.println("Nmae" + Sname);
System.out.println("Enterd sub1 marks are" + sub1);
System.out.println("Enterd sub2 marks are" + sub2);
System.out.println("Enterd sub3 marks are" + sub3);
System.out.println("Enterd sub4 marks are" + sub4);
System.out.println("Enterd sub5 marks are" + sub5);
System.out.println("Enterd sub6 marks are" + sub6);
System.out.println("Total marks are : " + total);
   
   }
}