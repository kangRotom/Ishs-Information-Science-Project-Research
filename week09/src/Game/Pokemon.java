package Game;

public class Pokemon {
    // private -> protected
    protected int level;
    protected int hp;
    protected String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println(this.getName()+"이(가) 광역 공격을 합니다.");
    }

    public void attack(Pokemon target){
        if (target instanceof Pikachu) {
            System.out.println("Pika pika~");
        }
        System.out.println(this.name+" does a attack to "+target.name);
    }
}
