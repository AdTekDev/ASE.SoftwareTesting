# W05. Test Case / Test Scenario


## Cause-Effect 

1. Let us take an example of a problem statement which says the first column should have the value X or Y. The second column should hold only digits. If both these conditions are satisfied, then a file should be modified. If the first column does not hold the values either X or Y, then the message M1 is generated. If the second column is fed with no digits, then the message M2 is generated.

2. triangle problem  
**causes**  
- C1 : Side �x� is less than sum of �y� and �z�
- C2 : Side �y� is less than sum of �x� and �z�
- C3 : Side �z� is less then sum of �x� and �y�
- C4 : Side �x� is equal to side �y�
- C5 : Side �x� is equal to side �z�
- C6 : Side �y� is equal to side �z�
  
**effects**  
- e1 : Not a triangle
- e2 : Scalene triangle
- e3 : Isosceles triangle.
- e4 : Equilateral triangle
- e5 : Impossible

