package Game;

public abstract class Pokemon {
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

    public abstract void attack();

    public void attack(Pokemon target){
        if (this instanceof Pikachu) {
            System.out.println("Pika pika~");
        }
        System.out.println(this.name+" does a attack to "+target.name);
    }
}
