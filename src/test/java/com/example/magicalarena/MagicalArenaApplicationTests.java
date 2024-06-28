package com.example.magicalarena;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MagicalArenaApplicationTests {

	@Autowired
	private MagicalArenaService arenaService;

	@Test
	void testMatch() {
		Player player1 = new Player(50, 5, 10);
		Player player2 = new Player(100, 10, 5);
		arenaService.initializePlayers(player1, player2);
		String result = arenaService.startMatch();
		assertTrue(result.contains("Game over"));
	}
	@Test
	void testPlayerAttack() {
		Player player = new Player(100, 10, 5);
		int attackDamage = player.attack();
		assertTrue(attackDamage >= 5 && attackDamage <= 30); // As 5 * 1 to 5 * 6
	}

	@Test
	void testPlayerDefend() {
		Player player = new Player(100, 10, 5);
		int defense = player.defend();
		assertTrue(defense >= 10 && defense <= 60); // As 10 * 1 to 10 * 6
	}

}

