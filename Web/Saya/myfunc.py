import os

def clear():
    if os.name == "nt":
        os.system('cls')
        pass
    else:
        os.system('clear')

def enterinp():
    if os.name == "nt":
        input("Press enter to exit...")
        print('\n')
        pass
    else:
        os.system('read -p "Press enter to exit"') #linux
