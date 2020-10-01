# Que: Count Total Digits in a Number.
# input -> 9999
# output -> 4

def fun(n):
    if(n<10):
        return 1
    
    else:
        return 1+fun(n//10)

fun(9999)