import random


def Cube(x: int):  # sourcery skip: square-identity
    return "%d**3 = %d"%(x, x*x*x)


def Square(y: int):  # sourcery skip: square-identity
    return "%d**2 = %d"%(y, y*y)


def generate() -> int:
    return random.randint(10, 100)


for _ in range(6):
    randomvalue = generate()
    if randomvalue%2==0:
        print(Square(randomvalue))
    if randomvalue%2!=0:
        print(Cube(randomvalue)) 

