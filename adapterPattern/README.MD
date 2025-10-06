# Plugging Devices into Power Outlets

This project demonstrates the **Adapter Design Pattern** by simulating the plugging of different devices into a standard power outlet. Since each device has unique power requirements and interfaces, adapters are created to allow them to connect safely and uniformly through a common interface.

---

## 📌 Problem Statement
Electronic devices such as laptops, refrigerators, and smartphones have different plug types, voltage, and amperage requirements. To ensure **compatibility** and **safety**, we need a way to standardize how these devices connect to a power outlet without modifying the device itself.

---

## 🎯 Solution
We use the **Adapter Design Pattern**, where each device has its own adapter that allows it to connect to a **PowerOutlet** interface.  

- **Target (Interface):**
  - `PowerOutlet` → defines the common method `plugIn()`.

- **Adaptee (Existing Objects):**
  - `Laptop` → method: `charge()`
  - `Refrigerator` → method: `startCooling()`
  - `SmartphoneCharger` → method: `chargePhone()`

- **Adapter (Bridge between Target & Adaptee):**
  - `LaptopAdapter` → translates `plugIn()` → `charge()`
  - `RefrigeratorAdapter` → translates `plugIn()` → `startCooling()`
  - `SmartphoneAdapter` → translates `plugIn()` → `chargePhone()`

- **Client:**
  - `Main` → demonstrates the use of adapters to connect devices to the `PowerOutlet`.

---

## 📂 UML Class Diagram
The following UML diagram shows the relationships between the **Target**, **Adapters**, **Adaptees**, and the **Client**:

![UML Diagram](AdapterPatternUML.pdf)

> The diagram includes:
> - **PowerOutlet** interface with `plugIn()`.
> - **Adapters** (`LaptopAdapter`, `RefrigeratorAdapter`, `SmartphoneAdapter`) implementing the interface.
> - **Adaptees** (`Laptop`, `Refrigerator`, `SmartphoneCharger`) with their specific methods.
> - **Client (Main)** which uses the adapters through the `PowerOutlet` interface.

---
