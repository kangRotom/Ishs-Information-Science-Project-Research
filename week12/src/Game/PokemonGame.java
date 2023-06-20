package Game;
public class PokemonGame {
    public static void main(String[] args) throws Exception {
        Digimon d1 = new Agumon();

        Pokemon charizard = new Charizard(36, 400);
        Pokemon pikachu = new Pikachu(1, 35);
        //Wings wings = new Wings();
        Jetpack ISHSjetpack = new Jetpack();

        //anonymous object as parameter
        charizard.setFlyable(new Wings(){
            @Override
            public void fly() {
                System.out.println("fly with Iron Wings!");
            }
        });
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

        Balloon Redballoon = new Balloon();
        pikachu1.setFlyable(Redballoon); // strategy change
        pikachu1.performFly();

        try {
            pikachu1.attack(d1);
        } catch (Exception e){
            throw new Exception();
        }
    }
}
