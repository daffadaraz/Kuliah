teamName = []
for i in range(8):
    a = input()
    teamName.append(a)

teamWin = []
for j in range(28):
    b = input().split()

    if (int(b[1]) == 2 ):
        teamWin.append(b[0])
    if (int(b[3]) == 2 ):
        teamWin.append(b[4])
        
teamShow = []
for k in range(8):
    x = teamName[k], teamWin.count(teamName[k])
    teamShow.append(x)

teamShow.sort(key=lambda x:x[1], reverse=True)
for l in range(8):
    print(teamShow[l][0], teamShow[l][1])

# Wrong Answer