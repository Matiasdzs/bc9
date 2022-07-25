package cmillan;

public class KataFighter {
    public static String declareWinner(Fighter Peleador1, Fighter Peleador2, String ElPrimero) {
        if(Peleador1.getName().equals(ElPrimero)){
            while (Peleador1.getHealth()> 0 && Peleador2.getHealth() > 0 ){
                Peleador2.setHealth(Peleador2.getHealth() - Peleador1.getDamagePerAttack());
                if(Peleador2.getHealth() > 0){
                    Peleador1.setHealth(Peleador1.getHealth() - Peleador2.getDamagePerAttack());
                }
            }
        }else{
            while (Peleador1.getHealth() > 0 && Peleador2.getHealth() > 0){
                Peleador1.setHealth(Peleador1.getHealth() - Peleador2.getDamagePerAttack());
                if(Peleador1.getHealth() > 0){
                    Peleador2.setHealth(Peleador2.getHealth() - Peleador1.getDamagePerAttack());
                }
            }
        }
        if(Peleador1.getHealth() <= 0){
            return Peleador2.getName();
        }else{
            return Peleador1.getName();
        }
    }
}
