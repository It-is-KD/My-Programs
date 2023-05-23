y = int(input("Enter the Year to check for Leap Year: "))
if y % 100 == 0 and y % 400 == 0:
    print(y, 'is a Leap Year')
elif y % 4 == 0 and y % 100 != 0:
    print(y, 'is a Leap Year')
else:
    print(y, 'is not a Leap Year')