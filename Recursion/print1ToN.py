# Que: Print 1 to N withot Loop.
# input -> 5
# output -> 1 2 3 4 5

def recu(n):
    if(n==0):
        return 1
    
    else:
        recu(n-1)
        print(n,end=" ")
    

recu(5)
# Contributed By: Harsh Udai
