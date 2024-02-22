import java.util.Scanner;
public class Student
{
    String fullname;
    int rollNum;
    double semPerentage;
    String collegeName;
    int collegeCode;
    public Student()
    {
        System.out.println("I am a student!");
    }
    public Student(String name)
    {
        fullname=name;
    }
    public void display()
    {
        System.out.println("Name = "+fullname);
        System.out.println("roll number = "+rollNum);
        System.out.println("semPerentage = "+semPerentage);
        System.out.println("collegeName = "+collegeName);
        System.out.println("collegeCode = "+collegeCode);
    }
    public static void main(String[] args)
    {
        Student obj=new Student();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name : ");
        obj.fullname=input.nextLine();
        System.out.println("Enter your roll number : ");
        obj.rollNum=input.nextInt();
        System.out.println("Enter your percentage : ");
        obj.semPerentage=input.nextDouble();
        System.out.println("Enter your college name : ");
        obj.collegeName=input.next();
        System.out.println("Enter your college code : ");
        obj.collegeCode=input.nextInt();
        obj.display();
    }
}
