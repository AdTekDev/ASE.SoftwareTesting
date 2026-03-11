# Program to find the next date from a given day, month, and year

day = int(input("Enter day: "))
month = int(input("Enter month: "))
year = int(input("Enter year: "))

# Function to check leap year
def is_leap_year(y):
    return (y % 4 == 0) or (y % 400 == 0)

# Number of days in each month
days_in_month = [31, 28 + is_leap_year(year), 31, 30, 31, 30,
                 31, 31, 30, 31, 30, 31]

# Check if the input date is valid
if month < 1 or month > 12 or day < 1 or day > days_in_month[month - 1]:
    print("Invalid date.")
else:
    day += 1

    if day > days_in_month[month - 1]:
        day = 1
        month += 1

        if month > 12:
            month = 1
            year += 1

    print("The next date is:", day, "/", month, "/", year)