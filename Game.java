package academy.mindswap.Modulo1.MonstersGame2;

import academy.mindswap.Modulo1.MonstersGame2.Supernatural.Fairy;
import academy.mindswap.Modulo1.MonstersGame2.Supernatural.Strikeable.Monsters.Monster;
import academy.mindswap.Modulo1.MonstersGame2.Supernatural.Strikeable.Witch;
import academy.mindswap.Modulo1.MonstersGame2.Supernatural.Supernatural;

public class Game {

    private final Player PLAYER1;
    private final Player PLAYER2;

    public Game(Player player1, Player player2) {
        this.PLAYER1 = player1;
        this.PLAYER2 = player2;
    }

    public String playGame() {
        int nrMonsters = nrOfMonstersForGame();
        System.out.println("THE GAME BEGINS!\n");
        int rounds = Helpers.generateRandomNr(2, 0);
        if (rounds == 0) {
            System.out.println(this.PLAYER1.getNAME() + " plays first!\n");
        } else {
            System.out.println(this.PLAYER2.getNAME() + " plays first!\n");
        }

        this.PLAYER1.setMonsters(nrMonsters);
        this.PLAYER2.setMonsters(nrMonsters);

        printPlayerMonsters(this.PLAYER1);
        printPlayerMonsters(this.PLAYER2);

        Supernatural[] obstacleArray = new Supernatural[]{new Witch(35), new Fairy(40)};

        while (this.PLAYER1.isAlive() && this.PLAYER2.isAlive()) {
            Monster p1Monster = this.PLAYER1.chooseMonster();
            Monster p2Monster = this.PLAYER2.chooseMonster();

            printPlayerChosenMonster(this.PLAYER1, p1Monster);
            printPlayerChosenMonster(this.PLAYER2, p2Monster);

            if (obstacleProbability()) {
                Supernatural obstacle = obstacleSummoner(obstacleArray);
                printObstacleSummoning(obstacle);
                playRound(p1Monster, obstacle);
                playRound(p2Monster, obstacle);
                System.out.println();
            } else if (rounds++ % 2 == 0) {
                playRound(p1Monster, p2Monster);
            } else {
                playRound(p2Monster, p1Monster);
            }

            printPlayerMonsters(this.PLAYER1);
            printPlayerMonsters(this.PLAYER2);
        }
        return checkWinner();
    }

    private int nrOfMonstersForGame() {
        int player1Number;
        int player2Number;
        do {
            player1Number = Helpers.generateRandomNr(5, 1);
            System.out.println(this.PLAYER1.getNAME() + " chooses " + player1Number + ".");
            player2Number = Helpers.generateRandomNr(5, 1);
            System.out.println(this.PLAYER2.getNAME() + " chooses " + player2Number + ".");
        }
        while (player1Number != player2Number);
        System.out.println("Both players pick " + player1Number + " monsters.\n");
        return player1Number;
    }

    private void printPlayerMonsters(Player player) {
        System.out.println(player.getNAME() + "'s monsters: ");
        for (int i = 0; i < player.getMonstersArray().length; i++) {
            System.out.println(player.getMonster(i).getType().getNAME() + " (Hit Power: " + player.getMonster(i).getHIT_POWER()
                    + "%, Health: " + player.getMonster(i).getHealth() + "%)");
            if (i == player.getMonstersArray().length - 1) {
                System.out.println();
            }
        }
    }

    private void printPlayerChosenMonster(Player player, Monster playerMonster) {
        System.out.println(player.getNAME() + " plays " + playerMonster.getType().getNAME() + " (Hit Power: " +
                playerMonster.getHIT_POWER() + "%, Health: " + playerMonster.getHealth() + "%)");
    }

    private boolean obstacleProbability() {
        int randomNumber = Helpers.generateRandomNr(10, 0);
        return randomNumber <= 5;
    }

    private Supernatural obstacleSummoner(Supernatural[] obstacles) {
        int index = Helpers.generateRandomNr(2, 0);

        if (obstacles[index] instanceof Witch && ((Witch) obstacles[index]).isDead()) {
            return obstacles[1];
        }
        return obstacles[index];
    }

    private void playRound(Monster p1Monster, Monster p2Monster) {
        p2Monster.suffer(p1Monster.attack());
        printAttack(p1Monster, p2Monster);
        System.out.println();
    }

    private void playRound(Monster pMonster, Supernatural obstacle) {
        pMonster.suffer(obstacle.attack());
        printAttack(obstacle, pMonster);

        if (obstacle instanceof Witch && pMonster.isAlive()) {
            ((Witch) obstacle).suffer(pMonster.attack());
            printAttack(pMonster, obstacle);
            if (((Witch) obstacle).isDead()) {
                System.out.println("Witch is dead.");
            }
        }
    }

    private void printAttack(Supernatural attacker, Supernatural defender) {
        System.out.println(attacker.getType().getNAME() + " attacks " + defender.getType().getNAME() + " dealing " + attacker.getHIT_POWER()
                + "% health damage. " + defender.getType().getNAME() + "'s current health: " + defender.getHealth() + "%");
    }

    private void printObstacleSummoning(Supernatural supernatural) {
        System.out.println("-----GAME HAS SUMMONED A " + supernatural.getType() + "-----");
    }

    private String checkWinner() {
        if (this.PLAYER1.isAlive()) {
            System.out.println("All " + this.PLAYER2.getNAME() + "'s monsters are dead.");
            return this.PLAYER1.getNAME() + " won the game!";
        } else if (this.PLAYER2.isAlive()) {
            System.out.println("All " + this.PLAYER1.getNAME() + "'s monsters are dead.");
            return this.PLAYER2.getNAME() + " won the game!";
        }
        System.out.println("All monsters are dead.");
        return "Draw!";
    }
}
