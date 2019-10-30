case = int(input())
count = [0]*case
for i in range(0,case):
    size = int(input())
    raw = input()
    a = raw.split()
    b = [0]*5
    sum = 0
    for j in range(0,5):
        for k in range(0,size):
            if(int(a[k]) > int(b[j])):
                for l in range(0,5):
                    if(int(a[k]) != int(b[l])):
                        b[j] = int(a[k])
                    
    for j in range(0,len(b)):
        count[i] += b[j]
for i in range(0,case):
    print(count[i])