#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    // 줄 바꾸기 -> n번
    for (int i = 0; i < n; i++) {

        // 별 출력하기 -> 5번
        for (int j = 0; j < i + 1; j++) {
            printf("*");    
        }

        // 줄 바꾸기
        printf("\n");
    }
    return 0;
}