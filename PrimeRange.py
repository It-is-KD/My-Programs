r1 = int(input("Enter a the lower limit: "))
r2 = int(input("Enter a the upper limit: "))
for i in range(r1, r2+1):
    if i>1:
        for j in range(2, i):
            if i%2==0:
                break
        else:
            print(i)