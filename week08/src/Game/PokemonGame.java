package Game;

public class PokemonGame {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu(1, 35);
        Squirtle squirtle = new Squirtle();
        Charizard charizard = new Charizard();
        System.out.println(charizard.name);
        squirtle.setLevel(1);
        squirtle.setHp(100);
        System.out.println(squirtle.hp);
        System.out.println(pikachu.hp);
        pikachu.attack();
        squirtle.attack();
        charizard.attack();
    }
}
