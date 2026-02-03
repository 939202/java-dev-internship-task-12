# 📘 Task 12 – Serialization & Deserialization in Java

## 🧑‍💻 Java Developer Internship – Object Persistence

---

## 📌 Overview

This task demonstrates **Serialization and Deserialization in Java**, which is a mechanism used to **convert an object into a byte stream** for storage or transmission and later **reconstruct the object back** from that stream.

Object persistence is widely used in real-world applications such as **saving user sessions, caching objects, file storage, and data transfer**.

---

## 🎯 Objectives

* Understand Java Serialization API
* Persist object state into a file
* Restore object state from a file
* Learn the importance of `serialVersionUID`
* Handle sensitive data using `transient`
* Handle runtime exceptions properly

---

## 🛠 Tools & Technologies Used

* **Language:** Java
* **IDE:** IntelliJ IDEA / Eclipse
* **Concepts:**

  * Serialization
  * Deserialization
  * Object Persistence
  * Exception Handling

---

## 📁 Project Folder Structure

```
Task-12-Serialization-Deserialization/
│
├── src/
│   └── com/
│       └── serialization/
│           ├── Student.java
│           ├── SerializeStudent.java
│           └── DeserializeStudent.java
│
├── data/
│   └── student.ser
├── README.md
└── .gitignore
```

---

## 📄 Description of Files

### 🔹 `Student.java`

* Implements `Serializable`
* Contains student details
* Includes `serialVersionUID`
* Uses `transient` keyword for sensitive data (`password`)

### 🔹 `SerializeStudent.java`

* Creates a `Student` object
* Writes the object into a file (`student.ser`)
* Uses `ObjectOutputStream`

### 🔹 `DeserializeStudent.java`

* Reads the serialized file
* Restores the `Student` object
* Uses `ObjectInputStream`
* Handles `ClassNotFoundException`

### 🔹 `student.ser`

* Serialized file that stores object data in byte format

---

## ▶️ How to Run the Project

### Step 1: Compile the Java Files

```bash
javac src/com/serialization/*.java
```

### Step 2: Serialize the Object

```bash
java src.com.serialization.SerializeStudent
```

### Step 3: Deserialize the Object

```bash
java src.com.serialization.DeserializeStudent
```

---

## 🧪 Sample Output

```
Student object deserialized successfully!
Student {ID=101, Name='Pavan Teja', Course='Data Science', Password='null'}
```

👉 The password is `null` because it is marked as **transient** and is not serialized.

---

## 🔐 Why `serialVersionUID` is Important

* Ensures compatibility between serialized and deserialized objects
* Prevents `InvalidClassException`
* Helps during class version changes

---

## 🔒 Why `transient` Keyword is Used

* Prevents sensitive information from being serialized
* Enhances security
* Commonly used for passwords and confidential data

---

## 🌍 Real-World Use Case

* Saving user session data
* Storing application state
* Caching objects
* Transferring objects over a network
* Backup and restore systems

---

## ❓ Interview Questions Covered

* What is serialization?
* Why is `transient` used?
* What happens if `serialVersionUID` mismatches?
* Is Java serialization secure?
* What are alternatives to serialization?

---

## ✅ Task Status

✔ Task Completed Successfully
✔ All deliverables included
✔ Code tested and verified

---

## 🔗 Submission

This project is submitted as part of **Java Developer Internship – Task 12**.
