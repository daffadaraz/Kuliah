count = int(input())
raw = input()
a = raw.split()
b = 0
min = int(a[0])
for i in range(0,len(a)):
    if(int(a[i])<=min):
        min = int(a[i])
    b += int(a[i])
print(str(b-min))