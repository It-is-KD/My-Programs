p = float(input("Enter the Principle amount: "))
r = float(input("Enter the Rate %: "))
t = float(input("Enter the Time in years: "))
SI = (p * r * t) / 100
CI = (p * ((1 + (r / 100)) ** t)) - p
print('Simple Interest=', round(SI, 2), '\nCompound Interest=', round(CI, 2))