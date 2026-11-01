/*
    Name    : Muhammad Setyadi Hartawan Widyantara
    Nim     : 2550081015
    Class   : A
    Date    : 13/08/2026
    Desc    : Project Pengmas
*/

#include<stdio.h>


int main(){
    int SodaKue, Cuka, SabunCair, Air;
    char PewarnaMakanan, BotolPlastik, TanahLiat;

    printf("Berapa Gram Soda Kue : ");
    scanf("%d", &SodaKue);

    printf("Berapa Mili Cuka : ");
    scanf("%d", &Cuka);

    printf("Berapa Mili Sabun Cair : ");
    scanf("%d", &SabunCair);

    printf("Berapa mili Air : ");
    scanf("%d", &Air);

    if ( SodaKue > 30 && SodaKue < 40){
        printf("Bisa Dibuat !");
    } else {
        printf("Tidak Ideal");
    }
    
return 0;
}