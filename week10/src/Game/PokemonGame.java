package Game;
public class PokemonGame {
    public static void main(String[] args) {
        Pokemon charizard = new Charizard(36, 400);
        Pokemon pikachu = new Pikachu(1, 35);
        //Wings wings = new Wings();
        Jetpack ISHSjetpack = new Jetpack();

        charizard.setFlyable(new Wings());
        charizard.performFly();
        pikachu.setFlyable(ISHSjetpack);
        pikachu.performFly();
    }
}
