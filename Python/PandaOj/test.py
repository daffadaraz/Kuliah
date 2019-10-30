case = int(input())
count = []
for i in range(0,case):
    length = int(input())
    count.append(0)
    for a in range(1,length):
        for b in range(length-(a+1),0,-1):
            c = length-(a+b)
            num = [a,b,c]
            print(a,b,c)
            num.sort()
            if(num[0]+num[1])>num[2]:
                count[i] += 1

for i in range(0,case):
    j = i +1
    print("Case #"+str(j)+":",count[i])