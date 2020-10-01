# Que: Sum of Digits in a Number.
# input -> 9999
# output -> 36

def fun(n):
    if(n<10):
        return n%10
    
    else:
        return n%10+fun(n//10)

fun(9999)