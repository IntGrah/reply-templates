import sys

sys.stdin = open("input.txt", "r")
sys.stdout = open("output.txt", "w")

def solve():
    N = int(input())

    # TODO

    print(N)


T = int(input())
for t in range(1, T + 1):
    print("Case #{}: ".format(t), end="")
    solve()
