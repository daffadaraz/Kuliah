import json

f = open("data.txt","r")

a = f.readlines()

newitem =[]
for item in a:
    newitem.append(item.translate({ord('\n'): None}))

x = {
    "nama" : newitem[0],
    "npm" : newitem[1]
}

y = json.dumps(x)

print(x)