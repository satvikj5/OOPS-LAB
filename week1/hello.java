import java.lang.*;
import java.util.Scanner;
public class Hello {
    public static void main(String[] args){
        Scanner input = newScanner(System.in);
        System.out.println("Enter your name : ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
