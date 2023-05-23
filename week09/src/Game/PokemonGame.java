package Game;
public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pokemon = new Pikachu(14, 265); //upcast
        Pikachu pikachu = new Pikachu(1, 35);

        System.out.println(pokemon);
        System.out.println(pikachu);

        pikachu.MillionVolt();
        //pokemon.MillionVolt(); //can't use child method

        Pikachu pikachu2 = (Pikachu) pokemon; //downcast
        Squirtle squirtle1 = (Squirtle) pokemon;
        /*
        Exception in thread "main" java.lang.ClassCastException: class Game.Pikachu cannot be cast to class Game.Squirtle (Game.Pikachu and Game.Squirtle are in unnamed module of loader 'app')
	at Game.PokemonGame.main(PokemonGame.java:14)
         */
        pikachu2.MillionVolt();
        System.out.println(pokemon.getHp());
        System.out.println(pikachu2.getHp());

        System.out.println(pikachu2); //same address (pokemon)
    }
}
