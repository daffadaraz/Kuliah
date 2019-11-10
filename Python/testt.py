def b(a):
    for i in range(1,a):
        temp = a/i
        b = int(temp)
        if temp == b:
            print(i , " - " , (a/i))
b(29141)