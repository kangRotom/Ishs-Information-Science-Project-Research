package Game;

public class Pokemon {
    //encapsulation

    //fields
    private String name;
    private int level;
    private int hp;

    private static int count = 0;

//constructor
    public Pokemon(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        count++;
    }

    public Pokemon(String name) {
        this.name = name;
        // this(name,1,50);
        count++;
    }

    public Pokemon() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    //getter setter
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //methods
    void evolve(){
        hp = hp+10;
        level = level+1;
        System.out.println(name+"가 "+level+ "레벨로 성장 합니다");
    }

    void attack(Pokemon pokemon){
        System.out.println(this.name+"가(이) "+pokemon.name+"에게 기본 공격을 시전합니다");

    }

    void attack(){
        System.out.println(this.name+"가(이) 광역 공격을 시전합니다");
    }
}
