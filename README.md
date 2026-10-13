# Unit Converter - Android App

A clean and intuitive Android application built with Kotlin and XML that converts common units of measurement including distance and weight[cite: 1]. This project demonstrates clean code practices by implementing reusable conversion logic and using standard Android UI components like `Spinner` and `EditText`[cite: 1].

---

## 📌 Features
* **Multiple Unit Conversions**:
  * Kilometers to Miles[cite: 1]
  * Kilograms to Pounds[cite: 1]
  * Meters to Feet[cite: 1]
* **Dynamic Selection**: Dropdown menu (`Spinner`) for quick switching between conversion types[cite: 1].
* **Reusable Logic**: Centralized conversion function to handle formula logic efficiently[cite: 1].
* **Input Validation**: Displays a prompt if the user leaves the input field blank.

---

## 🛠️ Tools & Technologies
* **IDE**: Android Studio[cite: 1]
* **Language**: Kotlin[cite: 1]
* **UI Design**: XML (LinearLayout, Spinner, EditText, Button, TextView)[cite: 1]

---

## 📂 Project Structure
app/src/main/
├── java/com/example/unitconverter/
│   └── MainActivity.kt
├── res/layout/
│   └── activity_main.xml
└── AndroidManifest.xml

---

```markdown
# Unit Converter - Android App

A clean and intuitive Android application built with Kotlin and XML that converts common units of measurement including distance and weight[cite: 1]. This project demonstrates clean code practices by implementing reusable conversion logic and using standard Android UI components like `Spinner` and `EditText`[cite: 1].

---

## 📌 Features
* **Multiple Unit Conversions**:
  * Kilometers to Miles[cite: 1]
  * Kilograms to Pounds[cite: 1]
  * Meters to Feet[cite: 1]
* **Dynamic Selection**: Dropdown menu (`Spinner`) for quick switching between conversion types[cite: 1].
* **Reusable Logic**: Centralized conversion function to handle formula logic efficiently[cite: 1].
* **Input Validation**: Displays a prompt if the user leaves the input field blank.

---

## 🛠️ Tools & Technologies
* **IDE**: Android Studio[cite: 1]
* **Language**: Kotlin[cite: 1]
* **UI Design**: XML (LinearLayout, Spinner, EditText, Button, TextView)[cite: 1]

---

## 📂 Project Structure


```

app/src/main/
├── java/com/example/unitconverter/
│   └── MainActivity.kt
├── res/layout/
│   └── activity_main.xml
└── AndroidManifest.xml

```

## 🚀 How to Run the App

1. **Clone or Download** the project files to your local machine.
2. Open **Android Studio** and click on `Open an Existing Project`.
3. Navigate to the project directory and open it.
4. Let **Gradle** sync the dependencies.
5. Select an Emulator or connect a physical Android device via USB debugging.
6. Click the **Run** button (`Shift + F10`) to build and deploy the app.

---

## ❓ Interview Questions & Answers

### 1. How would you organize multiple conversion formulas?
Multiple conversion formulas can be organized using a centralized helper function with a `when` expression or by creating a dedicated utility class. This isolates the mathematical formulas from the UI logic, keeping the codebase modular and easy to expand[cite: 1].

### 2. What is a reusable function?
A reusable function is a block of code written once to perform a specific task that can be called multiple times throughout an application with different inputs[cite: 1]. It reduces code duplication, improves readability, and makes maintenance easier[cite: 1].

---

## 📸 Screenshots
*(Insert your project screenshot here)*[cite: 1]

```
