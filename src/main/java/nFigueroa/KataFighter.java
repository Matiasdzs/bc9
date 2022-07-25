package nFigueroa;


public class KataFighter {

    public static void main(String[] args) {

        Fighter Luchador1 = new Fighter("Guille", 7, 3);
        Fighter Luchador2 = new Fighter("Alexis", 8, 2);
        System.out.println("El ganador es " + declareWinner(Luchador1, Luchador2, Luchador1.name));
    }
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (firstAttacker == fighter1.name) {
            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health > 0) {
                    System.out.println(fighter1.name + " ataca a " + fighter2.name + " .Ahora " + fighter2.name + " tiene " + fighter2.health + " de vida.");
                } else {
                    System.out.println(fighter1.name + " ataca a " + fighter2.name);
                    System.out.println(fighter2.name + " murió! ");
                }
                if (fighter2.health <= 0) return fighter1.name;
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health > 0) {
                    System.out.println(fighter2.name + " ataca a " + fighter1.name + " .Ahora " + fighter1.name + " tiene " + fighter1.health + " de vida.");
                } else {
                    System.out.println(fighter2.name + " ataca a " + fighter1.name);
                    System.out.println(fighter1.name + " murió! ");
                }
                if (fighter1.health <= 0) return fighter2.name;
            }
        } else {
            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health > 0) {
                    System.out.println(fighter2.name + " ataca a " + fighter1.name + " .Ahora " + fighter1.name + " tiene " + fighter1.health + " de vida.");
                } else {
                    System.out.println(fighter2.name + " ataca a " + fighter1.name);
                    System.out.println(fighter1.name + " murió! ");
                }
                if (fighter1.health <= 0) return fighter2.name;
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health > 0) {
                    System.out.println(fighter1.name + " ataca a " + fighter2.name + " .Ahora " + fighter2.name + " tiene " + fighter2.health + " de vida.");
                } else {
                    System.out.println(fighter1.name + " ataca a " + fighter2.name);
                    System.out.println(fighter2.name + " murió! ");
                }
                if (fighter2.health <= 0) return fighter1.name;
            }
        }
        return firstAttacker;
    }
}