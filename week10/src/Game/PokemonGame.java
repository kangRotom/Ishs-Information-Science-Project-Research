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
        //below methods can't use with parent's variable
//        pikachu.attack();
//        charizard.attack();

        // Pikachu pikachu1 = new Pokemon(); //downcast is impossible
        Pikachu pikachu1 = (Pikachu) pikachu; //downcast success
        pikachu1.MillionVolt();

        //Charizard charizard1 = (Pikachu) charizard; //incompatible
        Charizard charizard1 = (Charizard) charizard;
        charizard1.FireBlast(); //downcast success
    }
}
