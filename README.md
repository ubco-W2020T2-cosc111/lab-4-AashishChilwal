# Lab 4

## Expectations

We are expecting you to commit your work often with useful commit messages.
This is helpful for you so that there are regular commits that demonstrate your progress. 
In case you forget to push your final commits before the deadline, at least you will get partial marks.

This means that you should commit and push your changes to the repository at least **FIVE** times as you work this lab (more is recommended).
Repositories that have very few commits will be flagged for careful scrutiny and review, and you will **definitely** lose marks for this! 

## Q1: [6 marks] Wind Chill Index

**Create a program that accepts temperature and wind chill and outputs the wind chill index.**

The evaluation of the cold of our environment relies on several elements such as relative humidity, speed of wind, and sunshine. 

To calculate the wind-chill temperature using wind and temperature, the formula below is used:

$$T_{wc} = 35.74 + 0.6215 \cdot T_a - 35.75 \cdot v^{0.16} + 0.4275 \cdot T_a \cdot v^{0.16}$$

Here, $v$ is the wind speed measured in miles per hour (mph) and $T_a$ is the exterior temperature measured in degrees Fahrenheit.

Write a Java program that takes user input for wind speed of 2 or greater and temperature which is between -58 degrees F and 41 degrees F and then calculates and prints the wind-chill temperature.
Assume the user will always enter a valid value, i.e. within the correct range.

*Hint: You can use Math.pow (base value, power value).*

### Sample run:

```
Enter the temperature in Fahrenheit between -58 F and 41 F: 33
Enter the wind speed miles per hour (must be greater than or equal to 2): 5
The wind chill index is 28.2504931
```

## Q2: [6 marks] Parsing Decimals

Write a program that takes a real number as a user input and then prints the digits before and after the decimal point separately.

### Sample run:

```
Enter a real number: 2.5
Integer part: 2
Fraction part: 0.5
```

## Q3: [6 marks] Summing Digits

Write a program which asks user to input an integer number between 0 and 999 (inclusive) and then prints the sum of all the digits of that integer number. 
For example, for an integer number 346, the sum should be 3 + 4 + 6 = 13.
Hint: You can use “%” and “/” operators to extracts digits of that integer. For example, 346 % 10 = 6 and 346 / 10 = 34.

### Sample run:

```
Enter an integer between 0 and 999 inclusive: 956
The sum of all digits in 956 is 20
```

## Q4: [6 marks] Operators

Write a program that takes a number as an input from the user and then perform at least six operations on the given number using following operators:

- Arithmetic operators (use 2) 
- Augmented assignment operator (use 2) 
- Increment and decrement operators (use one prefix and one postfix) 

Your program should show sample of using the selected operators and does not have to be a real world problem. Also, please **add comments** explaining how your operators work.

## Q5: [6 marks] Using random numbers

Write a program which generates and prints a random valid license plate number. In order to be valid the license plate should have three randomly generated letters from ‘A’ to ‘Z’ , followed by four randomly generated digits from 0 to 9.

### Sample run:

```
A random vehicle plate number: TFW4387
```
## Submission Instructions 

For this Lab, you need to do the following: 

1. Create one `.java` file for each of the questions in this lab (`Q1.java`, `Q2.java`, `Q3.java`, etc...) 
1. Answer all the questions in the appropriate java file.
1. Link your Java files in this README file (please change the links below if your file names are different).
1. Submit your repo URL to Canvas before the deadline (we will mark the last commit before the deadline)

## Grading area

### Link to files

You do not have to do anything in this section.

[Q1 Java file](./Q1.java)

[Q2 Java file](./Q2.java)

[Q3 Java file](./Q3.java)

[Q4 Java file](./Q4.java)

[Q5 Java file](./Q5.java)

Remember to commit all your changes and to submit the link to this repository on Canvas.