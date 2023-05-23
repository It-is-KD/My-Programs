n1 = int(input("Enter 1st number: "))
n2 = int(input("Enter 2nd number: "))
lcm = 1
i = max(n1, n2)
while True:
    if (i % n1 == 0) and (i % n2 == 0):
        lcm = i
        break
    i += 1
print("LCM of", n1, '&', n2, '=', lcm)
