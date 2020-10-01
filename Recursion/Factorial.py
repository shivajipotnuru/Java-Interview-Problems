# Que: Factorial of a number N.
# input -> 5
# output -> 5x4x3x2x1 = 120

def fact(n):
    if(n==0):
        return 1
    
    return n*fact(n-1)

fact(5)
# Contributed By: Harsh Udai
