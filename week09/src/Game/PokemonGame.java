package Game;
public class PokemonGame {
    public static void main(String[] args) {
        Charizard charizard = new Charizard(36, 400);
        Pikachu pikachu = new Pikachu(1, 35);
        Wings wings = new Wings();
        Jetpack jetpack = new Jetpack();

        charizard.setFlyable(wings);
        charizard.performFly();
        pikachu.setFlyable(jetpack);
        pikachu.performFly();
    }
}
