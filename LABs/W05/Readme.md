# W05. Test Case / Test Scenario


## 1. Cause-Effect Graph

1.1. Let us take an example of a problem statement which says the first column should have the value X or Y. The second column should hold only digits. If both these conditions are satisfied, then a file should be modified. If the first column does not hold the values either X or Y, then the message M1 is generated. If the second column is fed with no digits, then the message M2 is generated.
   
1.2. If the character of the first column is ‘A’ or ‘B’ and the second column is a number, then the file is considered updated. If the first character is erroneous, then message x should be printed. If the second column is not a number, then message y should be printed.

1.3. triangle problem  
**causes**  
- C1 : Side x is less than sum of y and z
- C2 : Side y is less than sum of x and z
- C3 : Side z is less then sum of x and y
- C4 : Side x is equal to side y
- C5 : Side x is equal to side z
- C6 : Side y is equal to side z
    
**effects**  
- e1 : Not a triangle
- e2 : Scalene triangle
- e3 : Isosceles triangle.
- e4 : Equilateral triangle
- e5 : Impossible

1.4. A subpart of the course registration system which assigns course buildings based on the faculty and the number of registered students is specified.  
Based on the given specification, there are two faculties, which are Engineering Faculty and Art and Science Faculty. Also, there are four buildings, which are A, B, C and D. In addition to that, the following software specifications are given.  
- R0101 If the number of registered students for a course is less than 10 in the Engineering Faculty, the course building will be A block
- R0102 If the number of registered students for a course is between 10 and 50 in the Engineering Faculty, the course building will be B block
- R0103 If the number of registered students for a course is less than 10 in the Art and Science Faculty, the course building will be B block
- R0104 If the number of registered students for a course is between 10 and 50 in the Art and Science Faculty, the course building will be C block
- R0105 If the number of registered students for a course is greater than 50 both for the Engineering Faculty and the Art and Science Faculty, the course building will be D block


## 2. STT - State transition testing  

2.1. electronic clock  
A simple electronic clock has four modes, display time,change time, display date and change date  
- The change mode button switches between display time and display date
- The reset button switches from display time to adjust time or display date to adjust date
- The set button returns from adjust time to display time or adjust date to display date

2.2. login - banking system    
<img width="720" height="244" alt="image" src="https://github.com/user-attachments/assets/565b4cf0-b04e-46ea-ba80-2ba6b9a656f5" />


2.3. Kiosk States  
<img width="500" height="526" alt="image" src="https://github.com/user-attachments/assets/059c33a6-1d38-475a-a885-5765f8f77320" />




## 3. Scenario  

```Example
Test Scenario:  
• Test Scenario 1: Validate the login functionality of the application.
• Test Scenario 2: Verify the checkout process for an e-commerce site.

Test Case:
Test Case for Scenario 1 (Login Functionality):

Pre-condition: User must have an active account.

Steps:
s1. Navigate to the login page.
s2. Enter a valid username and password.
s3. Click the ‘Login’ button.

Expected Outcome: User is redirected to the dashboard.
```

1. Fahasa
2. Tiki
3. Lazada  
