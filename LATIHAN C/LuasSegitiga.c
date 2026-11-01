/* 
    Name    : Muhammad Setyadi Hartawan Widyantara
    Class   : A
    Date    : 07/08/2026
*/

#include <stdio.h>
#include <math.h>
#include <conio.h>

int main(){
    float alas, tinggi, luas;

    //Memasukkan Nilai alas
    printf("Berapa Alasnya: ");
    scanf("%f", &alas);

    //Memasukkan Nilai tinggi
    printf("Berapa Tinggi nya: ");
    scanf("%f", &tinggi);

    luas = alas * tinggi * 0.5 ;  //memakai rumus luas segitiga
        printf("Ini Luas Segitiganya: %.2f\n", luas);
        
    if (luas > 100){
        printf("Segitiga ini Sudah cukup Luas. \n", luas);
    } else {
        printf("Segitiga ini Kurang Luas. \n", luas);
    }

    return 0;

}