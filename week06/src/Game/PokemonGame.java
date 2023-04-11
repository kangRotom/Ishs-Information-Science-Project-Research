package Game;

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon squirtle = new Pokemon("꼬부기");
        Pokemon pikachu = new Pokemon("피카츄",21,100);
        Pokemon charizard = new Pokemon("리자몽",36,250);
        Pokemon bulbasuar = new Pokemon();

        pikachu.evolve();
        pikachu.attack(charizard);   bulbasuar.setName("이상해씨");

        charizard.evolve();
        charizard.attack(pikachu);

        System.out.println(squirtle.getName());
        squirtle.setName("어니부기");
        System.out.println(squirtle.getName());
    }
}