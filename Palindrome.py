n = int(input("Enter a number: "))
t, r, a = n, 0, 0
while t > 0:
    r = t % 10
    a = (a * 10) + r
    t //= 10
if n == a:
    print(n, "is Palindrome number")
else:
    print(n, "is not a Palindrome number")