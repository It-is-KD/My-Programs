n = input("1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit\n")
match n:
    case '1':
        f = float(input("Enter the temperature in Fahrenheit: "))
        c = ((f - 32) * 5) / 9
        print("Temperature in Celsius=", round(c, 2))
    case '2':
        c = float(input("Enter the temperature in Celsius: "))
        f = ((9 / 5) * c) + 32
        print("Temperature in Fahrenheit=", round(f, 2))
    case _:
        print("Invalid input")
