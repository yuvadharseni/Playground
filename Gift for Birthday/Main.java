#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x;
  std::cin>>x;
  if (x%4==0 || x/100==0)
    std::cout<<x<<" is a leap year";
  else
    std::cout<<x<<" is not a leap year";
}