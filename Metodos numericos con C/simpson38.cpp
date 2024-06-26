#include<stdio.h>
#include<stdlib.h>
#include<math.h>

float f(float x){
      float f,pi;
      pi=3.14159265358979;
      f=(2./sqrt(pi))*exp(-x*x);
      return f;
      }
     
       main(){
float a,b,h,s,s1,area;
int i,n,j;
printf("\n valor de a: ");
scanf("%f", &a);
printf("\n valor de : ");
scanf("%f", &b);

printf("\n numero de franjas multiplo de tres: ");
scanf("%d", &n);
h=(b-a)/n;
s=0;
s1=0;
for(i=1;i<=n-1;i++)
{
   j=3*(i/3);
   if(i==j)
   s=s+2*f(a+i*h);
   else
      s1=s1+3*f(a+i*h); 
       }
       area=(3*h/8.)*(f(a)+s1+s+f(b));
       printf("\n el resultado es: %f\n\n", area);
       system("pause");
       }
