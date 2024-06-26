#include <stdlib.h>
#include <stdio.h>

int main(void)
    {
     float X[100],Y[100][100],x,y,aux;
     int n,i,j;
     printf("***INTERPOLACION DE NEWTON MEDIANTE DIFERENCIAS DIVIDIDAS.***");
     printf("\n\nIngresa el numero de puntos:");
     scanf ("%d",&n);
     printf("\nIngresa los puntos:\n");
     for (i=0;i<n;i++)
         {
          printf("X[%d],Y[%d]:",i,i);
          scanf ("%f %f",&X[i],&Y[i][0]);
         }
     printf("\n\nIngresa el valor de x a calcular:");
     scanf ("%f",&x);

     //Calculo de las diferencias divididas
     for (j=1;j<n;j++)
         for (i=0;i<(n-j);i++)
             Y[i][j]=(Y[i+1][j-1]-Y[i][j-1])/(X[i+j]-X[i]);

     //Impresion de la Matriz de diferencias
     printf ("\n\nValor de las diferencias divididas:\n");
     for (i=0;i<n;i++)
        {
         for (j=0;j<(n-i);j++)
                printf("%.4f  ",Y[i][j]);
         printf("\n");
        }
     //Calculo del resultado
     y=Y[0][0];
     for (i=1;i<(n-1);i++)
        {
            aux=1;
            for (j=0;j<i;j++)
                aux=aux*(x-X[j]);
            y=y+aux*Y[0][i];
        }
     //Impresion de resultados
     printf("\n\nEl resultado es (%.4f,%.4f).",x,y);
     fflush(stdin);
     printf("\nPresiona <ENTER> para terminar...");
     getchar();
    }


