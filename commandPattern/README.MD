# 🏠 Smart Home Automation (Command Pattern in Java)

---

## 📌 Problem Overview  
This project demonstrates a **Smart Home Automation System** implemented in **Java** using the **Command Pattern**.  

The system allows a **central hub (`RemoteControl`)** to send high-level commands such as `Turn On`, `Turn Off`, or device-specific actions to various smart devices (`SmartLight`, `SmartTV`, `SmartBlinds`).  

Key goals of the system:  
- Unified control for multiple devices with different functionalities.  
- New devices can be added without modifying existing code.  
- Central hub does not need to understand device internals—it only sends commands.  

---

## 📊 UML Diagram  

Here is the UML diagram of the system:  

![UML Diagram](https://github.com/engr-julia/Repo_CommandPatterns/blob/master/commandPattern/UML%20.jpeg?raw=true)  

---

## 🛠️ Design Pattern Components  

- **Command Interface (`Command`)**  
  - Declares the `execute()` method.  

- **Concrete Commands (`TurnOnCommand`, `TurnOffCommand`)**  
  - Call the appropriate action on a `Device`.  

- **Receiver (`SmartLight`, `SmartTV`, `SmartBlinds`)**  
  - The actual devices that perform the actions (`turnOn()`, `turnOff()`).  

- **Invoker (`RemoteControl`)**  
  - Executes commands without knowing device details.  

- **Client (`Main`)**  
  - Configures commands and assigns them to the `RemoteControl`.  

---

## 🚀 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/engr-julia/Repo_CommandPatterns.git
   cd Repo_CommandPatterns/src
