package Game;
public class PokemonGame {
    public static void main(String[] args) {
        //Pokemon pokemon1 = new Pokemon(); //abstract class can't initiate instance
        Squirtle squirtle1 = new Squirtle();
        Charizard charizard = new Charizard(36, 400);
        Pokemon pokemon = new Pikachu(14, 265); //upcast
        Pikachu pikachu = new Pikachu(1, 35);
        Trainer trainer1 = new Trainer(); // default constructor by jdk

        pikachu.attack(squirtle1); //compatible
        pikachu.attack(charizard); //compatible
        // pikachu.attack(trainer1); //incompatible
        charizard.attack(pikachu);

        System.out.println(pokemon);
        System.out.println(pikachu);

        pikachu.MillionVolt();
        //pokemon.MillionVolt(); //can't use child method

        Pikachu pikachu2 = (Pikachu) pokemon; //downcast
        //Squirtle squirtle1 = (Squirtle) pokemon;
        /*
        Exception in thread "main" java.lang.ClassCastException: class Game.Pikachu cannot be cast to class Game.Squirtle (Game.Pikachu and Game.Squirtle are in unnamed module of loader 'app')
	at Game.PokemonGame.main(PokemonGame.java:14)
         */
        pikachu2.MillionVolt();
        System.out.println(pokemon.getHp());
        System.out.println(pikachu2.getHp());

        System.out.println(pikachu2); //same address (pokemon)

        pokemon.attack();
        pikachu2.attack();
        squirtle1.attack();


    }
}
