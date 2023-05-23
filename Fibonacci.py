t1, t2, t3 = 0, 1, 0
n = int(input("Enter the range: "))
print("The Fibonacci Series is:")
print(t1)
for i in range(n-1):
    t1 = t2
    t2 = t3
    t3 = t1 + t2
    print(t3)