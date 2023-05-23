n1 = int(input("Enter 1st number: "))
n2 = int(input("Enter 2nd number: "))
hfc = 1
for i in range(1, min(n1, n2)):
    if n1 % i == 0 and n2 % i == 0:
        hcf = i
print("HCF of", n1, '&', n2, '=', hcf)