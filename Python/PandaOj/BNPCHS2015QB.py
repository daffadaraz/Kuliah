count = int(input())
raw = ['a a']*count
for i in range(0,count):
    raw[i]=input()
for i in range(0,count):
    b = 0
    l = i+1
    b = int(raw[i])%2
    if(b==0):
        stat = 'TIDAK CINTA'
    else:
        stat = 'CINTA'
    print('Kasus #'+str(l)+': '+stat)