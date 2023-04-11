package Game;

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        Pokemon charizard = new Pokemon();

        pikachu.name = "피카츄";
        charizard.name = "리자몽";

        pikachu.level = 21;
        charizard.level = 36;

        pikachu.evolve();
        pikachu.attack();

        charizard.evolve();
        charizard.attack();
    }
}
