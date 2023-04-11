package Game;

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        Pokemon charizard = new Pokemon();

        pikachu.setName("피카츄");
        pikachu.setLevel(21);
        pikachu.setHp(100);

        charizard.setName("리자몽");
        charizard.setLevel(36);
        charizard.setHp(150);

        pikachu.evolve();
        pikachu.attack();

        charizard.evolve();
        charizard.attack();
    }
}
