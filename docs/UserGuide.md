# EconoCraft Pro v2.0 
# User Guide

## Introduction

EconoCraft is a single player text adventure game where a player takes on the role of a business owner or manager,
tasked with growing their company from a small startup to a large corporation. The game would simulate real-world
business challenges, including resource management, market analysis, product development, and financial planning to
help students prepare for the future challenges.

## Quick Start

1. Ensure you have Java 11 installed on your computer.
2. Download the latest `econoCraft.jar` from [here](https://github.com/AY2324S2-CS2113-T11-4/tp/releases/download/v2.0/econoCraft.jar).
3. Copy the file to the folder you want to use as the home folder for EconoCraft.
4. Open a terminal and navigate to the folder where `econoCraft.jar` is located.
5. Run the command `java -jar econoCraft.jar` to start the game. The chatbot should start and display the welcome message.
6. Follow the game instructions to start playing.
7. Your game progress will be auto saved in the `data` folder as `PlayerProfile.json`.

## Features 

### Feature - Work
Allows player to work to earn money by playing a small typing game.

Format: `work`

Expected outcome:
```
==============================
Welcome to the Typing Game!
Type the following text as fast as you can:
==============================
==============================
The quick brown fox jumps over the lazy dog.
==============================
==============================
Press ENTER to start
==============================
```
The bot would select one text in text array at random position.
player will be prompted to type the given text as fast as they can. The faster they type, the more money they earn.
 
Examples:
```
Type here: The quick brown fox jumps over the
==============================
Good job! You finished within the time limit!
==============================
==============================
You typed at 77% accuracy in 12.04 seconds!
Great job!
==============================
==============================
You have earned $770
==============================
```

### Feature - Exercise
Allows player to exercise to increase their health.

Format: `exercise`

Expected outcome:
```
==============================
Please choose your mark: X or O
==============================
```
Player would then select which mark they would like to use, the game would start after the selection.

Format: `X` or `O`

Expected outcome:
```
==============================
- - - 
- - - 
- - - 
==============================
==============================
Player O, enter your move (row [1-3] column [1-3]):
==============================
```
Player would then enter the row and column they would like to place their mark. 
The bot would then place the other mark in a random position.

Format: `row column`

Example of usage:`1 1`

Expected outcome:
```
==============================
O - - 
- - - 
- - - 
==============================
==============================
AI's turn!
==============================
==============================
O - - 
- - - 
- - X 
==============================
==============================
Player O, enter your move (row [1-3] column [1-3]):
==============================
```
The game would continue until a player wins or the board is full.

Examples:
```
==============================
O O O 
- X - 
- - X 
==============================
==============================
Siuuuuu, player O wins!
==============================
```
This would increase 10% of the player's health if player wins the game.

### Feature - Rest
Allows player to rest to increase their health. Player would be tasked to answer two True or False question
related to cs2113.

Format: `rest`

Expected outcome:
```
==============================
Welcome to the MCQ Game!
Answer the following questions:
==============================
==============================
As per the textbook, brown-field projects are usually 
harder than green-field projects. True or False?
==============================
==============================
Type T for true and F for false
==============================
```
Player would then enter `T` or `F` to answer the question.

Format: `T` or `F`

Example of usage:`T`

Expected outcome:
```
==============================
Incorrect!
==============================
```
After two questions, the player would be informed of their score.

Examples:
```
You answered 1 questions correctly.
```

This would increase 10% of the player's health if player achieves more than 50% correct answers.

### Feature - Upgrade

Allows player to upgrade their status to access advanced features of the game.
This would require the player to have at least $10000 in their asset account.

The features are:

- Allow player to purchase stock from the stock market
- Allow player to sell stock that they currently possess
- Allow player to manage a company and gain more profit

Format: `upgrade`

Expected outcome:
```
============================================================
You have successfully upgraded your player!
============================================================
```

### Feature - Manage Company

#### Hire Employee
Allows player to hire an employee to help manage the company.
With more employees, the player can earn more profit.

Format: `hire <employee number>`

Example of usage: `hire 2`

Expected outcome:
```
============================================================
2 of employees has been hired.:)
============================================================
```

#### Fire Employee
Allows player to fire employees to reduce the cost of the company.

Format: `fire <employee number>`

Example of usage: `fire 3`

Expected outcome:
```
============================================================
3 of employees has been fired.:(
============================================================
```

#### Adjust Employee Salary
Allows player to adjust the salary of the employees to increase or decrease the cost of the company.

Format: `raise <amount>` or `lower <amount>`

Example of usage: `raise 100`

Expected outcome:
```
============================================================
You have successfully raised the salary of the employees by $100.
============================================================
```

### Feature - Stock

#### Buy Stock

Allows player to buy stock from the virtual stock market.

Format: `stock`

Expected outcome:
```
============================================================
▲                                                        
│                                                        
│                                                        
│                                                        
│                                                        
│                                                        
│                                                        
│                                                        
│                                                        
│     x                                                  
│   xxxxx                                                
│xxxx   xx    xxxxxxxxxxx                                
│         xxxx          xxxxxxx                 xxxxxxxx 
│          x                   xxxxxxxxx     xxxx        
│                                       xxxxxx           
│                                                        
│                                                        
│                                                        
│                                                        
│                                                        
│                                                        
│                                                        
│                                                        
│                                                        
│                                                        
└───────────────────────────────────────────────────────►
============================================================
============================================================
Profit for microsoft in quarter one is similar to quarter two -CNN 
Where is the next step for Microsoft? -Economist 
Not much progress in our R&D department for microsoft so far -User5642 from Twitter 
============================================================
============================================================
Microsoft (Multi-national cooperation) 
============================================================
============================================================
Price per stock : 420
============================================================
How many stock do you want to purchase? Input 0 if you want none
```

Player would enter an integer to indicate the number of stocks to purchase.

```
StockCommand executed
============================================================
```

Player can also type `status` to check the stock that they are currently holding.

```
============================================================
Current Status:
Your name is :xia
occupation :Semi-conductor
current health :100
current asset: 800
Microsoft (Multi-national cooperation) 
 currently share count : 10
============================================================
```

#### Sell Stock

Allow player to sell the stocks they currently possess.

Format: `sellstock`

Expected outcome:

```
The stock price risen by: -2
Your gain in stock for this round is: -20

============================================================
$4180 returned to your account. 
============================================================
```

The system will output the profit earn from selling the stock and 
return the money gained from selling the stock back to your asset account.

### Feature - Check Status

Allows player to check their current status.

Format: `status`

Expected outcome:
```
==============================
Current Status:
Asset: Your name is :zhu
occupation :artificial intelligence
current health :99
current asset: 5770
==============================
```

### Feature - Help

Shows a list of commands that the player can use when player is stuck.

Format: `help`

Expected outcome:
```
============================================================
Enter ur action!
work - to work
rest - to rest
exercise - to exercise
status - to check status
upgrade - to upgrade(!NOTE you need to have at least $100000)
bye - to exit
============================================================
Commands below are only available for advanced players:
============================================================
stock - to purchase stocks from the stock market 
sellstock - to sell all of your stocks 
company - to check company status
hire <number> - to hire employee
fire <number> - to fire employee
raise <number> - to raise salary
lower <number> - to lower salary
============================================================
```

### Feature - Random Events

At the end of each round, there is a chance that a random event would occur. The
random event could be positive, negative or a decision to make, and would affect the player's
asset, health, or other attributes based on your choice.

Example of a event:
```
============================================================
There is a food challenge in town.
You need to eat 1kg of A5 Wagyu in 15min
If you win, U will receive $500
Otherwise, you will need to pay $200
Do you want to participate?
(Yes/No)?
```

if you choose `yes`, the outcome could be:
```
You have failed to complete the food challenge!
You have lost $200 as a penalty!
```
or
```
You have successfully completed the food challenge!
You have received $500 as a reward!
```
or
```
You have completed the food challenge, but your body cannot handle!
You have received $200 as a consolation prize!
You have lost $300 to pay the medical bill!
You have lost $100 TAT
```
Feel free to explore the different random events in the game!

## Coming soon features in v2.1

### Feature - Shop System
A shop system will be added to the game, where players can purchase items or power-ups to help them in the game.

### Feature - Money flow track System
This feature will allow players to track their money flow in the game, including the money they earned and spent.

### Feature - Enhanced UI
This feature will enhance the user interface of the game to make it more user-friendly. Such as a better display of player status with health bar.

### Feature - Store two player progress
This would allow players to store two progress so that they can choose which progress to continue when they start the game.

## FAQ

**Q**: How do I know what action I should do at different stages of the game? 

**A**: No worries! The game would prompt you to enter your action during the game. 
If you are stuck, you can use the `help` command to see a list of commands that you can use.

**Q**: Can I transfer my game record to another computer?

**A**: Yes you can! The record is stored as `PlayerProfile.json` in `data` folder. The data in json file will be restored
by loader class during initialization, if the folder is empty, the program will open a new record. To transfer the
record, you can copy your current json file into `data` folder at your new computer.

## Command Summary

| Description            | Command                              |
|------------------------|--------------------------------------|
| Work                   | `work`                               |
| Exercise               | `exercise`                           |
| Rest                   | `rest`                               |
| Check Status           | `status`                             |
| Help                   | `help`                               |
| Sell Stock             | `sellstock`                          |
| Buy Stock              | `stock`                              |
| Upgrade                | `upgrade`                            |
| Hire Employee          | `hire <employee number>`             |
| Fire Employee          | `fire <employee number>`             |
| Adjust Employee Salary | `raise <amount>` or `lower <amount>` |
| Exit                   | `bye`                                |


