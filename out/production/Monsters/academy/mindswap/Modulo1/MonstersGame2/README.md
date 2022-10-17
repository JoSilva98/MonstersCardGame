# Monsters card game developed using Java

Monsters card game is a PC vs PC game where the program generates random players and plays.

### Rules:
* The game starts generating 2 players and both randomly plays a number between 1 and 5.
The game starts when both numbers match and both players receive that number of cards;
* On the first round one player is randomly chosen to attack and the other defends. Example:
Player 1 is chosen to attack on the round 1 and the Player 2 defends. On round 2 the Player 1
defends and the Player 2 attacks and so on. That being said both players randomly play a card
each turn;
* Every round there is a 50% chance of a Fairy or a Witch being summoned. When a Fairy is
summoned both players' monsters are attacked and both can not attack. When a Witch is summoned
both players' monsters are attacked and both players' monsters attack the Witch (the damaged dealt
to the Witch is halved);
* The game ends when one of the players' monsters health is 0%.

### Monster Cards:

Players' cards:
* Werewolf (Hit Power: 30%, Health: 100%) - No special habilities;
* Vampire (Hit Power: 20%, Health: 100%) - Everytime the Vampire attacks there is a
20% chance of self-healing 10%;
* Mummy (Hit Power: 10%, Health: 100%) - Every 3rd attack results in a 10% health 
loss and Mummy is not allowed to attack next round.

Game's supernatural cards:
* Fairy (Hit Power: 40%, Health: 100%) - Can not be attacked;
* Witch (Hit Power: 35%, Health: 100%) - The damaged received by the Witch is halved.

### Examples:
```
-----Both players draw 7 cards-----

-----Player plays first-----

Cards left in the deck: 25
Trump: AS

Your cards:
[JP, KH, KP, 4S, 5H, 6H, 5S]

Play a card: 
```

```
Play a card: jp

Player played JP
PC played 2P
Trump: AS

-----Player won this round-----

Player score: 3
PC score: 0
```