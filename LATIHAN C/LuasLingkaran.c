/*
    Name    : Muhammad Setyadi Hartawan Widyantara
    Class   : A
    NIM     : 2550081015
*/

#include<stdio.h>
#include<math.h>
#define PI 3.14159

int main(){
    float JariJari, Luas;

        //Memasukkan Jari Jari
        printf("Berapa Jari-Jarinya ? :");
        scanf("%f", &JariJari);

        //Isi dari si Luas
        Luas =  PI * pow(JariJari, 2);

            printf("Luasnya adalah : %.2f\n", Luas);

return 0;
}