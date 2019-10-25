case = int(input())
remed = [0]*case
for i in range(0,case):
    scorecount = int(input())
    rawscore = input()
    score = rawscore.split()
    for j in range(0,scorecount):
        if(int(score[j])<60):
            remed[i] += 1

for i in range(0,case):
    l = i + 1
    print('Case #'+str(l)+': '+str(remed[i]))