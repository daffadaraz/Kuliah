case = int(input())
count = [0]*case

for i in range(0,case):
    raw = input()
    raw = raw.split()
    mat = ([0]*raw[0])[0]*