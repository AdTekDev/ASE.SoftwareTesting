# W03. Software Quality Factors [2] 

- Factors: Usability, Performance, and Security Testing

---

# 1. Usability Testing

## 1.1 Evaluate the Usability of an LMS Website

Choose an LMS website (for example: Moodle or your university LMS).

### Task

Navigate through the LMS and evaluate the usability of the system.

### Steps

1. Open the LMS homepage.
2. Try to perform the following tasks:

   * Login to the system.
   * Access a course.
   * Find course materials.
   * Submit an assignment (if available).

### Questions

Answer the following questions:

| Question                                               | Answer |
| ------------------------------------------------------ | ------ |
| Is the navigation easy to understand?                  |        |
| How many steps are required to reach course materials? |        |
| Are icons and buttons clear?                           |        |
| Is the layout user-friendly?                           |        |

### Discussion

Identify at least:

* **2 usability strengths**
* **2 usability weaknesses**

---

## 1.2 Evaluate Car Booking Apps

Analyze the usability of ride-hailing apps such as:

* Grab
* Xanh SM
* Be

### Task

Evaluate how convenient these apps are for:

1. Booking a ride
2. Tracking a ride

### Questions

Fill in the table:

| Feature           | Advantages | Disadvantages |
| ----------------- | ---------- | ------------- |
| Booking a ride    |            |               |
| Tracking the ride |            |               |
| Payment           |            |               |

### Discussion

* What makes these apps easy to use?
* What improvements would you suggest?

---

# 2. Performance Testing

Use **Browser Developer Tools** to analyze website performance.

### Steps

1. Open a website in Chrome.
2. Press **F12**.
3. Select the **Network** tab.
4. Reload the page.

---

## 2.1 Running Time

Observe the total loading time of the page.

Record the result:

| Metric               | Value |
| -------------------- | ----- |
| Total Page Load Time |       |
| DOM Content Loaded   |       |
| Finish Time          |       |

### Question

* Is the page loading time acceptable? Why?

---

## 2.2 Loading and Response Time

Analyze the response time of different resources.

Identify the following:

| Resource | Type | Response Time |
| -------- | ---- | ------------- |
|          |      |               |
|          |      |               |
|          |      |               |

### Questions

* Which resource takes the longest time?
* What might cause the delay?

---

## 2.3 Resource Size and Types

Analyze the resources downloaded by the browser.

Fill in the table:

| Resource Type | Number of Files | Total Size |
| ------------- | --------------- | ---------- |
| HTML          |                 |            |
| CSS           |                 |            |
| JavaScript    |                 |            |
| Images        |                 |            |

### Questions

* Which type of resource consumes the most bandwidth?
* How could performance be improved?

---

# 3. Security Testing

## 3.1 Identify OWASP Top 10 Risks

Study common vulnerabilities from the
OWASP **Top 10** list.

Examples include:

* Broken Authentication
* Security Misconfiguration
* Injection
* Cross-Site Scripting

### Task

Explain **two vulnerabilities** from the OWASP Top 10.

---

## 3.2 Password Policy

Analyze password rules used by modern systems.

### Task

Determine whether the following passwords are secure.

| Password  | Secure or Not | Reason |
| --------- | ------------- | ------ |
| 123456    |               |        |
| password  |               |        |
| Test123   |               |        |
| T3st@2025 |               |        |

### Question

What rules should a strong password follow?

---

## 3.3 SQL Injection

SQL Injection is a common vulnerability in web applications.

Example malicious input:

```
' OR '1'='1
```

### Task

Explain:

* What SQL Injection is
* How it can affect login systems

### Question

How can developers prevent SQL Injection?

---

## 3.4 JSON Web Token (JWT)

Many modern web applications use
JSON Web Token for authentication.

### Task

Answer the following questions:

1. What is a JWT?
2. What information does a JWT contain?
3. Why should JWT tokens be protected?

---

## 3.5 Encryption

Encryption protects sensitive data during transmission.

Example protocols:

* Transport Layer Security
* HTTPS

### Task

Explain:

1. Why encryption is important for web applications.
2. What might happen if a website does not use HTTPS.

---


---

If you want, I can also help create:

* **A grading rubric for this 60-minute lab**
* **A worksheet version for students**
* **A slide deck to teach this lab in class**.
