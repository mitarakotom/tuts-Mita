package edXStuff.Course2.Week1.Test;

import java.util.Scanner;

public class ScannerTest {public static void main (String arg[]){
    System.out.println("Enter your username: ");
    Scanner scanner = new Scanner(System.in);
    String username = scanner.nextLine();
    System.out.println("Your username is " + username);
}
}
