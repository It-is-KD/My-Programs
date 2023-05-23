f = 1
n = int(input("Enter a number: "))
if n < 0:
    print("Factorial of negetive numbers do not exist")
elif n == 0 or n == 1:
    print("Factorial of", n, "= 1")
else:
    for i in range(1, n + 1):
        f *= i
    print("Factorial of", n, "=", f)