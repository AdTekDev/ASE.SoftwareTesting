# 🧪 Individual Assignment – Software Testing

## 🎯 Objective

The purpose of this assignment is to help students practice **test case design, test execution, and reporting** using a real-world e-commerce website.

---

## 📌 Assignment Requirements

Each student is required to perform the following tasks:

1. **Design Test Cases**

   * Identify and describe all necessary test cases for the given scenarios
   * Ensure coverage of both normal and edge cases

2. **Write Detailed Test Steps**

   * Provide step-by-step instructions to execute each test case
   * Steps must be clear, sequential, and reproducible

3. **Prepare Test Data**

   * Define input data for each test case
   * Ensure data supports both valid and invalid scenarios

4. **Write Test Scripts**

   * Implement automated test scripts (e.g., Selenium or similar tools)
   * Scripts should follow the designed test cases

5. **Execute Test Scripts**

   * Run the implemented scripts
   * Capture execution evidence (logs/screenshots)

6. **Record Test Results**

   * Document:

     * Expected Result
     * Actual Result
     * Pass/Fail status
   * Provide analysis if discrepancies occur

---

## 🌐 System Under Test (SUT)

Each student will test **ONE** of the following websites based on their Student ID (MSSV):

* If MSSV is **even** → Test: Thế Giới Di Động
  [https://www.thegioididong.com/](https://www.thegioididong.com/)

* If MSSV is **odd** → Test: Phong Vũ
  [https://phongvu.vn/](https://phongvu.vn/)

---

## 🧩 Test Scenarios

### Scenario 1: Add Product to Cart (No Login)

Test the following workflow:

1. User accesses the website
2. User searches for a product **X**
3. User selects a product from the result list
4. User adds the product to the cart
5. User navigates to the cart page
6. Verify that the product is correctly added to the cart

---

### Scenario 2: Remove Product from Cart

1. User already has a product in the cart
2. User removes the product
3. Verify that:

   * The product is removed successfully
   * The cart is updated correctly (empty or updated quantity)

---

## 🔍 Test Data (Product X)

Each student must select a keyword based on:

👉 `MSSV % 5`

| Value | Product Keyword |
| ----- | --------------- |
| 0     | SSD 500GB       |
| 1     | NVMe            |
| 2     | USB             |
| 3     | Tablet          |
| 4     | GPU             |

---

## 📄 Deliverables

Students must submit a report including:

1. **Test Case Document**

   * Test Case ID
   * Description
   * Preconditions
   * Test Steps
   * Expected Results

2. **Test Data Table**

3. **Test Scripts**

   * Source code (e.g., Selenium Java/Python)

4. **Execution Evidence**

   * Screenshots / logs

5. **Test Report**

   * Test Results (Pass/Fail)
   * Bug descriptions (if any)
   * Observations and recommendations

---

## 📊 Grading Rubric (10 points)

| Criteria         | Description                                | Score |
| ---------------- | ------------------------------------------ | ----- |
| Test Case Design | Completeness, correctness, coverage        | 2.0   |
| Test Steps       | Clarity, detail, reproducibility           | 1.5   |
| Test Data        | Appropriateness and coverage               | 1.0   |
| Test Scripts     | Correctness, structure, automation quality | 2.0   |
| Execution        | Proper running and evidence                | 1.5   |
| Test Results     | Accurate reporting (Expected vs Actual)    | 1.0   |
| Analysis         | Bug analysis & insights                    | 1.0   |

---

## ⭐ Bonus (Optional – up to +1.0)

* Apply **automation best practices** (Page Object Model, reusable functions)
* Add **negative test cases**
* Perform **cross-browser testing**

---

