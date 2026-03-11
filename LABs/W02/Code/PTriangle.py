# Program to determine the type of triangle based on three side lengths

a = float(input("Enter the length of side a: "))
b = float(input("Enter the length of side b: "))
c = float(input("Enter the length of side c: "))

# Check if the sides can form a triangle
if a + b > c and a + c > b and b + c > a:

    # Sort sides to easily check right triangle condition
    sides = sorted([a, b, c])
    x, y, z = sides   # z is the largest side

    is_right = abs(x**2 + y**2 - z**2) < 1e-6

    if a == b == c:
        print("This is an Equilateral triangle.")

    elif is_right and (a == b or b == c or a == c):
        print("This is a Right Isosceles triangle.")

    elif is_right:
        print("This is a Right triangle.")

    elif a == b or b == c or a == c:
        print("This is an Isosceles triangle.")

    else:
        print("This is a Scalene triangle.")

else:
    print("The given sides do not form a triangle.")