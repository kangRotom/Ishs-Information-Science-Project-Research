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
        pikachu2.MillionVolt();
        System.out.println(pokemon.getHp());
        System.out.println(pikachu2.getHp());

        System.out.println(pikachu2); //same address (pokemon)
    }
}
