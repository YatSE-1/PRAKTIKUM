#include <stdio.h>
#include <string.h>
#include <unistd.h> // untuk usleep

int main() {
    char text1[] = "Halo, ini teks berjalan!";
    char text2[] = "Teks kedua ikut berjalan.";
    int len1 = strlen(text1);
    int len2 = strlen(text2);

    int pos1 = 40; // posisi awal text1
    int pos2 = 60; // posisi awal text2 (lebih jauh agar tidak tabrakan)

    while (1) {
        // Bersihkan layar
        printf("\033[2J\033[1;1H");

        // Geser text1
        for (int i = 0; i < pos1; i++) {
            printf(" ");
        }
        printf("%s\n", text1);

        // Geser text2
        for (int i = 0; i < pos2; i++) {
            printf(" ");
        }
        printf("%s\n", text2);

        // Update posisi
        pos1--;
        pos2--;

        // Reset agar berulang
        if (pos1 < 0) pos1 = 40;
        if (pos2 < 0) pos2 = 60;

        // Delay
        usleep(200000); // 200 ms
    }

    return 0;
}
