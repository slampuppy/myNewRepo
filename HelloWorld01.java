// Name of programmer:Derrick Petty
// Name of program:Hello World
// Date started:28Jan23
//
// Description of program: Ask user for her first name and echo back in a greeting.
// Input/Processing/Output: user input in console, output is System.out in console
// Purpose of program: CIT-63 assignment Spring 2023
//
// References:
// https://www.w3schools.com/java/java_user_input.asp
import java.util.Scanner;
public class HelloWorld01 {
    public static void main(String[] args) {
        // Variable declaration section.
        String userName = "";
        String greeting = "";
        Scanner userInput = new Scanner(System.in);
        System.out.println("");
        // Input: get user name
        System.out.println("Hello user, What is your name?: ");
        userName = userInput.nextLine();
        // Processing: Create a greeting
        greeting = "Hello " + userName + " Nice to meet you!";
        // Output:
        System.out.println("" + greeting + "");
    }
}