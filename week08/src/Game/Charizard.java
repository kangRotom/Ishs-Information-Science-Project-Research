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
        super.attack();
        System.out.println(this.name+"이(가) 광역 화염방사 공격을 합니다.");
    }
}
