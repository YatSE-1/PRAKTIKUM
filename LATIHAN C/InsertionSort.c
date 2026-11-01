/*
    Name    : Muhammad Setyadi Hartawan Widyantara
    NIM     : 2550081015
    Class   : A
    Date    : 12/08/2026
*/

#include <stdio.h>

int main() {
    int n, i, j, key;
    int arr[100];

    printf("Jumlah Array:");
    scanf("%d", &n);

    // Input elemen
    for (i = 0; i < n; i++) {
        printf("Elemen ke-%d: ", i + 1);
        scanf("%d", &arr[i]);
    }

    // Insertion Sort
    for (i = 1; i < n; i++) {
        key = arr[i];
        j = i - 1;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }

    // Output 
    printf("Hasil Array yang Terurut:\n");
    for (i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}
