# W11. UnitTest

## 🎯 Objective

In this lab, students will learn how to:

* Write **unit tests** for existing Java methods (provided in Week 10)
* Use **JUnit** for testing
* Manage project dependencies using **Apache Maven**
* Execute and evaluate automated unit tests

---

## 📌 Assignment Description

Based on the Java methods provided in **Week 10**, students are required to:

### 1. Setup Maven Project

* Create a **Maven project** (using IDE like Eclipse/IntelliJ)
* Configure `pom.xml` to include:

  * JUnit dependency (JUnit 5 recommended)
* Ensure project structure follows standard Maven layout:

```
src/
 ├── main/java        (source code – Week 10 methods)
 └── test/java        (unit test classes)
```

---

### 2. Identify Methods to Test

* Use all (or a selected subset of) methods from Week 10
* For each method:

  * Analyze input parameters
  * Identify possible cases:

    * Normal cases
    * Boundary cases
    * Invalid/exception cases

---

### 3. Design Unit Test Cases

For each method, students must:

* Define:

  * Test Case ID
  * Input values
  * Expected output
* Apply techniques such as:

  * Equivalence Partitioning (EP)
  * Boundary Value Analysis (BVA)

---

### 4. Implement Unit Tests (JUnit)

* Create test classes in `src/test/java`

* Naming convention:

  ```
  ClassNameTest.java
  ```

* Use JUnit annotations:

  * `@Test`
  * `@BeforeEach` (if needed)
  * `@AfterEach` (if needed)

* Use assertions:

  * `assertEquals()`
  * `assertTrue()`
  * `assertThrows()`

👉 Example:

```java
@Test
void testCalculateSum_validInput() {
    int result = Calculator.sum(2, 3);
    assertEquals(5, result);
}
```

---

### 5. Execute Unit Tests

* Run tests using:

  * IDE (Run as JUnit Test)
  * Maven command:

    ```
    mvn test
    ```

* Ensure:

  * All tests are executed
  * Test results are visible (PASS/FAIL)

---

### 6. Analyze Test Results

For each test:

* Record:

  * Expected Result
  * Actual Result
  * Status (Pass/Fail)

* If a test fails:

  * Identify the cause
  * Determine whether:

    * The code is incorrect, or
    * The test case is incorrect

---

### 7. (Optional) Improve Test Quality

* Refactor tests using:

  * Reusable setup methods
  * Clear naming conventions
* Apply:

  * Parameterized tests (`@ParameterizedTest`)
  * Edge case coverage

---

## 📄 Deliverables

Students must submit:

1. **Source Code**

   * Java classes (Week 10)
   * Test classes (JUnit)

2. **Test Case Document**

   * List of test cases with inputs & expected outputs

3. **Execution Evidence**

   * Screenshots or logs showing test execution

4. **Test Report**

   * Summary of:

     * Total test cases
     * Passed / Failed
     * Bugs found (if any)

---
