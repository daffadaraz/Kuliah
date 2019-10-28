tempprice = 0

for i in range(1,150):
    for j in range(1,150-i):
        for k in range(1,150-j):
            sum = (int(i))+(2*int(j))+(2*int(k))
            price = (int(i)*1000)+(int(j)*2000)+(int(k)*3000)
            if(price >= tempprice and sum <= 150):
                print(str(i)+","+str(j)+","+str(k)+"="+(str(sum)))
                print("price : "+str(price))
                tempprice = price
                tempsum = sum

