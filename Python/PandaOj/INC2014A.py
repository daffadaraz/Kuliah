case = int(input())
count = [""]*case

for i in range(0,case):
    size = int(input())
    num = [0]*size
    for a in range(0,size):
        num[a] = int(input())
    s = sum(num)
    if(s<=16000):
        count[i] = "16GB"
    elif(s<=32000):
        count[i]  = "32GB"
    elif(s<=64000):
        count[i]  = "64GB"
    else:
        count[i]  = "128GB"
for i in range(0,case):
    j = i+1
    print("Case #"+str(j)+":",count[i])