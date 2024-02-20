#include<iostream>
using namespace std;
inline void displayWelcomeMessage()
{
    cout<<"Welcome"<<endl;
}
class Box
{
    public:
            float l,b,h;
            void areaofbox(float l,float b,float h)
            {
                float area=2*(l*b+b*h+h*l);
                cout<<"Area of box is : "<<area<<endl;
            }
            friend void displayBoxDimensions(Box);
            void volumeofbox(float l,float b,float h);
};
void Box :: volumeofbox(float l,float b,float h)
{
    float volume=l*b*h;
    cout<<"Volume of box is : "<<volume<<endl;
}
void displayBoxDimensions(Box obj)
{
    cout<<"length ="<<obj.l<<endl;
    cout<<"breadth ="<<obj.b<<endl;
    cout<<"Width="<<obj.h<<endl;
}
int main()
{
    Box cuboid;
    cout<<"enter length,breadth and width of the cuboid : "<<endl;
    cin>>cuboid.l>>cuboid.b>>cuboid.h;
    displayWelcomeMessage();
    displayBoxDimensions(cuboid);
    cuboid.volumeofbox(cuboid.l,cuboid.b,cuboid.h);
    cuboid.areaofbox(cuboid.l,cuboid.b,cuboid.h);
}
