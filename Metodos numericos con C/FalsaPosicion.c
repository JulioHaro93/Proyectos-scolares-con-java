/*METODO DE LA FALSA POSICION



PROGRAMAR QUE CALCULA LA RAIZ DE UNA ECUACION MEDIANTE LE METODO DE LA POSICION

LA FUNCION DE TRABAJO ESTA DEFINIDA EN LA FUNCION F(x)

*/

#include<math.h>
#include<stdio.h>

//Prototipos de funciones
float f(float x); //Funcion de trabajo

//Funcion principal main
int main(void)
    {
     float a,b,m,e;

     printf("METODO DE LA FALSA POSICION\n\n");
     printf("Ingresa el rango (a,b):");
     scanf("%f,%f",&a,&b);
     printf("Ingresa el valor del error (e):");
     scanf("%f",&e);
     if (f(a)*f(b)<0)
        {
         printf("\n   a        b       c      f(a)    f(c)   f(a)*f(c)\n");
         printf("%1.5f %1.5f ",a,b);
         do
            {
             m=(a+b)/2;m=b-(f(b)*(b-a))/(f(b)-f(a));
             printf(" %1.5f %1.5f %1.5f %1.5f",m,f(a),f(m),f(m)*f(a));
             if (f(a)*f(m)<0)
                b=m;
             else
                a=m;
             printf ("\n%1.5f %1.5f ",a,b);
            }
         while (fabs(f(m))>e);
         printf(" %1.5f %1.5f %1.5f %1.5f",m,f(a),f(m),f(m)*f(a));
         printf ("\n\nLa raiz buscada es %f, donde f(c) es %f\n\n",m,f(m));
        }
     else
        printf ("\n\nEl rango no converge en la solucion...\n\n");
    }


//Declaracion de funciones
float f(float x)
    {
     return(pow(x,2)-2);
    }
