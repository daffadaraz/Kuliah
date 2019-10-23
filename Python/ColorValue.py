import sys

def color(r,g,b):
    grey = (r*0.299)+(g*0.587)+(b*0.1148)
    if(grey>=75):
        bin=1
    else:
        bin=0
    print("RGV Value    :"+str(r)+" "+str(g)+" "+str(b))
    print("Grey Value   : " + str(grey))
    print("Binary Value : " + str(bin))

if __name__ == "__main__":
    color(int(sys.argv[1]),int(sys.argv[2]),int(sys.argv[3]))