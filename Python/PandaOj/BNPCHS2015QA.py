count = int(input())
raw = ['a a']*count
for i in range(0,count):
    raw[i]=input()
for i in range(0,count):
    b = 0
    l = i+1
    a = raw[i].split()
    b = int(a[0]) * int(a[1])
    print('Kasus #'+str(l)+': '+str(b))