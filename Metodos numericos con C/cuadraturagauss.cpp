#include<stdio.h>
#include<stdlib.h>
#include<math.h>

float f(float x){
      float f,pi;
      pi=3.14159265358979;
      f=(2./sqrt(pi))*exp(-x*x);
      return f;
      }
     
main()

{
//Declaracion de variables necesarias
float x0,x1,x2,x3,x4,w0,w1,w2,w3,w4;
float a,b,h,t0,t1,t2,t3,t4,area;
int n;

printf("\n\n Ingresa el valor de a: ");
scanf("%f", &a);
printf("\n\n Ingresa el valor de b: ");
scanf("%f", &b);

printf("\n\n Ingresa el numero de puntos (1 - 4)la cuadratura es de 2 a 5 puntos: ");
scanf("%d", &n);

//evaluacion de el numero de puntos
switch(n)
{
	case 1:
		x0= 0.5773502;
		x1 = -0.5773502;
		w0 = 1;
		w1 = 1;
		h= (b-a)/2.;
		t0=((b-a)/2.)*x0+(b+a)/2.;
		t1=((b-a)/2.)*x1+(b+a)/2.;
		area = h*(w0*f(t0)+w1*f(t1));
		printf("\n El area es: %f \n", area);
		break;
	case 2:
		x0= 0;
		x1 = 0.77459666;
		x2 = -0.77459666;
		w0 = 0.8888888;
		w1 = 0.8888888;
		w2 = 0.8888888;
		h= (b-a)/2.;
		t0=((b-a)*x0+(b+a))/2.;
		t1=((b-a)*x1+(b+a))/2.;
		t2=((b-a)*x2+(b+a))/2.;
		area = h*(w0*f(t0)+w1*f(t1)+w2*f(t2));
		printf("\n El area es: %f \n", area);
		break;
	case 3:
	    x0= 0.33998104;
		x1 = -0.33998104;
		x2 = 0.86113631;
		x3 = -0.86113631;
		w0 = 0.65214515;
		w1 = 0.65214515;
		w2 = 0.34785484;
		w3 = 0.34785484;
		h= (b-a)/2.;
		t0=((b-a)*x0+(b+a))/2.;
		t1=((b-a)*x1+(b+a))/2.;
		t2=((b-a)*x2+(b+a))/2.;
		t3=((b-a)*x3+(b+a))/2.;
		area = h*(w0*f(t0)+w1*f(t1)+w2*f(t2)+w3*f(t3));
		printf("\n El area es: %f \n", area);
		break;
	case 4:
	    x0= 0;
		x1 = 0.53846931;
		x2 = -0.53846931;
		x3 = 0.90617984;
		x4 = -0.90617984;
		w0 = 0.5688888;
		w1 = 0.4786286;
		w2 = 0.4786286;
		w3 = 0.2369268;
		w4 = 0.23692688;
		h= (b-a)/2.;
		t0=((b-a)*x0+(b+a))/2.;
		t1=((b-a)*x1+(b+a))/2.;
		t2=((b-a)*x2+(b+a))/2.;
		t3=((b-a)*x3+(b+a))/2.;
		t4=((b-a)*x4+(b+a))/2.;
		area = h*(w0*f(t0)+w1*f(t1)+w2*f(t2)+w3*f(t3)+w4*f(t4));
		printf("\n El area es: %f \n", area);
		break;	
	defalut:
		printf("\n Opcion no valida \n");
		break;
}

system("pause");
}
