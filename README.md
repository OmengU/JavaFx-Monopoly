# JavaFx-Monopoly
In this school project I am going to (try to) implement the game "Monopoly" in Java using the software platform JavaFX
## General Information
The game will support 2-4 players. On the start of a game, each player will receive a certain (possibly definable) amount of a fictional currency I call **PiBucks(π)**. Unlike real Monopoly there aren't any bills players need to keep track of. PiBucks are an entirely digital currency. The game will also feature a lot of (unfunny) [memes](https://en.wikipedia.org/wiki/Internet_meme), so that the game will be more fun and also to make it more distinct since another group is also implementing monopoly.
## Flow of the game
In the beginning of the game each player will role dice and land on a random field in result. The game will feature these fields:
### Property fields
When players land on these fields, they can acquire them. So, if another player lands on a field that has already been sold to another player, they have to pay the owner of the field the value of all fields the owner has combined. There will be 8 different classes of property fields which will be given different values (PiBucks):
|color|value|
|-----|----|
|blue|10 π |
|green|15 π|
|cyan|20 π|
|magenta|35 π|
|brown|50 π|
|red|69 π|
|yellow|80 π|
|orange| 100 π|
### "Special card" field
When a player lands on these fields, they will be given a random card (I will use JavaFX alerts for that), that will either give them an advantage or slow them down / hurt them. These cards will feature a lot of unfunny memes.
### Go to jail & jail
When a player lands on **Go to jail** he will be moved to the **jail** field. They will also not be able to play for 1 round.
### Start field
When a player crosses this field (e.g. completes a lap around the board) they will be awarded 20 π.
### "Danger" fields
When a player lands on this field they will have to pay a certain amount of money. They will also feature different, creative designs.

The game finishes when every player except one has lost all of their money or has given up (this will be an option, because a game might drag on for a long time). The person remaining will be the winner.

## General thoughts:
Classes (a UML diagram will be added later):
- board class
- field class
  - property field (inherited)
  - special field (before starting a game it will be possible to define custom ones --> custom texts, effects, etc. ) (inherited)
  - go to jail field (inherited)
  - jail field (inherited)
  - start field (inherited)
  - danger field (inherited)
- player class (possible a customizable figure)
- dice class

### Board
I am still not certain how I will implement the game board, but for now i am leaning towards a **grid pane** for the board itself (since there is no suitable option for a layout pane which just has an outer perimeter of fields) and a **stack pane** for the fields themselves since it will have to be possible to display multiple elements on top of each other (player figure, houses).
