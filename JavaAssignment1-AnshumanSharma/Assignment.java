// Basic Java:
// 1) Write a program to calculate the area of a circle, rectangle, or triangle based on user input.
//
// import java.util.Scanner;
// class Assignment{
//     public static void main(String[] args) {
//         int choice;
//         double area;
//         System.out.println("Enter 1 to calculate area of circle.");
//         System.out.println("Enter 2 to calculate area of rectangle.");
//         System.out.println("Enter 3 to calculate area of triangle.");
//         Scanner sc = new Scanner(System.in);
//         choice = sc.nextInt();
//         switch (choice) {
//             case 1:
//                 System.out.print("Enter radius of circle:");
//                 int radius = sc.nextInt();
//                 area = 3.14*radius*radius;
//                 System.out.println("Area of circle = " +area);
//                 break;
//
//             case 2:
//                 System.out.print("Enter length of rectangle:");
//                 int length = sc.nextInt();
//                 System.out.print("Enter breadth of rectangle:");
//                 int breadth = sc.nextInt();
//                 area = length*breadth;
//                 System.out.println("Area of rectangle = " +area);
//                 break;
//
//             case 3:
//                 System.out.print("Enter first side of traingle:");
//                 int side1 = sc.nextInt();
//                 System.out.print("Enter second side of traingle:");
//                 int side2 = sc.nextInt();
//                 System.out.print("Enter third side of traingle:");
//                 int side3 = sc.nextInt();
//                 float semiPerimeter = (side1+side2+side3)/2;
//                 area = Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3));
//                 System.out.println("Area of triangle = " +area);
//                 break;
//             default:
//                 System.out.println("Invalid input");
//                 break;
//         }
//     }
// }
//
// 2) Create a program to check if a number is even or odd.
//
// import java.util.Scanner;
// class Assignment
// {
//     public static void main(String[] args) 
//     {
//         int num;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number:");
//         num = sc.nextInt();
//
//         if(num%2==0)
//         {
//             System.out.println(num+" is even");
//         }
//         else
//         {
//             System.out.println(num+" is odd");
//         }
//     }
// }
//
// 3) Implement a program to find the factorial of a given number.
//
// import java.util.Scanner;
// class Assignment{
//     public static void main(String[] args) {
//         int factorial = 1; int num;
//         System.out.print("Enter a number to find factorial:");
//         Scanner sc = new Scanner(System.in);
//         num = sc.nextInt();
//         for(int i = 1; i<=num; i++){
//             factorial *= i;
//         }
//         System.out.println("Factorial of "+num +" = "+ factorial);
//     } 
// }
//
// 4) Write a program to print the Fibonacci sequence up to a specified number.
//
// import java.util.Scanner;
// class Assignment{
//     public static void main(String[] args) {
//         int t1=-1, t2=1; int next;
//         System.out.print("Enter a number till the Fibonacci sequence should be printed:");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//
//        while(true){
//             next = t1+t2;
//             if(next>=n){
//                 break;
//             }
//             System.out.print(next+" ");
//             t1 = t2;
//             t2=next;
//         }
//     }
// }
//
// 5) Use loops to print patterns like a triangle or square.
//
// import java.util.Scanner;
//
// class Assignment {
//     public static void main(String[] args) {
//         int choice;
//         System.out.println("Enter 1 for Triangle Pattern and 2 for Square Pattern:");
//         Scanner sc = new Scanner(System.in);
//         choice = sc.nextInt();
//         if (choice == 1) {
//             System.out.println("Enter number of rows for a triangle:");
//             int rows = sc.nextInt();
//             for (int i = 1; i <= rows; i++) {
//                 for (int j = rows; j >= i; j--) {
//                     System.out.print(" ");
//                 }
//                 for (int j = 1; j <= i; j++) {
//                     System.out.print("* ");
//                 }
//                 System.out.println();
//             }
//         } else if(choice==2){
//             System.out.println("Enter number of rows for a Square:");
//             int rows = sc.nextInt();
//             for (int i = 0; i < rows; i++) {
//                 if (i == 0 || i == rows - 1) {
//                     for (int j = 1; j <= rows; j++) {
//                         System.out.print("* ");
//
//                     }
//                     System.out.println("");
//                     continue;
//                 }
//                 System.out.print("*");
//                 for (int j = 1; j < rows - 1; j++) {
//                     System.out.print("  ");
//                 }
//                 System.out.print(" *");
//                 System.out.println("");
//             }
//         }
//         else{
//             System.out.println("Invalid choice");
//         }
//     }
// }
//
// Data Types and Operators:
// 1) Explain the difference between primitive and reference data types with
// examples.
//
// Primitive Data Types: These are basic data types provided by Java that hold simple values directly in memory. Stored directly in the stack memory. Contains actual values, not references. More efficient in terms of memory and performance. Eg. int, boolean, char, etc.
// Reference Data Types: These are data types that hold the memory address of an object. Stored in the heap memory with references
// Example: String, Array, etc.
//
// 2) Write a program to demonstrate the use of arithmetic, logical, and relational operators.
//
//
// import java.util.Scanner;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();
//
//         System.out.println("\n--- Arithmetic Operators ---");
//         System.out.println("Addition: " + (a + b));
//         System.out.println("Subtraction: " + (a - b));
//         System.out.println("Multiplication: " + (a * b));
//         System.out.println("Division: " + (a / b));
//
//         System.out.println("\n--- Relational Operators ---");
//         System.out.println(a + " == " + b + " : " + (a == b));
//         System.out.println(a + " != " + b + " : " + (a != b));
//         System.out.println(a + " > " + b + " : " + (a > b));
//         System.out.println(a + " < " + b + " : " + (a < b));
//
//         System.out.println("\n--- Logical Operators ---");
//         boolean condition1 = (a > 0);
//         boolean condition2 = (b > 0);
//         System.out.println("Both numbers positive (AND): " + (condition1 && condition2));
//         System.out.println("At least one positive (OR): " + (condition1 || condition2));
//         System.out.println("Negation of condition1: " + !condition1);
//
//         sc.close();
//     }
// }
// 3) Create a program to convert a temperature from Celsius to Fahrenheit and
// vice versa.
//
// import java.util.Scanner;
// public class Assignment {
//     public static void main(String[] args) {
//         float celsius, fahrenheit;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter 1 to convert Celsius to Fahrenheit and 2 to convert Fahrenheit to Celsius:;");
//         int choice = sc.nextInt();
//         if (choice==1) {
//             System.out.print("Enter temperature in Celsius:");
//             celsius = sc.nextFloat();
//             fahrenheit = (float) (celsius * 9 / 5 + 32);
//             System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
//         }
//         else if (choice==2) {
//             System.out.print("Enter temperature in Fahrenheit:");
//             fahrenheit = sc.nextFloat();
//             celsius = (float) (fahrenheit - 32) * 5 / 9;
//             System.out.println("Temperature in Celsius is: " + celsius);
//         }
//         else{
//             System.out.println("Invalid choice");
//         }
//
//     }
// }
//
// Control Flow Statements:
// 1) Write a program to check if a given number is prime using an if-else
// statement.
//
// import java.util.Scanner;
//
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         if (num <= 1) {
//             System.out.println("Number is not prime");
//             System.exit(0);
//         }
//         int count = 0;
//         for (int i = 2; i < num; i++) {
//             if (num % i == 0) {
//                 count++;
//                 break;
//             }
//         }
//         if(count==0){
//             System.out.println(num + " is a prime number");
//         }
//         else{
//             System.out.println(num + " is not a prime number");
//         }
//     }
// }
//
// 2) Implement a program to find the largest number among three given numbers
// using a conditional statement.
//
// import java.util.Scanner;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();
//         System.out.print("Enter third number: ");
//         int num3 = sc.nextInt();
//         if (num1 >= num2 && num1 >= num3) {
//             System.out.println("Largest number is: " + num1);
//         }
//         else if (num2 >= num1 && num2 >= num3) {
//             System.out.println("Largest number is: " + num2);
//         }
//         else {
//             System.out.println("Largest number is: " + num3);
//         }
//     }
// }
//
// 3) Use a for loop to print a multiplication table.
//
// import java.util.Scanner;
// public class Assignment{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(num + " * " + i + " = " + (num * i));
//         }
//     }
// }
//
// 4) Create a program to calculate the sum of even numbers from 1 to 10 using a
// while loop.
//
// public class Assignment {
//     public static void main(String[] args) {
//         int sum = 0;
//         int i = 1;
//         while (i <= 10) {
//             if (i % 2 == 0) {
//                 sum += i;
//             }
//             i++;
//         }
//         System.out.println("Sum of even numbers is: " + sum);
//     }
// }
//
// Arrays:
// 1) Write a program to find the average of elements in an array.
//
// import java.util.Scanner;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.print("Enter the elements of the array: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int sum = 0;
//         for (int i = 0; i < n; i++) {
//             sum += arr[i];
//         }
//         double avg = (double) sum / n;
//         System.out.println("Average of the array is: " + avg);
//     }
// }
//
// 2) Implement a function to sort an array in ascending order using bubble sort
// or selection sort.
// public class Assignment {
//     public static void main(String[] args) {
//         int[] arr = { 5, 2, 8, 1, 9, 0, -2, 15, 400, -399};
//         Sort s = new Sort();
//         s.selectionSort(arr);
//     }
// }
//
// class Sort {
//     public void selectionSort(int[] arr) {
//
//         for(int i = 0; i<arr.length-1; i++){
//             int minIndex = i;
//             for(int j=i+1; j<arr.length;j++){
//                 if(arr[j]<arr[minIndex]){
//                     minIndex = j;
//                 }
//             }
//             int temp = arr[i];
//             arr[i]=arr[minIndex];
//             arr[minIndex]=temp;
//         }
//         print(arr);
//     }
//     public void print(int[] arr){
//         for(int i =0 ;i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }
//
// 3) Create a program to search for a specific element within an array using
// linear search.
//
// import java.util.Scanner;
//
// public class Assignment{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of array");
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         System.out.println("Enter elements of array:");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Enter key to search:");
//         int key = sc.nextInt();
//
//         Search obj = new Search();
//         boolean result = obj.linear(arr, key);
//         if(result){
//             System.out.println("Element found");
//         }else{
//             System.out.println("Element not found");
//         }
//
//
//     }
// }
// class Search{
//     public boolean linear(int[] arr, int key){ 
//         for(int i=0; i<arr.length-1; i++){
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[j]==key){
//                     return true;
//                 }
//             }
//         }
//     return false;
//     }
// }
//
// Object Oriented Programming (OOP):
// Create a class to represent a student with attributes like name, roll number,
// and marks.
// public class Assignment{
//     public static void main(String[] args) {
//         Student obj = new Student("Abc", 1, 90);
//         System.out.println("Name: " + obj.getName());
//         System.out.println("Roll Number: " + obj.getRollNumber());
//         System.out.println("Marks: " + obj.getMarks());
//     }
// }
//
// class Student{
//     String name;
//     int rollNumber;
//     int marks;
//     public Student(String name, int rollNumber, int marks) {
//         this.name = name;
//         this.rollNumber = rollNumber;
//         this.marks = marks;
//     }
//     public String getName() {
//         return name;
//     }
//     public int getRollNumber(){
//         return rollNumber;
//     }
//     public int getMarks(){
//         return marks;
//     }
//
// }
//
// Implement inheritance to create a "GraduateStudent" class that extends the
// "Student" class with additional features.
// public class Assignment{
//     public static void main(String[] args) {
//         Student st = new Student("ABC", 20, 30);
//         GraduateStudent gs = new GraduateStudent("XYZ", 30, 40, "XYZ University", 2025);
//         System.out.println("Student Name: " + st.getName());
//         System.out.println("Student Roll Number: " + st.getRollNumber());
//         System.out.println("Student Marks: " + st.getMarks());
//         System.out.println("Graduate Student Name: " + gs.getName());
//         System.out.println("Graduate Student Roll Number: " + gs.getRollNumber());
//         System.out.println("Graduate Student Marks: " + gs.getMarks());
//         System.out.println("Graduate Student University: " + gs.getUniversity());
//         System.out.println("Graduate Student Year: " + gs.getYear());
//     }
// }
//
// class Student{
//     String name;
//     int rollNumber;
//     int marks;
//     public Student(String name, int rollNumber, int marks) {
//         this.name = name;
//         this.rollNumber = rollNumber;
//         this.marks = marks;
//     }
//     public String getName() {
//         return name;
//     }
//     public int getRollNumber(){
//         return rollNumber;
//     }
//     public int getMarks(){
//         return marks;
//     }
//
// }
//
// class GraduateStudent extends Student{
//     String universityName;
//     int graduationYear;
//     public GraduateStudent(String name, int rollNumber, int marks, String universityName, int graduationYear){
//         super(name, rollNumber, marks);
//         this.universityName = universityName;
//         this.graduationYear = graduationYear;
//     }
//    
//     public String getUniversity() {
//         return universityName;
//     }
//
//     public int getYear() {
//         return graduationYear;
//     }
//
// }
//
// Demonstrate polymorphism by creating methods with the same name but different
// parameters in a parent and child class.
//
// class Calculator {
//
//     public int add(int a, int b) {
//         return a + b;
//     }
//
//     public int add(int a, int b, int c) {
//         return a + b + c;
//     }
//
//     public void displayResult(int result) {
//         System.out.println("Result from Calculator class: " + result);
//     }
// }
//
// class AdvancedCalculator extends Calculator {
//
//     @Override
//     public void displayResult(int result) {
//         System.out.println("Result from AdvancedCalculator class: " + result);
//     }
//
//     public double add(double a, double b) {
//         return a + b;
//     }
// }
//
// public class Assignment {
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
//         int sum1 = calc.add(5, 10);
//         int sum2 = calc.add(3, 7, 2);
//         calc.displayResult(sum1);  
//         calc.displayResult(sum2);  
//
//         System.out.println();
//
//         AdvancedCalculator advCalc = new AdvancedCalculator();
//         int sum3 = advCalc.add(8, 12);
//         double sum4 = advCalc.add(5.5, 4.5);
//         advCalc.displayResult(sum3);
//         advCalc.displayResult((int) sum4);
//     }
// }
//
// Explain the concept of encapsulation with a suitable example.
//
/* Encapsulation is a fundamental concept in object-oriented programming (OOP) that binds together the data  and keeps both safe from outside interference and misuse. It is a mechanism of hiding the internal state of an object from the outside world and only exposing the necessary information through public methods. */
//
// class Person {
//     private String name;
//
//     public void setName(String name) {
//         this.name = name;
//     }
//
//     public String getName() {
//         return name;
//     }
// }
//
// public class Assignment {
//     public static void main(String[] args) {
//         Person person = new Person();
//
//         person.setName("XYZ");
//
//         System.out.println("Name: " + person.getName());
//     }
// }
//
// String Manipulation:
// Write a program to reverse a given string.
// public class Assignment {
//     public static void main(String[] args) {
//         String str = "Hello World";
//         String reverse = "";
//         int start = 0, end = str.length()-1;
//         for (int i = str.length()-1; i >= 0 ; i--) {
//             reverse += str.charAt(i);
//         }
//         System.out.println("Original String: " + str);
//         System.out.println("Reversed String: " + reverse);
//     }
// }
//
// Implement a function to count the number of vowels in a string.
// public class Assignment{
//     public static void main(String[] args) {
//         String str = "Hello World";
//         int count = 0;
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch ==   'U'){
//                 count++;
//             }
//         }
//         System.out.println("Number of Vowels: " + count);
//     }
// }
//
// Advanced Topics:
// Explain the concept of interfaces and abstract classes with examples.
//
//An interface defines a blueprint of methods that must be implemented by the classes that inherit it. Interfaces focus on what should be done rather than how.
//
// interface Animal {
//         void eat(); 
//
//         void sleep(); 
//     }
//
//     class Dog implements Animal {
//         @Override
//         public void eat() {
//             System.out.println("Dog eats bones.");
//         }
//
//         @Override
//         public void sleep() {
//             System.out.println("Dog sleeps in its kennel.");
//         }
//     }
//
//     public class Assignment {
//         public static void main(String[] args) {
//             Dog dog = new Dog();
//             dog.eat();
//             dog.sleep();
//         }
// }
//
//An abstract class is a class thatcannot be instantiated directly. It may contain both abstract methods (without body) and concrete methods (with body).
//
//Abstract methods must be implemented by the child class. Concrete methods provide default behavior. An abstract class is extended using the extends keyword. A class can extend only one abstract class (single inheritance).
//
// abstract class Vehicle {
//     abstract void start();
//
//     void stop() {
//         System.out.println("Vehicle stopped.");
//     }
// }
//
// class Car extends Vehicle {
//     @Override
//     void start() {
//         System.out.println("Car starts with a key.");
//     }
// }
//
// public class Assignment {
//     public static void main(String[] args) {
//         Car car = new Car();
//         car.start(); 
//         car.stop(); 
//     }
// }
//
// Create a program to handle exceptions using try-catch blocks.
// public class Assignment {
//     public static void main(String[] args) {
//         try {
//             int a = 10;
//             int b = 0;
//             int c = a / b;
//             System.out.println("Result: " + c);
//         }
//         catch (ArithmeticException e) {
//             System.out.println("Cannot divide by zero.");
//         }
//     }
// }
// Implement a simple file I/O operation to read data from a text file.
// import java.io.*; 
// import java.util.Scanner; 
//
// public class Assignment {
//     public static void main(String[] args) {
//         try {
//             File myObj = new File("file.txt");
//             Scanner myReader = new Scanner(myObj);
//             while (myReader.hasNextLine()) {
//                 String data = myReader.nextLine();
//                 System.out.println(data);
//             }
//             myReader.close();
//         } catch (FileNotFoundException e) {
//             System.out.println("An error occurred.");
//             e.printStackTrace();
//         }
//     }
// }
// Explore multithreading in Java to perform multiple tasks concurrently.
// class Task1 extends Thread {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Task 1 - Count: " + i);
//             try {
//                 Thread.sleep(500); 
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
//
// class Task2 extends Thread {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Task 2 - Count: " + i);
//             try {
//                 Thread.sleep(1000); 
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// public class Assignment {
//     public static void main(String[] args) {
//         Task1 t1 = new Task1();
//         Task2 t2 = new Task2();
//
//         t1.start(); 
//         t2.start(); 
//     }
// }