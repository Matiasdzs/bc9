package earaya;

public class KataFighter {
    public static String declareWinner(Fighter player1, Fighter player2, String primerAtacante) {
        String atacante = primerAtacante;
        String winner = "";
        while (tenganEnergia(player1,player2)){
           if(atacante.equals(player1.name)){
               golpe(player1, player2);
               if(estaMuerto(player2)) {
                   winner = player1.name;
                   break;
               }
               atacante = player2.name;
           }
           if(atacante.equals(player2.name)){
               golpe(player2, player1);
               if(estaMuerto(player1)) {
                   winner = player2.name;
                   break;
               }
               atacante = player1.name;
           }
       }
        return winner;
    }

    private static boolean estaMuerto(Fighter player2) {
        return player2.health <= 0;
    }

    private static void golpe(Fighter player1, Fighter player2) {
        player2.health = player2.health - player1.damagePerAttack;
    }

    private static boolean tenganEnergia(Fighter player1, Fighter player2) {
        return player1.health >= 0 || player2.health >= 0;
    }
}
