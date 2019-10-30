import math

case = int(input())
count = [0]*case
for i in range(0,case):
    raw = input()
    a = raw.split()
    count[i] = math.ceil(int(a[0])/int(a[1]))
for i in range(0,case):
    j = i+1
    print("Kasus #"+str(j)+":",count[i])