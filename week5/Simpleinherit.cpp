#include <iostream>
using namespace std;
class Simpleinherit  {
    public:
    void Real() {
        cout << "I am a Real number" << endl;
    }

    void integer() {
        cout << "I am an integer" << endl;
    }
};
class Number : public Simpleinherit {
 
   public:
    void natural() {
        cout << "I am a Natural Number." << endl;
    }
};

int main()
{
    
    Number num1;
    num1.Real();
    num1.integer();
    num1.natural();
    return 0;
}
/* Here the class Number is inheriting the properties of the super class Simpleinherit*/
