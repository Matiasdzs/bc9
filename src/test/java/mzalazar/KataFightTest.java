package mzalazar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataFightTest {
    @Test
   public void basicTests() {
        assertEquals("Lew", mzalazar.KataFight.declareWinner(new mzalazar.KataFighter("Lew", 10, 2),new mzalazar.KataFighter("Harry", 5, 4), "Lew"));
        assertEquals("Harry", mzalazar.KataFight.declareWinner(new mzalazar.KataFighter("Lew", 10, 2),new mzalazar.KataFighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", mzalazar.KataFight.declareWinner(new mzalazar.KataFighter("Harald", 20, 5), new mzalazar.KataFighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", mzalazar.KataFight.declareWinner(new mzalazar.KataFighter("Harald", 20, 5), new mzalazar.KataFighter("Harry", 5, 4), "Harald"));
        assertEquals("Harald", mzalazar.KataFight.declareWinner(new mzalazar.KataFighter("Jerry", 30, 3), new mzalazar.KataFighter("Harald", 20, 5), "Jerry"));
        assertEquals("Harald", mzalazar.KataFight.declareWinner(new mzalazar.KataFighter("Jerry", 30, 3), new KataFighter("Harald", 20, 5), "Harald"));
    }

   /* public void basicTests(){

    }*/
}