/*  Name    : Muhammad Setyadi Hartawan Widyantara
    NIM     : 2550081015
    Class   : A    
    Desc    : Array Test
*/

#include <stdio.h>

int main() {
    int n, i;
    char Jumlah[100][50]; // kapasitas array/mobilnya itu 100, sedangkan nama mobil max 50 karakter

    // Input jumlah mobil
    printf("Berapa Mobil yang Mau dibeli ? : ");
    scanf("%d", &n);

    // Input data mobil
    for (i = 0; i < n; i++) {
        printf("Mobil ke-%d: ", i + 1);
        scanf("%s", &Jumlah[i]);
    }

    // Output daftar mobil
    printf("\nDaftar Mobil Yang Dibeli:\n");
    for (i = 0; i < n; i++) {
        printf("Mobil ke-%d: %s\n", i + 1, Jumlah[i]);
    }

    return 0;
}
