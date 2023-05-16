package Game;

public class Charizard extends Pokemon {
    public Charizard() {
        this.setHp(428);
        this.setLevel(36);
        this.setName("리자몽");
    }

    public Charizard(int level, int hp) {
        super();
        this.setHp(hp);
        this.setLevel(level);
        this.setName("리자몽");
    }
}
