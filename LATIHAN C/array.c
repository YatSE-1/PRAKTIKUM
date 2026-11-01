#include <stdio.h>

int main() {
    int n, i;
    int nilai[100]; // array dengan kapasitas 100 elemen

    printf("Masukkan jumlah mahasiswa: ");
    scanf("%d", &n);

    // Input nilai ke dalam array
    for (i = 0; i < n; i++) {
        printf("Nilai mahasiswa ke-%d: ", i + 1);
        scanf("%d", &nilai[i]);
    }

    // Output semua nilai dari array
    printf("\nDaftar nilai mahasiswa:\n");
    for (i = 0; i < n; i++) {
        printf("Mahasiswa ke-%d: %d\n", i + 1, nilai[i]);
    }

    return 0;
}
