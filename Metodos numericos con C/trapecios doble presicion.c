#include<stdio.h>
#include<stdlib.h>
#include<math.h>

double f(double x){
      double f, pi;
      pi=3.1415926535897932;
      f=(2/sqrt(pi))*exp(-x*x);
      return f;
      }

       main()
       {
double a,b,h,s,area;
int i,n,j;
printf("\n valor de a: ");
scanf("%lf", &a);
printf("\n valor de : ");
scanf("%lf", &b);

printf("\n numero de franjas: ");
scanf("%d", &n);
h=(b-a)/n;
s=0;

for(i=1;i<=n-1;i++)
{

   s=s+2*f(a+i*h);

       }
       area=(h/2.)*(f(a)+s+f(b));
       printf("\n el resultado es: %.16lf\n\n", area);
       system("pause");
       }
