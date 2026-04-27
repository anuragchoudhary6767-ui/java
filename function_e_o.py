#Same q using two function

def evenfact(a):#this function calculate even function
    fact=1
    for i in range(2,a+1,2):
            fact=fact*i
    print("Your even factorial:", fact)


def oddfact(b):
    fact=1
    for i in range(1,b+1,2):
            fact=fact*i
    print("Your odd factorial:", fact)

num=int(input("Enter a number: "))
if((num%2)==0):
    evenfact(num)
else:
    oddfact(num)