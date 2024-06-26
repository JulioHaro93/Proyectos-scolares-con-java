#include <stdlib.h>
#include <stdio.h>

int main(void)
    {
     float X[10],Y[10],x,N,D,y;
     int n,i,j;
     printf("***INTERPOLACION DE LAGRANGE.***");
     printf("\n\nIngresa el numero de puntos:");
     scanf ("%d",&n);
     printf("\nIngresa los puntos:\n");
     for (i=0;i<n;i++)
         {
          printf("X[%d],Y[%d]:",i,i);
          scanf ("%f %f",&X[i],&Y[i]);
         }
     printf("\n\nIngresa el valor de x a calcular:");
     scanf ("%f",&x);
     y=0;
     for(j=0;j<n;j++)
         {
          D=1;
          N=1;
          for(i=0;i<n;i++)
               if (i!=j)
                  {
                   N=N*(x-X[i]);
                   D=D*(X[j]-X[i]);
                  }
          printf ("\nEl valor de L[%d] es %.7f",j,N/D);
          y=y+Y[j]*(N/D);
         }
     printf("\n\nEl resultado es (%.7f,%.7f).",x,y);
     fflush(stdin);
     printf("\nPresiona <ENTER> para terminar...");
     getchar( );
    }

