/*
    Name    : Muhammad Setyadi Hartawan Widyantara
    NIM     : 2550081015
    Class   : A
    Desc    : Bubble Sort Test
    Date    : 10/08/2026
*/

#include<stdio.h>
#include<conio.h>

int main() {
    int n, i, j, temp;
    int nilai[100];

    printf("Masukkan Jumlah Mahasiswa : ");
    scanf("%d", &n);

    for ( i = 0; i < n; i++){
        printf("Nilai Mahasiswa ke %d: ", i + 1);
        scanf("%d", &nilai[i]);
    }

    for ( i = 0; i < n - 1; i++){
        for ( j = 0; j < n - 1; j++){
            if ( nilai[j] > nilai[j + 1]){
                //Menukar nilai
                temp = nilai[j];
                nilai[j] = nilai[j + 1];
                nilai[j + 1] = temp;
            }
        }
    }

    printf("Nilai yang sudah Terurut(Ascending) : \n");
        for ( i = 0; i < n; i++){
            printf("Mahasiswa yang ke%d : %d\n", i + 1, nilai[i]);
        }
    return 0;
}