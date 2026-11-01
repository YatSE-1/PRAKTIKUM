#include <stdio.h>

int main() {
    int tekanan = 0;
    int suhu = 25;
    char status[20] = "tenang";

    for(int i = 0; i < 120; i++) {
        tekanan += 1;
        suhu += 2;

        printf("Iterasi %d: Tekanan = %d, Suhu = %d, Status = %s\n", i, tekanan, suhu, status);

        if(tekanan > 100 && suhu > 200) {
            sprintf(status, "meletus");
            printf("Gunung berapi meletus!\n");
            
        }
    }

    printf("Kondisi akhir: Tekanan = %d, Suhu = %d, Status = %s\n", tekanan, suhu, status);
    return 0;
}
