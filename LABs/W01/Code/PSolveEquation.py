import math

print("Solve quadratic equation: ax^2 + bx + c = 0")

a = float(input("Enter a: "))
b = float(input("Enter b: "))
c = float(input("Enter c: "))

# Check if a = 0 (not quadratic)
if a == 0:
    if b == 0:
        if c == 0:
            print("The equation has infinitely many solutions.")
        else:
            print("The equation has no solution.")
    else:
        x = -c / b
        print("The equation has one solution: x =", x)
else:
    delta = b*b - 4*a*c

    if delta > 0:
        x1 = (-b + math.sqrt(delta)) / (2*a)
        x2 = (-b - math.sqrt(delta)) / (2*a)
        print("The equation has two distinct solutions:")
        print("x1 =", x1)
        print("x2 =", x2)

    elif delta == 0:
        x = -b / (2*a)
        print("The equation has a double root: x =", x)

    else:
        print("The equation has no real solution.")