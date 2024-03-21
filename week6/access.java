import java.util.Scanner;
public class Access{
    private
        int privar;
    protected
        int provar;
    public  
        int pubvar;
        void setVar(int priValue,int proValue, int pubValue)
        {
            privar = priValue;
            provar = proValue;
            pubvar = pubValue; 
            System.out.println("values are seted successfully");
        }
        void getVar()
        {
            System.out.println("private var:"+privar);
            System.out.println("protected var:"+provar);
            System.out.println("public var:"+pubvar);    
        }
        public static void main(String args[])
        {
            Scanner s=new Scanner(System.in);
            System.out.print("Enter private variable:");
            int a=s.nextInt();
            System.out.print("Enter protected variable:");
            int b=s.nextInt();
            System.out.print("Enter public variable:");
            int c=s.nextInt();
            Access obj = new Access();
            obj.setVar(a,b,c);
            obj.getVar();
        }

}

