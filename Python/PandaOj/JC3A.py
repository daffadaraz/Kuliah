case = int(input())
count = [0]*case
for i in range(0,case):
    length = int(input())
    if(length == 3):
        count[i] += 1
        continue
    for a in range(1,length):
        for b in range(length-(a+1),0,-1):
            c = length-(a+b)
            print(a,b,c," = ",(a+b+c))
            if((a==b and a+b>c) or (a==c and a+c>b) or (b==c and b+c>a)):
                count[i] += 1

for i in range(0,case):
    j = i +1
    print("Case #"+str(j)+":",count[i])