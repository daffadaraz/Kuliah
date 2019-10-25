raw = input()
a = raw.split()
b = [0]*int(a[0])
c = 0
for i in range(1,len(b)+1):
    c += int(a[i])
print(c)