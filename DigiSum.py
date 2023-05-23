s, r, i = 0, 0, 0
n = int(input("Enter a number: "))
while n > 0:
    r = n % 10
    s += r
    n //= 10
    if n == 0:
        if s < 9:
            print(s)
            break
        n = s
        s = 0
        continue