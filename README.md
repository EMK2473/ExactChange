# Exact Change
![Github license](https://img.shields.io/badge/mit-blue.svg)
 
 Licensing: [mit](https://choosealicense.com/licenses/mit/)

## Table of Contents
- [Description](#description)
- [Installation Requirements](#installation-requirements)
- [Application Usage](#application-usage)
- [License](#licensing-information)
- [Contributions](#contributions)
- [Tests Commands](#tests-commands)
- [Questions](#questions)
## Description
OOP Lab Module: A Java program that calculates the exact change for a given amount of cents using the largest denominations first (dollars, quarters, dimes, nickels, and pennies). It outputs the quantity of each denomination needed to make the exact change.

## Installation Requirements
Ensure you have Java Development Kit (JDK) installed on your system. You can download it from [Oracle](https://www.oracle.com/java/technologies/downloads/) or use a package manager like Homebrew for macOS or apt-get for Linux. 

Using terminal commands: 

- Clone or download the repository: 
```Java 
- git clone https://github.com/EMK2473/ExactChange.git 
```

- Navigate to the project directory: 
```Java
- cd ExactChange 
```
- Compile the ExactChange.java file: 
```Java
- javac ExactChange.java 
```
- Run the program: 
```Java
- java ExactChange
```  


## Application Usage
Once the program is running, it will prompt you to enter an amount in cents. The program calculates and displays the exact change using the following denominations:  
```Java
Dollars (100 cents) 
Quarters (25 cents) 
Dimes (10 cents) 
Nickels (5 cents) 
Pennies (1 cent) 
```

You can easily modify the program to replace any specified currencies by updating the following lines:
```Java
int[] values = {100, 25, 10, 5, 1};
String[] change = {"Dollar", "Quarter", "Dime", "Nickel", "Penny"};
```

Example: If you input:
```Java
287
``` 
The output will be:
```Java
2 Dollars 
3 Quarters 
1 Dime 
0 Nickels 
2 Pennies 
```
If you input:
```Java
99
``` 
The output will be:
```Java 
0 Dollars 
3 Quarters 
2 Dimes 
0 Nickels 
4 Pennies 
```
If you input:
```Java
0
```
The output will be:
```Java
No change
```
## Contributions
Eric Keeton

## Test Commands
You can test the program by entering various amounts to verify that the change is calculated correctly.

## Questions
For Questions, contact me at emk2473@gmail.com or visit My Github: [EMK2473](https://github.com/EMK2473)