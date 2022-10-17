# Monsters card game
___
Monsters card game is a PC vs PC game where the program generates random players and plays.
<br/><br/>

### Rules
___
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
<br/><br/>

### Monster Cards
___
#### Players' cards:
* Werewolf (Hit Power: 30%, Health: 100%) - No special habilities;
* Vampire (Hit Power: 20%, Health: 100%) - Everytime the Vampire attacks there is a
20% chance of self-healing 10%;
* Mummy (Hit Power: 10%, Health: 100%) - Every 3rd attack results in a 10% health 
loss and Mummy is not allowed to attack next round.

#### Game's supernatural cards:
* Fairy (Hit Power: 40%, Health: 100%) - Can not be attacked;
* Witch (Hit Power: 35%, Health: 100%) - The damaged received by the Witch is halved.
<br/><br/>

### Structure
___
The game contains:
* **Game** class - orchestrates the game;
* **Player** class - plays and holds each player's cards;
* **Supernatural** package - contains **Fairy** class and the **Strikeable** package:
  * **Strikeable** pacakge - contains the **Witch** class and the **Monsters** package 
  that contains the Monster classes each player can randomly draw (**Werewolf**, **Vampire**
  and **Mummy**).
<br/><br/>

### Examples
___
#### The game starts:

```
Player 1 chooses 2.
Player 2 chooses 5.
Player 1 chooses 4.
Player 2 chooses 5.
Player 1 chooses 4.
Player 2 chooses 4.
Both players pick 4 monsters.
```

#### Player 1 attacks while Player 2 defends:

```
THE GAME BEGINS!

Player 1 plays first!

Player 1's monsters: 
Mummy (Hit Power: 10%, Health: 100%)
Mummy (Hit Power: 10%, Health: 100%)
Vampire (Hit Power: 20%, Health: 100%)
Werewolf (Hit Power: 30%, Health: 100%)

Player 2's monsters: 
Vampire (Hit Power: 20%, Health: 100%)
Mummy (Hit Power: 10%, Health: 100%)
Mummy (Hit Power: 10%, Health: 100%)
Werewolf (Hit Power: 30%, Health: 100%)

Player 1 plays Mummy (Hit Power: 10%, Health: 100%)
Player 2 plays Werewolf (Hit Power: 30%, Health: 100%)
Mummy attacks Werewolf dealing 10% health damage. Werewolf's current health: 90%
```

#### The game summons the Witch:

```
Player 1 plays Werewolf (Hit Power: 30%, Health: 100%)
Player 2 plays Vampire (Hit Power: 20%, Health: 100%)
-----GAME HAS SUMMONED A WITCH-----
Witch attacks Werewolf dealing 35% health damage. Werewolf's current health: 65%
Werewolf attacks Witch dealing 30% health damage. Witch's current health: 85%
Witch attacks Vampire dealing 35% health damage. Vampire's current health: 65%
Vampire hits his bite and heals 10% life points. Current health: 55%
Vampire attacks Witch dealing 20% health damage. Witch's current health: 75%
```

#### The game summons the Fairy:

```
Player 1 plays Vampire (Hit Power: 20%, Health: 100%)
Player 2 plays Werewolf (Hit Power: 30%, Health: 90%)
-----GAME HAS SUMMONED A FAIRY-----
Fairy attacks Vampire dealing 40% health damage. Vampire's current health: 60%
Fairy attacks Werewolf dealing 40% health damage. Werewolf's current health: 50%
```

#### Game over:

```
Player 1's monsters: 
Mummy (Hit Power: 10%, Health: 0%)
Mummy (Hit Power: 10%, Health: 25%)
Vampire (Hit Power: 20%, Health: 0%)
Werewolf (Hit Power: 30%, Health: 0%)

Player 2's monsters: 
Vampire (Hit Power: 20%, Health: 0%)
Mummy (Hit Power: 10%, Health: 0%)
Mummy (Hit Power: 10%, Health: 0%)
Werewolf (Hit Power: 30%, Health: 0%)

All Player 2's monsters are dead.
Player 1 won the game!

Process finished with exit code 0
```