package kr.Game;

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
        //super.attack();
        System.out.println(this.name+" does a wide area aqua attack");
    }

    public void HydroPump() {
        System.out.println("하이드로펌프!!");
    }
}

