def factorial(num):
    return num * factorial(num - 1) if num != 1 else 1


# main function
s = 0.0
n = int (input ("Enter the range: "))
for i in range(n):
    s += factorial(i + 1)
print("Sum of the series upto", n, "elements is=", s)
