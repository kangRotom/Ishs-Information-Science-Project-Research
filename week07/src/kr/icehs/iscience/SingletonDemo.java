package kr.icehs.iscience;

class Singleton{
    private static Singleton s = new Singleton();
    private Singleton() {
        System.out.println("One object created!");
    }

    public static Singleton getInstance() {
        return s;
    }

//    @Override
//    public String toString() {
//        return "Singleton Pattern Object";
//    }
}
public class SingletonDemo {
    public static void main(String[] args) {
        //Singleton s = new Singleton(); //private access
        //System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance().toString());
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1==s2){
            System.out.println("Same object!");
        }else{
            System.out.println("Different object!");
        }
        System.out.println(s1);
        System.out.println(s2);
    }
}
