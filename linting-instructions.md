# Linting Java Code in VSCode

This adds linting to java files using Google's default checkstyle/code style.

## Install

Install https://marketplace.visualstudio.com/items?itemName=shengchen.vscode-checkstyle extension to VScode.

## Usage

On files you wish to style check.

1. Ctrl+Shift+P (Action quick switcher)
2. Select the "Checkstyle: Check Code with Checkstyle" option.

# Errors

### JDK not found Error

If Checkstyle cannot find your installed JDK ensure you have your $JAVA_HOME environment variable set.

Follow [these instructions](https://javatutorial.net/set-java-home-windows-10) to set your JAVA_HOME environment variable on Windows 10.

After close and re-open VSCode to load the new environment variables.

