## 🛍️ **Amazon E-commerce Manual Testing**

### 🔧 Automation Strategy & Future Plans

To enhance test coverage and efficiency, this repository includes a foundational automation script written in  **Java using Selenium WebDriver** . The current automation test, `AmazonSearchTest.java`, simulates a real user searching for a product ("wireless mouse") and verifies that the results match expectations. This helps ensure the search functionality is not only working but returns relevant items.

### ✅ Current Automation Included:

* `AmazonSearchTest.java` in `/automation-examples/`
  * Verifies product search
  * Checks browser title for keyword match

### 🧩 Future Automation Plans:

* Automate  **cart management** : validate cart updates when adding/removing products
* Include **end-to-end checkout flow** automation using mock credentials
* Implement cross-browser testing using Selenium Grid or BrowserStack
* Add automated test execution with CI/CD tools (e.g., GitHub Actions, Jenkins)

### 📌 Note for Contributors:

You can run the automation using:

javac AmazonSearchTest.java
java AmazonSearchTest

Make sure to [install ChromeDriver]() and update the file path in the script. The automation examples in `/automation-examples/` serve as a starting point to expand into full regression suites.
