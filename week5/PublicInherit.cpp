#include <iostream>
using namespace std;
class SuperClass {
  private:
    int pvt = 1;

  protected:
    int prot = 2;

  public:
    int pub = 3;
    int getPVT() {
      return pvt;
    }
};

class DerivedClass : public SuperClass {
  public:
    int getProt() {
      return prot;
    }
};

int main() {
  DerivedClass object1;
  cout << "Private = " << object1.getPVT() << endl;
  cout << "Protected = " << object1.getProt() << endl;
  cout << "Public = " << object1.pub << endl;
  return 0;
}
