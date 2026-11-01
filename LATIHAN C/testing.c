/* 
    Name    : Muhammad Setyadi Hartawan Widyantara
    Class   : A
    Date    : 07/08/2026
*/

#include<stdio.h>

int main(){
    int x;
    int y;

    //untuk variabel x
    printf("Masukkan Jumlah X:");
    scanf("%d", &x);

    //untuk variabel y
    printf("Masukkan Jumlah y:");
    scanf("%d", &y);



    if (x > y){
        printf("Angka Variabel X Lebih Besar Daripada Y.\n", x);
    } else {
        printf("Angka Variabel Y Lebih Besar Daripada X.\n", x);
    }
    return 0;
}
