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

    public void attack() {
        super.attack();
        System.out.println(this.getName()+"이(가) 광역 화염방사 공격을 합니다.");
    }
}
