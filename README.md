# 🧠 Palindrome Checker App

## 📌 Project Overview

The **Palindrome Checker App** is a simple web application that allows users to check whether a given word, phrase, or number is a **palindrome**. The application takes user input, processes the text using JavaScript, and determines whether the input reads the same forward and backward.

This project was built as part of a learning exercise to practice **JavaScript string manipulation, DOM interaction, and basic web development concepts**.

---

# 🔍 What is a Palindrome?

A **palindrome** is a word, phrase, number, or sequence of characters that reads the same both **forward and backward**.

### Examples of Palindromes

| Input   | Result             |
| ------- | ------------------ |
| racecar | ✅ Palindrome       |
| madam   | ✅ Palindrome       |
| level   | ✅ Palindrome       |
| hello   | ❌ Not a palindrome |
| world   | ❌ Not a palindrome |

Palindromes can also exist in **sentences** when spaces and punctuation are ignored.

Example:

```
A man a plan a canal Panama
```

---

# ✨ Features

* 📝 Accepts user input (words or phrases)
* ⚡ Instant palindrome checking
* 🔄 String reversal logic implemented in JavaScript
* 📊 Displays clear result messages
* 🎨 Simple and clean user interface
* 👨‍💻 Beginner-friendly implementation

---

# 🛠️ Technologies Used

This project is built using fundamental web technologies:

### 1. HTML5

Used to create the **structure of the application**, including:

* Input field
* Button to trigger the check
* Section to display results

### 2. CSS3

Used for **styling and layout**, including:

* Page layout
* Button styling
* Text formatting
* Simple UI design

### 3. JavaScript

Handles the **core logic of the application**, including:

* Reading user input
* Processing and cleaning the input
* Reversing the string
* Comparing original and reversed strings
* Displaying the result on the page

---

# 📁 Project Structure

```
PalindroneCheckerApp/
│
├── index.html      # Main HTML structure of the app
├── styles.css      # CSS styling for the interface
├── script.js       # JavaScript logic for palindrome checking
└── README.md       # Project documentation
```

---

# ⚙️ How the Palindrome Algorithm Works

The palindrome check follows these steps:

### Step 1: Get User Input

The program reads the text entered by the user in the input field.

### Step 2: Normalize the Text

The input is processed to ensure consistent comparison:

* Convert text to lowercase
* Remove spaces or special characters (optional improvement)

Example:

```
Input: RaceCar
Normalized: racecar
```

### Step 3: Reverse the String

The program reverses the string using JavaScript methods.

Example:

```
Original: racecar
Reversed: racecar
```

### Step 4: Compare Both Strings

If:

```
original === reversed
```

Then the word is a **palindrome**.

Otherwise, it is **not a palindrome**.

---

# ▶️ How to Run the Project

## 1️⃣ Clone the Repository

```bash
git clone https://github.com/devcrazy2812/PalindroneCheckerApp.git
```

## 2️⃣ Navigate to the Project Folder

```bash
cd PalindroneCheckerApp
```

## 3️⃣ Open the Application

Simply open the `index.html` file in your web browser.

Example:

```
Right Click → Open With → Browser
```

---

# 🧪 Example Usage

### Example 1

Input:

```
racecar
```

Output:

```
✅ racecar is a palindrome
```

---

### Example 2

Input:

```
hello
```

Output:

```
❌ hello is not a palindrome
```

---

# 🎯 Learning Objectives

This project was built to practice and understand:

* JavaScript **string manipulation**
* **DOM manipulation**
* Handling **user input**
* Writing **basic algorithms**
* Structuring a small **frontend project**
* Using **Git and GitHub for version control**

---

# 🚀 Possible Future Improvements

Some features that could improve the project:

* 🔤 Ignore punctuation and special characters
* 🧾 Support full sentences
* 🎨 Improve UI with modern styling
* 📱 Add responsive design
* ⚡ Add animations for results
* 🌐 Deploy the app online

---

# 🌍 Live Demo (Optional)

If deployed in the future, the live application link can be added here.

Example:

```
https://your-live-app-link.com
```

---

# 👨‍💻 Author

**GitHub Profile**

https://github.com/devcrazy2812

---

# ⭐ Support

If you found this project helpful or interesting:

⭐ Star the repository
🍴 Fork the project
🧠 Use it for learning or improvements
