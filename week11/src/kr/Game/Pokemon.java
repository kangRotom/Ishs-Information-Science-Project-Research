package kr.Game;

public abstract class Pokemon {
    protected int level;
    protected int hp;
    protected String name;

    public void setFlyable(Flybehavior flyable) {
        this.flyable = flyable;
    }

    public void performFly(){
        System.out.print(this.name);
        this.flyable.fly();
    }

    Flybehavior flyable;

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

    public abstract void attack();

    public void attack(Pokemon target){
        if (this instanceof Pikachu) {
            System.out.println("Pika pika~");
        }
        System.out.println(this.name+" does a attack to "+target.name);
    }
}
