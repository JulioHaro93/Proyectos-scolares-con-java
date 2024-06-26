#include <stdio.h>
#include <stdlib.h>

int main()
    {
     float A[100][100],//Matriz de coeficientes
           InvA[100][100],//Matriz Inversa
           b[100],//Vector de resultados
           x[100];

     float pivote,aux,detA;
     int n,f,c,d;

     printf("SOLUCION DE SISTEMAS DE ECUACIONES CON n INCOGNITAS EN n ECUACIONES\n");
     printf("METODO DE LA MATRIZ INVERSA\n\n");
     printf("Ax=b      x=Inv(A)b\n\n");
     printf("Ingresa el valor de n:");
     scanf("%d",&n);

     printf("\nIngresa los valores de la matriz de coeficientes:\n");
     for(f=0;f<n;f++)
         for(c=0;c<n;c++)
             {
              printf("A[%d][%d]=",f+1,c+1);
              scanf("%f",&A[f][c]);
             }

     printf("\nIngresa los valores de la matriz de resultados:\n");
         for(c=0;c<n;c++)
             {
              printf("b[%d]=",c+1);
              scanf("%f",&b[c]);
             }
     //Inicializacion de la matriz inversa como matriz identidad
     for(f=0;f<n;f++)
         for(c=0;c<n;c++)
             if(c==f)
                InvA[f][c]=1;
             else
                 InvA[f][c]=0;
     //Calculo de la matriz inversa
     for(d=0;d<n;d++)
         {
          pivote=A[d][d];
          for(c=0;c<n;c++)
             {
              A[d][c]=A[d][c]/pivote;
              InvA[d][c]=InvA[d][c]/pivote;
             }
          for(f=0;f<n;f++)
             {
              if (f==d)
                    f++;
              aux=A[f][d];
              for(c=0;c<n;c++)
               {
                A[f][c]=A[f][c]-(aux*A[d][c]);
                InvA[f][c]=InvA[f][c]-(aux*InvA[d][c]);
               }
             }
         }
      //multiplicacion de la Matriz inversa por el vector de resultados
      for (f=0;f<n;f++)
          for (c=0;c<n;c++)
              {
               x[f]=0;
               for (d=0;d<n;d++)
               {

                   x[f]=x[f]+InvA[f][d]*b[d];
               }
              }
      //Impresion de resultados
      printf("\nLos valores de la matriz inversa son:\n");
      for(f=0;f<n;f++)
        {
         for(c=0;c<n;c++)
              printf("%.4f  ",InvA[f][c]);
         printf("\n");
        }

      printf("\nLos resultados del sistema son:\n");

         for(f=0;f<n;f++)
              printf("%.4f   ",x[f]);
         printf("\n");
    }

