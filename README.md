# WordPress Capstone Project – Selenium | TestNG | Cucumber | POM

Automation framework using Selenium WebDriver with Java, TestNG, Cucumber (BDD), and Page Object Model (POM).

Validates core navigation and image search functionality on **WordPress.org**.

---

## Project Objective

* Implement a maintainable automation framework
* Use **Maven**, **POM**, **Cucumber**, **TestNG**
* Maintain **Object Repository** for all pages
* Separate **Base Class** for WebDriver setup and teardown

---

## Scenario Covered

1. Launch WordPress website & verify title
2. Hover on **Download & Extend → Get WordPress**
3. Verify heading text “Get WordPress”
4. Navigate to **Community → Photo Directory**
5. Search for an image and verify images are displayed

---

## Project Structure

```
src/test/java
 ├─ base/BaseTest.java
 ├─ pages/HomePage.java, GetWordPressPage.java, PhotoDirectoryPage.java
 ├─ stepdefinations/WordPressSteps.java
 └─ runner/TestRunner.java

src/test/resources/features/wordpress.feature
pom.xml
testng.xml
```

---

## Tools & Technologies

Java | Selenium | TestNG | Cucumber | Maven | IntelliJ IDEA | Chrome

---

## How to Run

1. Clone the repository
2. Checkout branch: **CapstoneProject_5**
3. Open in IntelliJ as a Maven project
4. Run **testng.xml** using TestNG

---

## Author

Capstone automation framework implemented for Selenium with Java training & project Submission.
