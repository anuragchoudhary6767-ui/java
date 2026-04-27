# Program to find the largest element in a list

def find_largest(lst):
    if not lst:  # check if the list is empty
        return None
    largest = lst[0]
    for num in lst:
        if num > largest:
            largest = num
    return largest

# Example usage
numbers = [12, 45, 67, 23, 1000, 34]
print("The largest element is:", find_largest(numbers))







#W.A.P that take will list from user and in list increse by 5 and 


# lst = eval( input("enter the list"))
# print (lst)
# for i in range(len(lst)):
#     if lst [i]%2==0:
#         lst[i]+=5
#     else:
#         lst[i]-=5
#         print(lst)