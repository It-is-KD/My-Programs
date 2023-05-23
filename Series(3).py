s = 0.0
n = int (input ("Enter the range: "))
for i in range(1, n+1):
    s += 1.0 / i
print("Sum of the series upto", n, "elements is=", s)
