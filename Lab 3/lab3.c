#include<stdio.h>
#include<stdlib.h>
#include<math.h>

/*
typedef struct ecuaciones
{
    float x;
    float y;        //idea descartada por el momento.
}soluciones;
*/

//Prototipo de funciones:

float suma(int n1, int n2);
float distancia(float x1, float x2, float y1, float y2);
float multiplicacion(float n1, float n2);
float division(float n1, float n2);
float potencia(int n1, int n2);
float porcentaje(float n1, float n2);
float factorial(int a);
float area_triangulo(float base, float altura);
float sist_ecuacion_x(float a, float b, float c, float d, float e, float f);
float sist_ecuacion_y(float a, float b, float c, float d, float e, float f);
float hipotensa(int CO, int CA);



int main()
{
    int menu;
    menu=0;
    int n1,n2,entero;
    float x1, y1, x2, y2, n3;
    float a,b,c,d,e,f;
//  soluciones resul;

    do
    {
        printf("\nMenu\n");
        printf("\n1. Suma de enteros\n2. Distancia entre dos puntos\n3. Multiplicacion\n4. Division\n5. Potencia de un numero\n6. Porcentaje\n7. Factorial\n8. Calcular area de un triangulo\n9. Calcular sistema de ecuaciones 2x2\n10. Calcular hipotenusa\n11. Salir");
        printf("\n\nSeleccione la opcion deseada: ");
        scanf(" %d",&menu);

        switch (menu)
        {
        case 1:
            printf("\nSumas de enteros de la forma a+b\n\n");
            printf("Ingrese el valor de a: ");
            scanf(" %d",&n1);
            printf("Ingrese el valor de b: ");
            scanf(" %d",&n2);
            entero=suma(n1,n2);
            printf("La suma de %d + %d es: %d\n\n",n1,n2,entero);
            break;
        case 2:
            printf("\n Distancia entre dos puntos\n\n");
            printf("Ingrese los valores de x,y para el primer punto en el plano, ejemplo: 2,4\n");
            scanf(" %f,%f",&x1,&y1);
            printf("Ingrese los valores de x,y para el segundo punto en el plano, ejemplo: 7,4\n");
            scanf(" %f,%f",&x2,&y2);
            n3=distancia(x1,x2,y1,y2);
            printf("La distancia entre (%.2f,%.2f) y (%.2f,%.2f) es: %.2f\n\n",x1,y1,x2,y2,n3);

            break;
        case 3:
            printf("\n Multiplicaciones de la forma a*b\n\n");
            printf("Ingrese el valor de a: ");
            scanf(" %f",&x1);
            printf("Ingrese el valor de b: ");
            scanf(" %f",&x2);
            n3=multiplicacion(x1,x2);
            printf("La multiplicacion de %.2f * %.2f es: %.3f\n\n",x1,x2,n3);
            break;
        case 4:
            printf("\n Divisiones de la forma a/b\n\n");
            printf("Ingrese el valor de a: ");
            scanf(" %f",&x1);
            printf("Ingrese el valor de b: ");
            scanf(" %f",&x2);
            n3=division(x1,x2);
            printf("La division de %.2f / %.2f es: %.3f\n\n",x1,x2,n3);

            break;
        case 5:
            printf("\n Potencia de la forma a^b (enteros)\n\n");
            printf("Ingrese el coeficiente a elevar: ");
            scanf(" %d",&n1);
            printf("Ingrese la potencia a la que se va a elevar el coeficiente: ");
            scanf(" %d",&n2);
            n3=potencia(n1,n2);
            printf("El numero %d elevado a la potencia %d es: %.0f\n\n",n1,n2,n3);
            break;
        case 6:
            printf("\n Porcentaje de un numero (dos decimales maximo). \n\n");
            printf("Ingrese el numero a sacar porcentaje: ");
            scanf(" %f",&x1);
            printf("Ingrese que porcentaje se desea obtener: ");
            scanf(" %f",&x2);
            n3=porcentaje(x1,x2);
            printf("\nEl %.2f %% de %.2f es: %.2f\n\n",x2,x1,n3);
            break;
        case 7:
            printf("\n Factorial! de un numero.\n\n");
            printf("Ingrese el numero el cual quiere saber su factorial! (debe ser mayor o igual a 0): ");
            scanf(" %d",&n1);
            entero=factorial(n1);
            printf("El factorial de %d es: %d\n\n",n1,entero);
            break;
        case 8:
            printf("\n Area de un triangulo.\n\n");
            printf("Ingrese la base del triangulo: ");
            scanf(" %f",&x1);
            printf("Ingrese la altura del triangulo: ");
            scanf(" %f",&x2);
            n3=area_triangulo(x1,x2);
            printf("\nEl area del triangulo es: %.2f\n\n",n3);
            break;
        case 9:
            printf("\n Sistema de ecuaciones 2x2 de la forma\n a x + b y = c\n d x + e y = f");
            printf("\nIngresa el valor para a: ");
            scanf(" %f",&a);
            printf("Ingresa el valor para b: ");
            scanf(" %f",&b);
            printf("Ingresa el valor para c: ");
            scanf(" %f",&c);
            printf("Ingresa el valor para d: ");
            scanf(" %f",&d);
            printf("Ingresa el valor para e: ");
            scanf(" %f",&e);
            printf("Ingresa el valor para f: ");
            scanf(" %f",&f);
            x1=sist_ecuacion_x(a,b,c,d,e,f);
            y1=sist_ecuacion_y(a,b,c,d,e,f);
            printf("\nPara el sistema de ecuaciones: \n %.2f x + %.2f y = %.2f \n %.2f x + %.2f y = %.2f",a,b,c,d,e,f);
            printf("\n\nEl valor de x es: %.3f\nEl valor de y es: %.3f\n\n",x1,y1);
            break;
        case 10:
            printf("\n Calculo de la hipotenusa de un triangulo rectangulo.\n\n");
            printf("Ingrese la longitud del cateto opuesto (mayor a 0): ");
            scanf(" %f",&x1);
            printf("Ingrese la longitud del cateto adyacente (mayor a 0): ");
            scanf(" %f",&x2);
            n3=hipotensa(x1,x2);
            printf("\n\nEl valor de la hipotenusa del triangulo es: %.3f\n",n3);
            break;
        case 11:
            printf("\n\nGracias por usar la calculadora.\n\n");
            menu=-1;
            break;
        default:
            system("cls");
            printf("\n\nError, ingrese una opcion valida.\n");
            break;
        }
    } while (menu!=-1);
    


    return 0;
}


float suma(int n1, int n2)
{
    return n1+n2;
}

float distancia(float x1, float x2, float y1, float y2)
{
    return sqrt(pow(x2-x1,2)+pow(y2-y1,2));
}

float multiplicacion(float n1, float n2)
{
    return n1*n2;
}

float division(float n1, float n2)
{
    return n1/n2;
}

float potencia(int n1, int n2)
{
    return (pow(n1,n2));
}

float porcentaje(float n1, float n2)
{
    return (((n1*n2)/100));
}

float sist_ecuacion_x(float a, float b, float c, float d, float e, float f)
{
    return(((c*e-b*f)/(a*e-b*d)));
}

float sist_ecuacion_y(float a, float b, float c, float d, float e, float f)
{
    return(((a*f-c*d)/(a*e-b*d)));
}

float factorial(int a)
{
    int i,n;
    n=1;
    if(a==0)
    {
        return n;
    }

    for ( i = 1; i < a; i++)
    {
        n*=i+1;
    }
    
    return n;
}

float area_triangulo(float base, float altura)
{
    return(((base*altura)/2));
}

float hipotensa(int CO, int CA)
{
    return(sqrt(pow(CO,2)+pow(CA,2)));
}