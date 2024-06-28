package com.example.magicalarena;

import org.springframework.stereotype.Service;

@Service
public class MagicalArenaService {

    private Player player1;
    private Player player2;

    public void initializePlayers(Player p1, Player p2) {
        this.player1 = p1;
        this.player2 = p2;
    }

    public String startMatch() {
        Player attacker, defender;
        StringBuilder result = new StringBuilder();

        while (player1.isAlive() && player2.isAlive()) {
            if (player1.getHealth() < player2.getHealth()) {
                attacker = player1;
                defender = player2;
            } else {
                attacker = player2;
                defender = player1;
            }

            int attackDamage = attacker.attack();
            int defense = defender.defend();
            int damage = attackDamage - defense;

            if (damage > 0) {
                defender.takeDamage(damage);
            }

            result.append("Attacker: ").append(attacker == player1 ? "Player 1" : "Player 2").append("\n");
            result.append("Defender: ").append(defender == player1 ? "Player 1" : "Player 2").append("\n");
            result.append("Attack Damage: ").append(attackDamage).append("\n");
            result.append("Defense: ").append(defense).append("\n");
            result.append("Damage Dealt: ").append(damage).append("\n");
            result.append("Player 1 Health: ").append(player1.getHealth()).append("\n");
            result.append("Player 2 Health: ").append(player2.getHealth()).append("\n\n");

            if (!defender.isAlive()) {
                result.append(defender == player1 ? "Player 1" : "Player 2").append(" is dead. Game over.\n");
                break;
            }
        }
        return result.toString();
    }
}
