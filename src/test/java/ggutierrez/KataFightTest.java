package ggutierrez;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataFightTest {
    @Test
   public void basicTests() {
        assertEquals("Lew", KataFight.declareWinner(new KataFighter("Lew", 10, 2),new KataFighter("Harry", 5, 4), "Lew"));
        assertEquals("Harry", KataFight.declareWinner(new KataFighter("Lew", 10, 2),new KataFighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", KataFight.declareWinner(new KataFighter("Harald", 20, 5), new KataFighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", KataFight.declareWinner(new KataFighter("Harald", 20, 5), new KataFighter("Harry", 5, 4), "Harald"));
        assertEquals("Harald", KataFight.declareWinner(new KataFighter("Jerry", 30, 3), new KataFighter("Harald", 20, 5), "Jerry"));
        assertEquals("Harald", KataFight.declareWinner(new KataFighter("Jerry", 30, 3), new KataFighter("Harald", 20, 5), "Harald"));
    }

   /* public void basicTests(){

    }*/
}