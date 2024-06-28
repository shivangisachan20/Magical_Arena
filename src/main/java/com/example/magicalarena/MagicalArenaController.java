package com.example.magicalarena;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/arena")
public class MagicalArenaController {

    @Autowired
    private MagicalArenaService arenaService;

    @PostMapping("/start")
    public String startMatch(@RequestBody MatchRequest matchRequest) {
        Player player1 = new Player(
                matchRequest.getPlayer1().getHealth(),
                matchRequest.getPlayer1().getStrength(),
                matchRequest.getPlayer1().getAttack()
        );
        Player player2 = new Player(
                matchRequest.getPlayer2().getHealth(),
                matchRequest.getPlayer2().getStrength(),
                matchRequest.getPlayer2().getAttack()
        );
        arenaService.initializePlayers(player1, player2);
        return arenaService.startMatch();
    }

    public static class MatchRequest {
        private PlayerDto player1;
        private PlayerDto player2;

        // getters and setters
        public PlayerDto getPlayer1() {
            return player1;
        }

        public void setPlayer1(PlayerDto player1) {
            this.player1 = player1;
        }

        public PlayerDto getPlayer2() {
            return player2;
        }

        public void setPlayer2(PlayerDto player2) {
            this.player2 = player2;
        }

        public static class PlayerDto {
            private int health;
            private int strength;
            private int attack;

            // getters and setters
            public int getHealth() {
                return health;
            }

            public void setHealth(int health) {
                this.health = health;
            }

            public int getStrength() {
                return strength;
            }

            public void setStrength(int strength) {
                this.strength = strength;
            }

            public int getAttack() {
                return attack;
            }

            public void setAttack(int attack) {
                this.attack = attack;
            }
        }
    }
}
