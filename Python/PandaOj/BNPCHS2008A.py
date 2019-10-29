case = int(input())
count = [0]*case
for i in range(0,case):
    string = input()
    count[i] = len(''.join(set(string)))

for i in range(0,case):
    print(count[i])