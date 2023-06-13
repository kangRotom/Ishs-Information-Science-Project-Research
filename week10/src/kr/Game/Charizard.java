package Game;

public class Charizard extends Pokemon {
    public Charizard() {
        this.hp = 428;
        this.level = 36;
        this.name = "리자몽";
    }

    public Charizard(int level, int hp) {
        super();
        this.hp = hp;
        this.level = level;
        this.name = "리자몽";
    }

    public void attack() {
        System.out.println(this.name+" does a wide area fire attack");
    }

    public void FireBlast() {
        System.out.println("불대문자!!");
    }
}
