# Que: Recursive Sum N Numbers.
# input -> 4
# output -> 10 (4+3+2+1)

def fun(n):
    if(n==0):
        return 0
    
    else:
        return n+fun(n-1)

fun(5)
# Contributed By: Harsh Udai
