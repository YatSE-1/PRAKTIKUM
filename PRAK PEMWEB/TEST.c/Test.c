/*	program : MEMBUAT MESIN GAMBAR SEDERHANA
	Author	: 2550081015 / Muhammad Setyadi Hartawan Widyantara
			  2550081018 / Tatya Nova Wulandari
			  2550081001 / Sastra Darma Wiguna
	Desc	: TUGAS BESAR ALGORITMA DAN PEMROGRAMAN
*/


#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define ROW 20
#define COL 40
#define SAVEFILE "save_canvas.txt"

/* Main Driver */
int x = ROW/2;
int y = COL/2;
/* Kamus */
char canvas[ROW][COL];



/* Membersihkan canvas */
void clearCanvas() {
    int i, j;
    for (i = 0; i < ROW; i++) {
        for (j = 0; j < COL; j++) {
            canvas[i][j] = ' ';
        }
    }
}

/* Kamus  */
void printCanvas() {
    int i, j;
    system("cls");

    printf("--------- MESIN GAMBAR SEDERHANA ---------\n");

    for (i = 0; i < ROW; i++) {
        printf("|");
        for (j = 0; j < COL; j++) {
            putchar(canvas[i][j]);
        }
        printf("|\n");
    }

    printf("------------------------------------------\n\n");

    printf("Kontrol:\n");
    printf("W = Atas | S = Bawah | A = Kiri | D = Kanan\n");
    printf("Q = Kiri Atas | E = Kanan Atas\n");
    printf("Z = Kiri Bawah | C = Kanan Bawah\n\n");

    printf("F = Simpan | R = Baca | X = Bersihkan Layar | 0 = Keluar\n");
}

/* Menyimpan Canvas  */
void saveCanvas() {
    FILE *fp = fopen(SAVEFILE, "w");
    int i, j;

    if (!fp) {
        printf("Gagal menyimpan file!\n");
        system("pause");
        return;
    }

    for (i = 0; i < ROW; i++) {
        for (j = 0; j < COL; j++) {
            fputc(canvas[i][j], fp);
        }
        fputc('\n', fp);
    }

    fclose(fp);
    printf("Canvas berhasil disimpan!\n");
    system("pause");
}

void loadCanvas() {
    FILE *fp = fopen(SAVEFILE, "r");
    int i, j;
    char buf[COL + 5];

    if (!fp) {
        printf("Belum ada file save!\n");
        system("pause");
        return;
    }
    
    for (i = 0; i < ROW; i++) {
        if (fgets(buf, sizeof(buf), fp) == NULL) {
            for (j = 0; j < COL; j++)
                canvas[i][j] = ' ';
            continue;
        }

        for (j = 0; j < COL; j++) {
            if (buf[j] == '\n' || buf[j] == '\0')
                canvas[i][j] = ' ';
            else
                canvas[i][j] = buf[j];
        }
    }

    fclose(fp);
    printf("Canvas berhasil dibaca!\n");
    system("pause");
}

/* Menggerakkan simbol */
void moveSymbol(int dx, int dy) {
    y += dy;
    x += dx;

    if (x < 0) x = 0;
    if (x >= ROW) x = ROW - 1;
    if (y < 0) y = 0;
    if (y >= COL) y = COL - 1;

    canvas[x][y] = '+';
}

int main() {
    char cmd;

    clearCanvas();
    canvas[x][y] = '+';

    while (1) {
        printCanvas();
        printf("\nMasukkan perintah: ");
        scanf(" %c", &cmd);

        switch (cmd) {
            case 'w':
            case 'W': moveSymbol(-1, 0); break;

            case 's':
            case 'S': moveSymbol(1, 0); break;

            case 'a':
            case 'A': moveSymbol(0, -1); break;

            case 'd':
            case 'D': moveSymbol(0, 1); break;

            case 'q':
            case 'Q': moveSymbol(-1, -1); break;

            case 'e':
            case 'E': moveSymbol(-1, 1); break;

            case 'z':
            case 'Z': moveSymbol(1, -1); break;

            case 'c':
            case 'C': moveSymbol(1, 1); break;

            case 'f':
            case 'F': saveCanvas(); break;

            case 'r':
            case 'R': loadCanvas(); break;

            case 'x':
            case 'X':
                clearCanvas();
                printf("Layar dibersihkan!\n");
                system("pause");
                break;

            case '0':
                printf("Program selesai.\n");
                return 0;

            default:
                printf("Perintah tidak dikenal!\n");
                system("pause");
        }
    }

    return 0;
}
