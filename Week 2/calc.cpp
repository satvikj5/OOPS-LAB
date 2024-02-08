#include<iostream>
using namespace std;
int main()
{
    int a,b,choice;
    cout<<"enter any two numbers :"<<endl;
    cin>>a>>b;
    cout<<"Choose any one choice from the given"<<endl;
    cout<<" 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n"<<endl;
    cout<<"enter your choice"<<endl;
    cin>>choice;
    switch(choice)
    {
    case 1: 
      {
        cout<<a<<"+"<<b<<"="<<a+b;
        break;
      }
    case 2:
      {
        cout<<a<<"-"<<b<<"="<<a-b;
        break;
      }
    case 3:
      {
        cout<<a<<"*"<<b<<"="<<a*b;
        break;
      }
    case 4:
      {
        cout<<a<<"/"<<b<<"="<<a-b;
        break;
      }    
    default:
      {
        cout<<"Invalid operator"<<endl;
        break;
      }
    }


}
