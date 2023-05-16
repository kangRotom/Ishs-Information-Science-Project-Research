package Game;

public class PokemonGame {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu();
        Squirtle squirtle = new Squirtle();
        Charizard charizard = new Charizard();
        System.out.println(charizard.getName());
        squirtle.setLevel(1);
        squirtle.setHp(100);
        System.out.println(squirtle.getHp());
    }
}
