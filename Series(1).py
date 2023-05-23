def factorial(num):
    return num * factorial(num - 1) if num != 1 else 1


# main function
s = 0.0
for i in range(10):
    s += 1.0 / factorial(i + 1)
print("Sum of the series upto 10 elements is=", s + 1)
