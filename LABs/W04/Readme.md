# W04. Test Case

Analyze the following problems and design appropriate **test cases using Black-Box testing techniques** such as **Equivalence Partitioning, Boundary Value Analysis, and Decision Tables**.

---

## Exercise 1: Candidate Age Filtering

A recruitment system provides an interface to filter job candidates based on **age**.

The user enters a **minimum age threshold A**, and the system displays all candidates whose **age is greater than or equal to A**.

Tasks:

1. Identify the **input domain** for the variable A.
2. Determine **equivalence classes** for valid and invalid inputs.
3. Identify **boundary values** that should be tested.
4. Design a set of **test cases** to verify the correctness of the filtering function.

---

## Exercise 2: Game Object Visibility in a Viewport

In a game application, an object **Q** is located at coordinates **(x, y)**.

The program must determine whether **Q is inside the viewport** so that it can be rendered on the screen.

Tasks:

1. Identify the possible **positions of object Q** relative to the viewport.
2. Determine the **different situations** that must be tested (e.g., inside, outside, on the boundary).
3. Design **test cases** to verify that the program correctly determines whether Q should be displayed.

---

## Exercise 3: Login Password Length Validation

A system requires users to enter a password when logging in.

The password must satisfy the following rule:

* The password length must be **between 8 and 20 characters**.

Tasks:

1. Identify **equivalence classes** for valid and invalid inputs.
2. Determine **boundary values** that should be tested.
3. Design a set of **test cases** for password validation.

---

## Exercise 4: Online Shopping Discount Rule

An e-commerce system provides discounts based on the **total purchase amount**.

The rules are:

* Orders **below $100** → no discount
* Orders **from $100 to $500** → 10% discount
* Orders **above $500** → 20% discount

Tasks:

1. Identify the **equivalence classes** of the purchase amount.
2. Determine **boundary values** for testing.
3. Design **test cases** to verify the discount calculation.

---

## Exercise 5: Student Grade Classification

A university system classifies students' grades according to their **final score (0–100)**:

* **90–100** → Excellent
* **75–89** → Good
* **60–74** → Average
* **Below 60** → Fail

Tasks:

1. Identify **equivalence partitions** for the input score.
2. Determine the **boundary values** that should be tested.
3. Design **test cases** to verify the classification logic.


