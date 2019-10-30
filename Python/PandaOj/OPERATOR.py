case = int(input())
op = []

for i in range(0,case):
    raw = input()
    a = raw.split()
    if int(a[0])+int(a[1]) == int(a[2]):
        op.append('+')
    elif int(a[0])-int(a[1]) == int(a[2]):
        op.append('-')
    elif int(a[0])*int(a[1]) == int(a[2]):
        op.append('*')
    elif int(a[0])/int(a[1]) == int(a[2]):
        op.append('/')
    else:
        op.append("TIDAK ADA SOLUSI")

for i in range(0,case):
    print("Kasus #"+str(i+1)+":",op[i])