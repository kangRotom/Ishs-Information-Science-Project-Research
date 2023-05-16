package Game;

public class Squirtle extends Pokemon {
    public Squirtle() {
        this.hp = 44;
        this.level = 1;
        this.name = "꼬부기";
    }

    public Squirtle(int level, int hp) {
        super();
        this.hp = hp;
        this.level = level;
        this.name = "꼬부기";
    }

    public void attack() {
        System.out.println(this.name+"이(가) 광역 물대포 공격을 합니다.");
    }
}
