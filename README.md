# Train-Consist-Management-App

# 🚆 Train Consist Management App – UC6

## Map Bogie to Capacity using HashMap

---

## 📌 Overview

This use case demonstrates how a railway system can associate each bogie with its **seating or load capacity** using Java’s **HashMap**.

Unlike previous implementations that only stored bogie names, this approach enables **real-world data mapping**, allowing the system to manage operational attributes such as seating capacity and load limits.

---

## 🎯 Objective

To map each bogie to its corresponding capacity using a **key–value structure**.

---

## 🧠 Concepts Used

* **HashMap**
  A collection that stores data in **key–value pairs** for fast access.

* **Map Interface**
  Represents a mapping between unique keys and values.

* **put() Method**
  Adds a key–value pair into the map.

* **entrySet() Method**
  Used to iterate through both keys and values.

* **Key–Value Mapping**
  Example: `"Sleeper" → 72 seats`

---

## ⚙️ Implementation Details

* A `HashMap<String, Integer>` is used:

    * **Key** → Bogie Name (String)
    * **Value** → Capacity (Integer)

* Sample Bogies:

    * Sleeper → 72 seats
    * AC Chair → 50 seats
    * First Class → 24 seats

---

## 💻 Sample Code

```java
import java.util.HashMap;
import java.util.Map;

public class UseCase6TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        // Create HashMap
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Insert values
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 50);
        bogieCapacity.put("First Class", 24);

        // Display mapping
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " seats");
        }
    }
}
```

---

## 🖥️ Sample Output

```
=== Train Consist Management App ===

Bogie Capacity Details:

Sleeper → 72 seats
AC Chair → 50 seats
First Class → 24 seats
```

---

## ✅ Key Benefits

* Enables **real-world data modeling**
* Allows **fast lookup** of bogie capacity
* Supports **analytics & validation**
* Introduces **Map-based data structures**
* Foundation for future enhancements like:

    * Capacity validation
    * Booking systems
    * Load management

---

## ⚠️ Limitations

* Does not maintain insertion order (use LinkedHashMap if needed)
* Only stores basic capacity (no advanced attributes yet)

---

## 🚀 Future Enhancements

* Add **goods bogie load capacity**
* Introduce **safety constraints**
* Use **LinkedHashMap** for ordered output
* Extend to **object-based mapping (Bogie class)**

---

## 📚 Conclusion

This use case transitions the system from simple collections to **structured data mapping**, making it closer to real-world railway management systems.

---
