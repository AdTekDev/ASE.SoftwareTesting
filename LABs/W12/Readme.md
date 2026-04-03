# W12. UnitTest [2]

---

**Lab Assignment: Traffic Light Controller Testing**  

## **1. Objective**

The objective of this assignment is to:

* Understand state-based systems
* Design effective test cases
* Implement unit tests using **JUnit**
* Validate system behavior under different scenarios

---

## **2. Problem Description**

You are required to implement and test a **Traffic Light Controller** system.

The system simulates a traffic light with three states:

* **RED**
* **YELLOW**
* **GREEN**

---

## **3. Requirements**

Implement a Java class named:

```java
TrafficLightController
```

The class must provide the following methods:

### **1. Time Step Method**

```java
void tick()
```

* Advances the traffic light by one unit of time
* Handles transitions between states based on configured durations

---

### **2. Priority Request Method**

```java
void requestPriority()
```

* Simulates a button press (e.g., pedestrian or emergency vehicle)
* Forces the system to switch from GREEN to YELLOW earlier than scheduled

---

### **3. Force Red Method**

```java
void forceRed(boolean enable)
```

* When enabled, the traffic light must remain **RED at all times**
* When disabled, the system resumes normal operation

---

### **4. Get Full State**

```java
String getState()
```

* Returns detailed information about the current state (color and timer)

---

### **5. Set Durations**

```java
void setDurations(int green, int yellow, int red)
```

* Configures the duration for each light
* All values must be greater than 0

---

### **6. Get Current Color**

```java
LightColor getCurrentColor()
```

* Returns the current color of the traffic light

---

## **4. Testing Requirements**

Students must perform **software testing** on the implemented class.

---

## **Part 1: Test Case Design**

Design comprehensive test cases covering:

### **1. State Transitions**

* RED → GREEN
* GREEN → YELLOW
* YELLOW → RED
* Boundary values (exact duration limits)

---

### **2. Priority Request Behavior**

* Request during GREEN → early transition to YELLOW
* No request → normal timing

---

### **3. Force Red Behavior**

* Enable → always RED
* Disable → resumes normal cycle

---

### **4. Duration Configuration**

* Valid inputs
* Invalid inputs (≤ 0)

---

### **5. State Retrieval**

* Verify correctness of:

  * `getState()`
  * `getCurrentColor()`

---

## **Part 2: Test Implementation**

Students must:

* Use **JUnit 5**
* Implement unit tests for all methods
* Ensure tests are:

  * Independent
  * Repeatable
  * Clear and readable

---

## **Part 3: Deliverables**

Students must submit:

1. **Source Code**

   * `TrafficLightController.java`

2. **Test Code**

   * `TrafficLightControllerTest.java`

3. **Test Case Document**

   * Test case table (Excel or document)

---

Ex.   

```Java
public class TrafficLightController {

    public enum LightColor {
        RED, YELLOW, GREEN
    }

    private LightColor currentColor = LightColor.RED;

    private int greenDuration = 5;
    private int yellowDuration = 2;
    private int redDuration = 5;

    private int timer = 0;

    private boolean forceRed = false;
    private boolean priorityRequested = false;

    // 1. Increase one time step
    public void tick() {
        if (forceRed) {
            currentColor = LightColor.RED;
            timer = 0;
            return;
        }

        timer++;

        switch (currentColor) {
            case GREEN:
                if (priorityRequested || timer >= greenDuration) {
                    currentColor = LightColor.YELLOW;
                    timer = 0;
                    priorityRequested = false;
                }
                break;

            case YELLOW:
                if (timer >= yellowDuration) {
                    currentColor = LightColor.RED;
                    timer = 0;
                }
                break;

            case RED:
                if (timer >= redDuration) {
                    currentColor = LightColor.GREEN;
                    timer = 0;
                }
                break;
        }
    }

    // 2. Button for priority (e.g., pedestrian/emergency)
    public void requestPriority() {
        priorityRequested = true;
    }

    // 3. Force always RED
    public void forceRed(boolean enable) {
        this.forceRed = enable;
        if (enable) {
            currentColor = LightColor.RED;
            timer = 0;
        }
    }

    // 4. Get current state (full info)
    public String getState() {
        return "Color=" + currentColor + ", Timer=" + timer;
    }

    // 5. Set durations
    public void setDurations(int green, int yellow, int red) {
        if (green <= 0 || yellow <= 0 || red <= 0) {
            throw new IllegalArgumentException("Durations must be > 0");
        }
        this.greenDuration = green;
        this.yellowDuration = yellow;
        this.redDuration = red;
    }

    // 6. Get current color only
    public LightColor getCurrentColor() {
        return currentColor;
    }
}
```

Test.  
```Java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrafficLightControllerTest {

    @Test
    void testInitialState() {
        TrafficLightController tl = new TrafficLightController();
        assertEquals(TrafficLightController.LightColor.RED, tl.getCurrentColor());
    }

    @Test
    void testRedToGreenTransition() {
        TrafficLightController tl = new TrafficLightController();
        tl.setDurations(5, 2, 3);

        for (int i = 0; i < 3; i++) {
            tl.tick();
        }

        assertEquals(TrafficLightController.LightColor.GREEN, tl.getCurrentColor());
    }

    @Test
    void testPriorityRequest() {
        TrafficLightController tl = new TrafficLightController();
        tl.setDurations(5, 2, 3);

        // Move to GREEN first
        for (int i = 0; i < 3; i++) tl.tick();

        tl.requestPriority();
        tl.tick();

        assertEquals(TrafficLightController.LightColor.YELLOW, tl.getCurrentColor());
    }

    @Test
    void testForceRed() {
        TrafficLightController tl = new TrafficLightController();

        tl.forceRed(true);
        tl.tick();

        assertEquals(TrafficLightController.LightColor.RED, tl.getCurrentColor());
    }

    @Test
    void testInvalidDuration() {
        TrafficLightController tl = new TrafficLightController();

        assertThrows(IllegalArgumentException.class, () -> {
            tl.setDurations(0, 2, 3);
        });
    }
}
```
