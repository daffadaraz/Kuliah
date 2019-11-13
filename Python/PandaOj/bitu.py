case = int(input())

for a in range(0,case):
    num = int(input())
    check = 0
    flag = "NO"
    if(num == 1):
        flag = "YES"
    for i in range(1,num):
        check += i
        if(check == num):
            flag = "YES"
            break
        elif(check>num):
            break
    b = a +1
    print("Case #"+str(b)+":",flag)