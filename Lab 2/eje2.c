#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <sys/time.h> 

int* GenerarArreglo(int tam);
int CalcMax(int *arr, int tam);
int CalcMin(int *arr, int tam);
int* SumArr(int *arr1, int *arr2, int tam);
void mostrar(int *x, int n);
int SumElem(int *arr, int tam);

int main()
{
    struct timeval t, t2;                                     //Variables para medir tiempo de ejecucion                    
    int tiempo;


    int *arr1,*arr2,*arrsum;
    int tam,Mayor,Menor;
    srand(time(NULL));
    printf("Ingrese el tamanio del arreglo: ");
    scanf(" %d",&tam);
    printf("\nLista 1:\n");
    arr1=GenerarArreglo(tam);
    mostrar(arr1,tam);
    printf("\n\nLista 2:\n");
    arr2=GenerarArreglo(tam);
    mostrar(arr2,tam);
    
    Mayor=CalcMax(arr1,tam);
    printf("\n\nEl numero maximo de Lista 1 es: %d",Mayor);
    Mayor=CalcMax(arr2,tam);
    printf("\nEl numero maximo de Lista 2 es: %d",Mayor);
    Menor=CalcMin(arr1,tam);
    printf("\n\nEl numero minimo de Lista 1 es: %d",Menor);
    Menor=CalcMin(arr2,tam);
    printf("\nEl numero minimo de Lista 2 es: %d",Menor);

    gettimeofday(&t, NULL);
    arrsum=SumArr(arr1,arr2,tam);
    gettimeofday(&t2, NULL);
    printf("\n\nListas sumadas: \n\n");
    mostrar(arrsum,tam);

    printf("\n\nElementos de listas sumadas: %d",SumElem(arrsum,tam));

    tiempo = ((t2.tv_usec - t.tv_usec)  + ((t2.tv_sec - t.tv_sec) * 1000000.0f));        //Cálculo del tiempo total del programa

    printf("\n\nTiempo que tarda en sumar las listas es de: %f segundos ",((float)tiempo)/1000000);

    free(arr1);
    free(arr2);
    free(arrsum);
    

    return 0;
}


int* GenerarArreglo(int tam)
{
    int i,entero,signo;
    int *arr;

    arr= (int*)malloc(tam*sizeof(int));
    arr[0]=rand()%101;
    //printf("[%d",arr[0]);
    for ( i = 1; i < tam; i++)
    {
        entero=rand()%101;
        signo=rand()%2;
        if (signo==1)
        {
            entero*=-1;
        }
        arr[i]=entero;
        //printf(", %d",arr[i]);
    }
    //printf("]");
    return arr;
}


int CalcMax(int *arr, int tam)
{
    int i, Max;
    Max=arr[0];
    for ( i = 1; i < tam; i++)
    {
        if (Max<arr[i])
        {
            Max=arr[i];
        }
        
    }
    return Max;
}

int CalcMin(int *arr, int tam)
{
    int i, Min;
    Min=arr[0];
    for ( i = 1; i < tam; i++)
    {
        if (Min>arr[i])
        {
            Min=arr[i];
        }
        
    }
    return Min;
}

int* SumArr(int *arr1, int *arr2, int tam)
{
    int i;
    int *Sumlist;
    Sumlist= (int*)malloc(tam*sizeof(int));

    for ( i = 0; i < tam; i++)
    {
        Sumlist[i]=arr1[i]+arr2[i];
    }
    return Sumlist;
}

void mostrar(int *x, int n)
{
    int i;

    printf("[%d",x[0]);
    for (i = 1; i < n ; i++)
    {
        printf(", %d",x[i]);
    }
    printf("]");
}

int SumElem(int *arr, int tam)
{
    int i,suma;
    suma=0;
    for (i = 0; i < tam; i++)
    {
        suma+=arr[i];
    }
    return suma;
}
