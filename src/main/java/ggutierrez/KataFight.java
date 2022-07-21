package ggutierrez;


    public class KataFight {
        public static String declareWinner(KataFighter fighter1, KataFighter fighter2, String firstAttacker) {

            String winner = "";
            Boolean aux = false;

            while (aux==false) {
                if (firstAttacker == fighter1.name) {
                    fighter2.health -= fighter1.damagePerAttack;
                    if (fighter2.health <= 0) {
                        winner= fighter1.name;
                        aux = true;
                    } else {
                        fighter1.health -= fighter2.damagePerAttack;
                        if (fighter1.health <= 0) {
                            winner= fighter2.name;
                            aux = true;
                        }
                    }
                } else if(firstAttacker == fighter2.name){
                    fighter1.health -= fighter2.damagePerAttack;
                    if (fighter1.health <= 0) {
                        winner= fighter2.name;
                        aux = true;
                    } else {
                        fighter2.health -= fighter1.damagePerAttack;
                        if (fighter2.health <= 0) {
                            winner= fighter1.name;
                            aux=true;
                        }
                    }
                }

            }
            return winner;
        }
    }



