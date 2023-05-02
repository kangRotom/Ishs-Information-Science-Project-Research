package Game2;

public class PokemonGame {
    public static void main(String[] args) {
        Game2.Pokemon squirtle = new Game2.Pokemon("꼬부기");
        Game2.Pokemon pikachu = new Game2.Pokemon("피카츄",21,100);
        Game2.Pokemon charizard = new Game2.Pokemon("리자몽",36,250);
        Game2.Pokemon bulbasuar = new Game2.Pokemon();
        System.out.println(Game2.Pokemon.getCount());

        System.out.println(squirtle);
        System.out.println(pikachu);
        System.out.println(charizard);
        System.out.println(bulbasuar);

        pikachu.evolve();
        pikachu.attack(charizard);

        bulbasuar.setName("이상해씨");
        bulbasuar.attack();

        charizard.evolve();
        charizard.attack(pikachu);

        System.out.println(squirtle.getName());
        squirtle.setName("어니부기");
        System.out.println(squirtle.getName());
    }
}