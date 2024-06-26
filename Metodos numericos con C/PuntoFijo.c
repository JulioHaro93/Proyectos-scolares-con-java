/*METODO DEL PUNTO FIJO


PROGRAMAR QUE CALCULA LA RAIZ DE UNA ECUACION MEDIANTE LE METODO DEL PUNTO FIJO

LA FUNCION DE TRABAJO ESTA DEFINIDA EN LA FUNCION F(x)

*/


//Directivas del preprocesador
#include<stdio.h>
#include<math.h>


//Prototipos de funciones
float g(float x); //Funcion de trabajo

int main()
    {
     float Xo,X,e,delta;
     int i;
     printf ("METODO DEL PUNTO FIJO");
     printf("\n\nIngresa el valor de Xo:");
     scanf("%f",&Xo);
     printf ("\nIngresa el valor del error:");
     scanf ("%f",&e);
     i=0;
     printf("\n\nX[%d]=%.4f",i,Xo);
     do
            {
             X=g(Xo);
             i++;
             printf("\nX[%d]=%.4f   Error=%.4f",i,X,fabs(X-Xo));
             delta=fabs(Xo-X);
             Xo=X;
            }
     while(delta>e && i<=10000);
     if (i<=10000)
        printf ("\n\nLa raiz de la ecuacion es: %f",Xo);
     else
        printf("\n\nEl metodo no converge.");
    }


//Declaracion de funciones
float g(float x)
    {
     return(tan(x)-0.5+x);
    }
