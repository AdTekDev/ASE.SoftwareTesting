# W08. Automation Tools [2]


## Selenium - Java 

  <img width="1273" height="760" alt="image" src="https://github.com/user-attachments/assets/3a52c9a4-eb89-4611-ba7d-05fda8e973da" />



## 🎯 Objective

In this lab, students will learn how to:

* Create a Maven project in Eclipse
* Add Selenium and JUnit dependencies
* Write and execute a basic Selenium test
* Validate results using assertions

---

## 🧰 Prerequisites

* Java JDK (version 8 or higher)
* Eclipse IDE installed
* Google Chrome browser installed
* Internet connection

---

## 📦 Step 1: Create a Maven Project

1. Open Eclipse
2. Go to **File → New → Maven Project**
3. Check **Create a simple project (skip archetype selection)**
4. Click **Next**
5. Enter:

   * Group Id: `com.example`
   * Artifact Id: `selenium-test`
6. Click **Finish**

---

## 📁 Step 2: Project Structure

After creation, your project should look like:

```
selenium-test/
 ├── src/main/java
 ├── src/test/java
 ├── pom.xml
```

---

## 🔧 Step 3: Add Dependencies

Open `pom.xml` and add the following:

```xml
<dependencies>
    <!-- Selenium -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.21.0</version>
    </dependency>

    <!-- WebDriver Manager -->
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.8.0</version>
    </dependency>

    <!-- JUnit 5 -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.10.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

---

## 🔄 Step 4: Update Maven Project

* Right-click the project
  → **Maven → Update Project**

---

## 🧪 Step 5: Create a Test Class

1. Right-click `src/test/java`
2. Select **New → Class**
3. Name the class: `Test01`

---

## 💻 Step 6: Write Selenium Test Code

```java
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test01 {

    @Test
    public void testOpenCourseGitHub() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/AdTekDev/ASE.SoftwareTesting");

        // Assertion: check title contains "ASE.SoftwareTesting"
        assertTrue(driver.getTitle().contains("ASE.SoftwareTesting"));

        driver.quit();
    }
}
```

---

## ▶️ Step 7: Run the Test

* Right-click the test file
  → **Run As → JUnit Test**

---

## ✅ Expected Result

* Chrome browser opens automatically
* The target website loads successfully
* The test passes if the title contains `"ASE.SoftwareTesting"`

---
