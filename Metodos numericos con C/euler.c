#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<ctype.h>
float f(float x, float y)
{
       float f;
      
f=2*x*y;

return f;
}

main()    
 {
      int i,j,n;
      float x0,y0,y1,x1,a,b,h;
      printf("\n Dame el numero puntos n: ");
      scanf("%d",&n);
      printf("\n Dame el valor de a y b : ");
      scanf("%f%f",&a,&b);
      printf("\n Dame el valor de x0 y y0 : ");
      scanf("%f%f",&x0,&y0);
    printf("\n  resultado es: %f %f \n\n ",x0,y0); 
h=(b-a)/n;
i=1;   
do
{
    y1=y0+h*f(x0,y0);
    x1=a+i*h;
    printf("\n  resultado es: %f %f \n\n ",x1,y1); 
y0=y1;
x0=x1;   
     i=i+1;
}while(i<=n);


  
      system("pause");
      fflush(stdin);
 }

