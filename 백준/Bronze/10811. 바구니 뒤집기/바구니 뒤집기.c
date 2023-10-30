#include <stdbool.h>
#include <stdio.h>

void jaribakoogi(int* bagooni, int start, int final) { // 3 4
    start--; // 2
    final--; // 3

    int cnt = 0;
    for (int i = start; i <= (final + start) / 2; i++) { // 2 2
        
        int temp = 0;
        temp = bagooni[i]; // bagooni[2]
        bagooni[i] = bagooni[final - cnt]; //bagooni[2] = bagooni[3]
        bagooni[final - cnt] = temp;
        cnt++;
    }
}

int main() {
    int sizeOfBagooni = 0;
    int repeat = 0;

    // 1. 바구니 사이즈, 반복 횟수 입력받기
    scanf("%d %d", &sizeOfBagooni, &repeat);

    // 2. 바구니 배열 선언하기 (사이즈는 입력한대로 동적 할당)
    int bagooni[sizeOfBagooni];
    
    // 3. 바구니 초기화하기 {1, 2, 3, 4, 5}
    for (int i=0; i<sizeOfBagooni; i++) {
        bagooni[i] = i+1;
    }

    int start = 0;
    int final = 0;
    // 4. 바구니 역정렬
    for (int i = 0; i < repeat; i++) {
        // 4-1 : 어디서부터 어디까지 바꿀까?
        scanf("%d %d", &start, &final);

        // 4-2 : 함수로 접근해서 바꾸자
        jaribakoogi(bagooni, start, final);
    }

    for (int i = 0; i < sizeOfBagooni; i++) {
        printf("%d ", bagooni[i]);
    }
}