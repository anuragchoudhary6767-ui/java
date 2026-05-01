# Program to demonstrate slicing in Python
# Program to demonstrate slicing in Python

# Example list
numbers = [10, 20, 30, 40, 50, 60, 70]

print("Original list:", numbers)

# Slice from index 1 to 4 (exclusive of 4)
print("Slice [1:4]:", numbers[1:4])

# Slice from beginning to index 3
print("Slice [:3]:", numbers[:3])

# Slice from index 2 to the end
print("Slice [2:]:", numbers[2:])

# Slice with step (every 2nd element)
print("Slice [::2]:", numbers[::2])

# Slice with negative indices
print("Slice [-3:]:", numbers[-3:])

# Reverse the list using slicing
print("Reversed list:", numbers[::-1])





