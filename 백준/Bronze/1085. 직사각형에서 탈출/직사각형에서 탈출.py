x, y, w, h = map(int, input().split())
# x, y : 한수의 위치
# w, h : 직사각형의 오른쪽 위 꼭지점

# 1. 왼쪽으로 쭉 가는 거리
x
# 2. 오른쪽으로 쭉 가는 거리
w-x
# 3. 위로 쭉 가는 거리
h-y
# 4. 아래로 쭉 가는 거리
y
# 5. 비교하는 코드
print(min(x, w-x, h-y, y))