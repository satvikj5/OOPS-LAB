import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value : ");
        int b;
        b = input.nextInt();
        if(b%2==0)
        {
            System.out.println("the number "+b+" is an even number");
        }
        else{
            System.out.println("the number "+b+" is an odd number");
        }
        
    }
}

