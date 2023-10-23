# 1. 몇 개나 입력할지, 숫자를 받아 온다
N = int(input())

# 2. 문자열을 입력 받는다
W = input().split(' ')

# 3. 문자열에서 입력 받을 숫자를 받아 온다.
V = input()

# 4. w 안에서 v를 찾는다.
print(W.count(str(V).strip()))