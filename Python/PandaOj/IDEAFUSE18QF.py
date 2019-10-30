raw = input()
a = raw.split()
flag = 0
for i in range(int(a[0]),0,-1):
    b = int(a[0])-i
    if(i-b == int(a[1])):
        flag = 1
        break

if(flag==1):
    print("YES")
else:
    print("NO")