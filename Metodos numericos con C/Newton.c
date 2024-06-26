#include <stdio.h>
#include <stdlib.h>
#include <math.h>

float f(float x);//Funcion de trabajo
float df(float x);//Derivada de la Funcion de trabajo

int main()
    {
     float X0,X,aux,e;
     int i;
     printf ("METODO DE NEWTON");
     printf("\n\nIngresa el valor de Xo:");
     scanf("%f",&X0);
     printf ("\nIngresa el valor del error:");
     scanf ("%f",&e);
     i=0;
     printf ("\nX[%d]=%.4f",i,X0);
     do
            {
             i++;
             X=X0-f(X0)/df(X0);
             printf ("\nX[%d]=%.4f      Error=%.4f",i,X,fabs(X-X0));
             aux=X0;
             X0=X;
             X=aux;
            }
     while(fabs(X0-X)>e);
     printf ("\n\nLa raiz de la ecuacion es: %f",X0);
    }

float f(float x)
    {
     return (x*x-2);
    }

float df(float x)
    {
     return (2*x);
    }
