
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <unistd.h>
#include <windows.h>
#include <sys/time.h>

void insertionSort(int *x, int n);
void aleatorio(int *x, int n);
void mostrar(int *x,int n);
int Search(int *arr,int Entero, int n);



int main()
{
    
    int n, i, Entero,posicion1,posicion2;
    int *x;

    struct timeval t, t2, tiempoale1, tiempoale2, tiempobusca1, tiempobusca2, tiempobusca3, tiempobusca4;
    struct timeval tiempoord1, tiempoord2;                                          //Variables para medir tiempo de ejecucion                    
    int microsegundos,tiempoaleatorio,tiempobusqueda,tiempobusqueda2, tiempoorden;  //Tiempos obtenidos
    
    gettimeofday(&t, NULL);                         //Inicio de cronómetro del total del programa

    printf("Introduce el tamanio del arreglo: ");           
    scanf(" %d", &n);
    srand(time(NULL));
    x= (int*)malloc(n*sizeof(int));                 //Generacion del arreglo dinámico

    gettimeofday(&tiempoale1, NULL);                //Inicio de cronómetro de la generacion del arreglo
    aleatorio(x,n);
    gettimeofday(&tiempoale2,NULL);                 //Final de cronómetro de la generacion del arreglo



    printf("Desarreglo\n");
    Sleep(3000);            //sleep(3) en linux
    mostrar(x,n);                                   //Funcion para mostrar el arreglo generado
    
    do{    
    printf("\n\nIntroduzca el numero que desee buscar: ");          //Se introduce el número a buscar
    scanf(" %d",&Entero);
    
    gettimeofday(&tiempobusca1, NULL);              //Inicio de cronómetro de la busqueda del arreglo desordenado
    posicion1=Search(x,Entero,n);
    gettimeofday(&tiempobusca2,NULL);               //Final de cronómetro de la busqueda del arreglo desordenado
    }while(posicion1==-1);                      //En caso de que el número no exista, pregunta por un nuevo numero a buscar

    gettimeofday(&tiempoord1, NULL);                //inicio de cronómetro de ordenación del arreglo
    insertionSort(x, n);
    gettimeofday(&tiempoord2,NULL);                 //Fin de cronómetro de ordenación

    
    printf("\nOrdenado\n");
    Sleep(3000);    //sleep(3) en linux
    mostrar(x,n);                               //Se muestra el arreglo ya ordenado
    
    do{
    printf("\n\nIntroduzca el numero que desee buscar: ");              //Nueva busqueda de número
    scanf(" %d",&Entero);

    gettimeofday(&tiempobusca3, NULL);              //Inicio de cronómetro de la busqueda del arreglo ordenado
    posicion2=Search(x,Entero,n);
    gettimeofday(&tiempobusca4,NULL);               //Final de cronómetro de la busqueda del arreglo ordenado
    }while(posicion2==-1);

    free(x);                    //Liberar memoria usada

    gettimeofday(&t2, NULL);
    microsegundos = ((t2.tv_usec - t.tv_usec)  + ((t2.tv_sec - t.tv_sec) * 1000000.0f));        //Cálculo del tiempo total del programa
    printf("\n\nTiempo total del programa en: %d Microsegundos\n",microsegundos); //Incluidos 12 segundos de pausa (6 en el main y 6 de busqueda(3 y 3))
    tiempoaleatorio=((tiempoale2.tv_usec - tiempoale1.tv_usec)  + ((tiempoale2.tv_sec - tiempoale1.tv_sec) * 1000000.0f));
    printf("\nTiempo total en generar y guardar los numeros aleatorios en: %d Microsegundos\n",tiempoaleatorio);
    
    tiempobusqueda=((tiempobusca2.tv_usec - tiempobusca1.tv_usec)  + ((tiempobusca2.tv_sec - tiempobusca1.tv_sec) * 1000000.0f) - 3000000); //Cálculo tel tiempo en busqueda
    printf("\nTiempo total en relizar la primera busqueda en: %d Microsegundos\n",tiempobusqueda);      //Se restan los 3 segundos de sleep
    printf("El numero %d se encuentra en la posicion %d \n.",Entero,posicion1);
    
    tiempoorden=((tiempoord2.tv_usec - tiempoord1.tv_usec)  + ((tiempoord2.tv_sec - tiempoord1.tv_sec) * 1000000.0f));
    printf("\nTiempo total en ordenar los numeros en: %d Microsegundos\n",tiempoorden);
    
    tiempobusqueda2=((tiempobusca4.tv_usec - tiempobusca3.tv_usec)  + ((tiempobusca4.tv_sec - tiempobusca3.tv_sec) * 1000000.0f) - 3000000); //Cálculo tel tiempo en busqueda
    printf("\nTiempo total en relizar la segunda busqueda en: %d Microsegundos\n",tiempobusqueda2);     //Se restan los 3 segundos de sleep
    printf("El numero %d se encuentra en la posicion %d \n.",Entero,posicion2);


    return 0;
}

void aleatorio(int *x, int n)
{
    int i;
    for (i = 0; i < n ; i++)
    {
        x[i]=rand()%100000;
    }
       
}

void mostrar(int *x, int n)
{
    int i;

    for (i = 0; i < n ; i++)
    {
        printf("%d\t",x[i]);
    }
    
}


int Search(int *arr,int Entero, int n)
{
    int j;
    
    
    printf("Posicion   Numero\n");
    Sleep(3000);                    //sleep(3) en linux
    for (j = 0; j<n; j++)
    {
        printf("%d.  %d\n",j+1,arr[j]);
        if (arr[j] == Entero)
        {
            printf("El numero %d se encuentra en la posicion %d \n.",Entero,j+1);
           
            return j+1;     
        }
    }   
    printf("\n\nNo se encuentra el numero solicitado.\n");
    return -1;
    
}

void insertionSort(int *x, int n)
{
    int key, j, i;
    
    for ( j = 1; j <= n-1; j++)
    {
        key=x[j];
        i=j-1;
        while (i>=0 && x[i]>key)
        {
            x[i+1]=x[i];
            i=i-1;
        }
        x[i+1]=key;
    }
       
}
