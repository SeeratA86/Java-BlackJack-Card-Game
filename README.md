# JavaFX-BlackJack-Card-Game
## Overview:
JavaFX card game application demonstrating object-oriented programming, MVC structure, FXML views, controls, and game state management.

## Gameplay Overview

This project is a JavaFX Blackjack card game where the player plays against a dealer. The aim of the game is to get a hand value as close to 21 as possible without going over.

The game includes separate views for the login/player setup, player gameplay, dealer gameplay, deck viewing, and win/result screens.

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

## Code Structure and Functionality

### Model Classes

The `model` package contains the main game logic and data classes.

- `Card.java`  
  Represents an individual playing card, including its suit, value, and display information.

- `Deck.java`  
  Represents a deck of cards and handles deck-related behaviour such as storing, drawing, or managing cards.

- `CardLibrary.java`  
  Stores or manages the available cards used in the game.

- `Player.java`  
  Represents the player and stores player-related information, such as their hand and gameplay state.

- `Dealer.java`  
  Represents the dealer and manages dealer-related game actions.

### Controller Classes

The `controller` package connects the JavaFX user interface to the game logic.

- `LoginController.java`  
  Handles the login or player setup screen.

- `PlayerController.java`  
  Handles player screen actions and updates the player view.

- `DealerController.java`  
  Handles dealer screen actions and dealer-related gameplay.

- `DeckController.java`  
  Handles deck view interactions.

- `CardController.java`  
  Handles individual card display or card-related actions.

- `PlayerWinController.java`  
  Handles the result or winning screen.

### View Files

The `view` package contains the FXML files used to build the JavaFX interface.

- `LoginView.fxml`  
  The first screen where the player starts the game.

- `PlayerView.fxml`  
  Displays the player gameplay screen.

- `CardView.fxml`  
  Displays card-related interface elements.

- `DeckView.fxml`  
  Displays deck-related information.

- `PlayerWinView.fxml`  
  Displays the final result screen.

- `style.css`  
  Contains styling for the JavaFX interface.


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
