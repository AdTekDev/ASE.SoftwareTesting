# W10. WhiteBox 

## 🎯 Objective

Students are required to design **white-box test cases** for the given programs by applying:

* Statement Coverage
* Branch Coverage
* Path Coverage

---

## 📌 Requirements (for EACH exercise)

For every code snippet below, students must:

1. Draw the **Control Flow Graph (CFG)**
2. Identify all:

   * Statements
   * Branches
   * Execution paths
3. Design **test cases** to achieve:

   * 100% Statement Coverage
   * 100% Branch Coverage
4. (Optional) Achieve maximum possible **Path Coverage**
5. Clearly explain the coverage achieved

---

## 🧩 Exercise Set (15 Programs)

---

### **Exercise 1: Even or Odd**

```java
int checkEvenOdd(int n) {
    if (n % 2 == 0)
        return 1;
    else
        return 0;
}
```

---

### **Exercise 2: Maximum of Two Numbers**

```java
int max(int a, int b) {
    if (a > b)
        return a;
    else
        return b;
}
```

---

### **Exercise 3: Number Classification**

```java
int classify(int n) {
    if (n > 0)
        return 1;
    else if (n == 0)
        return 0;
    else
        return -1;
}
```

---

### **Exercise 4: Simple Discount**

```java
double discount(double price) {
    if (price > 100)
        return price * 0.9;
    return price;
}
```

---

### **Exercise 5: Login Validation**

```java
boolean login(String user, String pass) {
    if (user.equals("admin") && pass.equals("123"))
        return true;
    return false;
}
```

---

### **Exercise 6: Leap Year Check**

```java
boolean isLeapYear(int year) {
    if (year % 4 == 0) {
        if (year % 100 == 0)
            return (year % 400 == 0);
        return true;
    }
    return false;
}
```

---

### **Exercise 7: Pass or Fail**

```java
String result(int score) {
    if (score >= 50)
        return "Pass";
    else
        return "Fail";
}
```

---

### **Exercise 8: Grade Classification**

```java
String grade(int score) {
    if (score >= 85)
        return "A";
    else if (score >= 70)
        return "B";
    else if (score >= 50)
        return "C";
    else
        return "F";
}
```

---

### **Exercise 9: Sum of Numbers**

```java
int sum(int n) {
    int s = 0;
    for (int i = 1; i <= n; i++) {
        s += i;
    }
    return s;
}
```

---

### **Exercise 10: Prime Check**

```java
boolean isPrime(int n) {
    if (n < 2) return false;
    for (int i = 2; i < n; i++) {
        if (n % i == 0)
            return false;
    }
    return true;
}
```

---

### **Exercise 11: Absolute Value**

```java
int abs(int n) {
    if (n < 0)
        return -n;
    return n;
}
```

---

### **Exercise 12: Simple Calculator**

```java
int calc(int a, int b, char op) {
    if (op == '+') return a + b;
    else if (op == '-') return a - b;
    else if (op == '*') return a * b;
    else if (op == '/' && b != 0) return a / b;
    return 0;
}
```

---

### **Exercise 13: Find Minimum of Three**

```java
int min(int a, int b, int c) {
    int m = a;
    if (b < m) m = b;
    if (c < m) m = c;
    return m;
}
```

---

### **Exercise 14: Loop with Break**

```java
int findFirstEven(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0)
            return arr[i];
    }
    return -1;
}
```

---

### **Exercise 15: Nested Conditions**

```java
String check(int a, int b) {
    if (a > 0) {
        if (b > 0)
            return "Both positive";
        else
            return "a positive, b not";
    } else {
        return "a not positive";
    }
}
```

---

## 📊 Expected Deliverables

For each exercise, students must submit:

* CFG diagram
* List of test paths
* Test case table (input, expected output, coverage)
* Coverage analysis (% statement, branch, path)

---

## 💡 Optional Extension (for advanced students)

* Identify **unreachable paths**
* Detect **logical errors or missing cases**
* Suggest improvements to increase testability

---
