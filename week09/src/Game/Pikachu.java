package Game;

public class Pikachu extends Pokemon {
    public Pikachu() {
        this.hp = 35;
        this.level = 1;
        this.name = "피카츄";
    }
    public Pikachu(int level, int hp) {
        super();
        this.hp = hp;
        this.level = level;
        this.name = "피카츄";
    }
    void MillionVolt(){
        System.out.println("백만볼트!!");
    }
}
