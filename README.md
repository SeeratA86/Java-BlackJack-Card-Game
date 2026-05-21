# JavaFX-BlackJack-Card-Game
## Overview:
JavaFX card game application demonstrating object-oriented programming, MVC structure, FXML views, controls, and game state management.

## Gameplay Overview

This project is a JavaFX Blackjack card game where the player plays against a dealer. The aim of the game is to get a hand value as close to 21 as possible without going over.

The game includes separate views for the login/player setup, player gameplay, dealer gameplay, deck viewing, and win/result screens.

## Related Project
An earlier terminal-based version of this Blackjack game was also developed to practise the core game logic before extending the project into a JavaFX MVC application.

## How the Game Works

1. The player starts the application and enters the required player details.
2. The game creates a player, dealer, and card decks.
3. Cards are dealt to the player and dealer.
4. The player can view their cards and make gameplay decisions.
5. The dealer manages the deck and dealer-side actions.
6. The game checks the card values and determines the result.
7. The winner screen displays the final outcome.

## Features
- JavaFX graphical user interface
- Login/player setup screen
- Dealer and player game views
- Card and deck management
- Blackjack game logic
- MVC-based project structure
- FXML views and controller classes

## Project Structure
```text
.
├── src/
│   ├── controller/
│   │   ├── CardController.java
│   │   ├── DealerController.java
│   │   ├── DeckController.java
│   │   ├── LoginController.java
│   │   ├── PlayerController.java
│   │   └── PlayerWinController.java
│   │
│   ├── model/
│   │   ├── Card.java
│   │   ├── CardLibrary.java
│   │   ├── Dealer.java
│   │   ├── Deck.java
│   │   └── Player.java
│   │
│   ├── view/
│   │   ├── CardView.fxml
│   │   ├── DeckView.fxml
│   │   ├── LoginView.fxml
│   │   ├── PlayerView.fxml
│   │   ├── PlayerWinView.fxml
│   │   └── style.css
│   │
│   └── App.java
│
├── .gitignore
└── README.md
```

## How to Run the Game

### Requirements

Before running the project, make sure you have:

- Java installed
- JavaFX installed and configured
- An IDE such as Visual Studio Code or one of your preference.

### Running the Project

1. Clone this repository:

```bash
git clone https://github.com/YSeeratA86/Java-Blackjack-Card-Game.git
```

## What I Learned
This project helped me build a stronger understanding of how different responsibilities worked in an MVC-style structure, where model classes manage the game data and logic, the controller handles user interactions, and FXML files define the user interface.

- Building graphical user interfaces using JavaFX
- Connecting FXML views to Java controller classes
- Handling user actions through event-driven programming
- Managing game state across multiple screens
- Designing model classes for cards, decks, players, and dealers
- Using CSS to style a JavaFX interface
- Structuring a Java project so that the code is easier to understand and maintin.

Overall, this project helped me understand how a simple card game can be expanded into a more organised GUI application using Java, JavaFX, and MVC principles.


