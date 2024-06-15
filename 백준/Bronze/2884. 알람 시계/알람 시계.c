#include<stdio.h>
int main() {
    int H = 0, M = 0;
    scanf("%d %d", &H, &M);
    M = H * 60 + M - 45;
    M = (M + 24 * 60) % (24 * 60);
    printf("%d %d", M / 60, M % 60);
    return 0;
}