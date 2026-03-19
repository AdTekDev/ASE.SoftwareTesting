# W06. Automation Tools 

## UI Tools
- OpenText Functional Testing (QTP, HP UFT) - https://www.opentext.com/products/functional-testing
- TestComplete - https://smartbear.com/product/testcomplete/
- Raronex Studio - https://www.ranorex.com/
- Selenium IDE - https://www.selenium.dev/selenium-ide/
- Katalon (https://chromewebstore.google.com/detail/katalon-recorder-selenium/ljdobmomdgdljniojadhoplhkpialdid  , https://katalon.com/download )

## **Test Case Design and Test Automation for E-commerce Websites**

### **Objective**

Students will practice:

* Writing structured **test cases**
* Designing **test scenarios**
* Recording and executing **automated test scripts**
* Applying testing on real-world e-commerce platforms

---

### **Target Websites**

Apply all tasks on the following platforms:

* Fahasa
* Tiki
* Lazada

---

## **Part 1: Test Case Design**

### **Task 1: Search and Add a Specific Book**

Design detailed test cases for the following scenario:

> Search for a book titled **"Tỉnh Thức"** and add it to the shopping cart.

#### **Requirements**

* Write test cases including:

  * Test Case ID
  * Title
  * Preconditions
  * Test Steps
  * Expected Results
  * Test Data
* Consider both **positive and negative cases**, such as:

  * Exact match search
  * Case-insensitive search
  * No result found
  * Network delay or slow response
* Validate:

  * Correct search results
  * Correct book selected
  * Successful add-to-cart action

---

### **Task 2: Find and Add the Highest Discount Book**

Design test cases for:

> Find the book with the **highest discount percentage (%)** and add it to the cart.

#### **Requirements**

* Clearly define:

  * How to identify the “highest discount”
  * Sorting/filtering behavior
* Include edge cases:

  * Multiple books with the same highest discount
  * No discount available
  * Incorrect or missing discount labels
* Validate:

  * Correct sorting/filter logic
  * Correct item selected
  * Add-to-cart functionality

---

## **Part 2: Test Automation**

### **Task 3: Record and Execute Automated Test Scripts**

Use automation tools such as:

* Selenium
  <img width="1809" height="983" alt="image" src="https://github.com/user-attachments/assets/fad30d93-4b37-4b74-b87e-85cd14c8f887" />

  <img width="1220" height="1028" alt="image" src="https://github.com/user-attachments/assets/db7df7c9-4893-47c2-8a76-ab3388190469" />

* Katalon
  <img width="1600" height="1020" alt="image" src="https://github.com/user-attachments/assets/06305d94-6f3c-4573-8e17-df41a23924dd" />


#### **Requirements**

1. Record or write automation scripts for:

   * Scenario 1 (Search “Tỉnh Thức” and add to cart)
   * Scenario 2 (Find highest discount book and add to cart)

2. Scripts must:

   * Work on at least **one platform**
   * Be reusable for all three platforms (bonus)
   * Include assertions (validation checkpoints)

3. Capture:

   * Screenshots or logs
   * Execution results

---

## **Part 3: Comparison & Analysis**

Compare the three platforms:

* UI/UX differences in search functionality
* Discount display and filtering
* Ease of automation (DOM structure, stability)

---

## **Deliverables**

* Test Case Document (Excel / TestRail / Jira format)
* Automation scripts (source code)
* Execution report (with screenshots/logs)
* Short comparison report (1–2 pages)

---

