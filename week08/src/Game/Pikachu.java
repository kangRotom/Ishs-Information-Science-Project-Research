package Game;

public class Pikachu extends Pokemon {
    public Pikachu() {
        this.setHp(35);
        this.setLevel(1);
        this.setName("피카츄");
    }
    public Pikachu(int level, int hp) {
        super();
        this.setHp(hp);
        this.setLevel(level);
        this.setName("피카츄");
    }

    public void attack() {
        super.attack();
    }
}
