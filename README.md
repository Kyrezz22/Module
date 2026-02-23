# Bug App Template

A simple Android application template with a login system and a dashboard for managing various actions.

## Features
- **Secure Login**: Access control with Author Name and multiple password support.
- **Dashboard**: Input fields for target identification and buttons for various management actions.
- **Customizable**: Easy to modify for educational or administrative purposes.

## How to Configure

### 1. Setting the Author and Passwords
To change the login credentials, navigate to:
`app/src/main/java/com/example/bugapp/LoginActivity.java`

Find the following lines and update them:
```java
// Hardcoded credentials for demonstration
private final String REQUIRED_AUTHOR = "Java_nih_deks";

// List of allowed passwords
private final List<String> ALLOWED_PASSWORDS = Arrays.asList(
    "pass1",
    "pass2",
    "admin123"
);
```
You can add as many passwords as you want to the list.

### 2. Building the App
To build the application, use Gradle:
```bash
./gradlew assembleDebug
```
The generated APK will be in `app/build/outputs/apk/debug/`.

## Usage
1. Open the app.
2. Enter the Author Name: `Java_nih_deks`.
3. Enter one of your configured passwords.
4. Once logged in, enter the target number or email in the input field.
5. Click on the desired action button (Bug WA, Bug Group, Bug Email).

*Note: This application is a UI template and does not contain any functional "bug" or "malicious" code. It is intended for educational purposes.*

## Credits
Author: Java_nih_deks
