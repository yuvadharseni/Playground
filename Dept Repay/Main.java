#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p, r, n;
  float i,a,d,fs;
  std::cin>>p>>r>>n;
  a=p+((p*n*r)/100);
  i=(p*n*r)/100;
  d=i*0.02;
  fs=(a-d);
  std::cout<<""<<i<<"\n"<<a<<"\n"<<d<<"\n"<<fs;
}