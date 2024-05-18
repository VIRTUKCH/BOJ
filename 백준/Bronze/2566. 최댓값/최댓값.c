#include <stdio.h>

int main() {
    int a[9][9] = { 0 };

    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            scanf("%d", &a[i][j]);
        }
    }

    int max = 0;
    int x = 0, y = 0;

    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            if (max < a[i][j]) {
                max = a[i][j];
                y = i;
                x = j;
            }
        }
    }

    printf("%d\n", max);
    printf("%d %d", y+1, x+1);

    return 0;
}
