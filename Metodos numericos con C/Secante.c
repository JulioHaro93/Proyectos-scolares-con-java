/*METODO DE LA SECANTE



PROGRAMAR QUE CALCULA LA RAIZ DE UNA ECUACION MEDIANTE LE METODO DE LA SECANTE

LA FUNCION DE TRABAJO ESTA DEFINIDA EN LA FUNCION F(x)

*/


//Directivas del preprocesador
#include<stdio.h>
#include<math.h>

//Prototipos de funciones
float f(float x); //Funcion de trabajo


//Funcion principal main
int main(void)
    {
     float Xo,
           Xi,
           X,
           e;
     int i=0;

     printf("METODO DE LA SECANTE\n\n");
     printf("Ingresa el valor del intervalo(a,b):");
     scanf("%f,%f",&Xo,&Xi);
     printf("Ingresa el valor del error (e):");
     scanf("%f",&e);
     printf("\nX[%d]=%f",i,Xo);
     i++;
     printf("\nX[%d]=%f",i,Xi);
     do
        {
         X=Xi-((f(Xi)*(Xi-Xo))/(f(Xi)-f(Xo)));
         i++;
         printf("\nX[%d]=%f     Error=%.4f",i,X,fabs(Xi-X));
         Xo=Xi;
         Xi=X;
        }
     while(fabs(Xi-Xo)>e);
     printf ("\n\nLa raiz buscada es %f, donde f(c) es %f\n\n",X,f(X));
    }

//Declaracion de funciones
float f(float x)
    {
     return(pow(x,2)-2);
    }
