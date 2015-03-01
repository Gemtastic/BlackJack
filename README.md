# README #

This is my project for the core JavaSE introduction course. It's a very simple BlackJack game made following [these instructions](http://programmingbydoing.com/a/project-blackjack.html) and thus contains the simple functions such as:

* Randomizing a value to a drawn card.
* Drawing two cards for each user and adding them to a player hand.
* Infinite hits for players (and a instructed cap for the dealer where she stays when her hand is more than 16).
* Auto-lose if either player's hand is more than 21.
* Dealer auto-wins at a draw.
* Asks player for another round.

### Map of the classes: ###

* [**BlackJackGame**](https://bitbucket.org/GeminiJuSa/projektarbete_javaintroduktion/src/b5f74b4062ebf55396821331030b3e2f471720fc/src/main/java/com/gemtastic/blackjack/BlackJackGame.java?at=default) is the main class.
* [Player](https://bitbucket.org/GeminiJuSa/projektarbete_javaintroduktion/src/b5f74b4062ebf55396821331030b3e2f471720fc/src/main/java/com/gemtastic/blackjack/Player.java?at=default) is the interface for the players.
* [Dealer](https://bitbucket.org/GeminiJuSa/projektarbete_javaintroduktion/src/b5f74b4062ebf55396821331030b3e2f471720fc/src/main/java/com/gemtastic/blackjack/Dealer.java?at=default) and [User](https://bitbucket.org/GeminiJuSa/projektarbete_javaintroduktion/src/b5f74b4062ebf55396821331030b3e2f471720fc/src/main/java/com/gemtastic/blackjack/User.java?at=default) are the currently existing players.
* [Card](https://bitbucket.org/GeminiJuSa/projektarbete_javaintroduktion/src/b5f74b4062ebf55396821331030b3e2f471720fc/src/main/java/com/gemtastic/blackjack/Card.java?at=default) is the card object.