package kr.icehs.iscience;

final class CannotInherit{

}
class SuperFinalDemo {
    void test1(){
        System.out.println("test1 method");
    }

    final void test2(){
        System.out.println("test2 method");
    }
}
public class FinalDemo extends SuperFinalDemo {
    public static final String POKEMON = "Pocket Monster";
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(POKEMON);
    }
    void test1() {
        System.out.println("override test1 method");
    }
}
