import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        float p,q;
        System.out.print("Enter number 1: ");
        p=a.nextFloat();
        System.out.print("Enter number 2: ");
        q=a.nextFloat();
        int choice;
        System.out.println("1.Addition,2.Substraction,3.Multiplication,4.Divisi     
                                                                         on.");
        System.out.println("Enter any choice: ");
        choice=a.nextInt();
        if(choice==1){
            System.out.println(p+"+"+q+"="+(p+q));
        }
        else if(choice==2)
        {
            System.out.println(p+"-"+q+"="+(p-q));
            
        }
        else if(choice==3){
            System.out.println(p+"*"+q+"="+(p*q));
                    }
        else if(choice==4){
            System.out.println(p+"/"+q+"="+(p/q));
        }
        else{
            System.out.println("Error ! ");
        }
        
    }
}


