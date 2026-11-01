/*
    Name    : Muhammad Setyadi Hartawan Widyantara
    Class   : A
    NIM     : 2550081015
*/

#include<stdio.h>
#include<math.h>

int main(){
    int Panjang, Lebar, Luas;

    //Memasukkan Nilai Panjang
    printf("Berapa Panjangnya :");
    scanf("%d", &Panjang);

    //Memasukkan Nilai Lebar
    printf("Berapa Lebarnya :");
    scanf("%d", &Lebar);

    //Isi dari si Luas
    Luas = Panjang * Lebar;
        printf("Jadi, Luasnya adalah : %.2d\n", Luas);

return 0;
    
}