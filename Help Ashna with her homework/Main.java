#include<iostream>
using namespace std;
int main()
{
 int a,b,sum,difference,product,quotient,remainder;
  cin>>a>>b;
  sum=a+b;
  difference=a-b;
  product=a*b;
  quotient=a/b;
  remainder=a%b;
  cout<<"a+b="<<sum<<endl;
  cout<<"a-b="<<difference<<endl;
  cout<<"a*b="<<product<<endl;
  cout<<"a/b="<<quotient<<endl;
  cout<<"a%b="<<remainder;
}