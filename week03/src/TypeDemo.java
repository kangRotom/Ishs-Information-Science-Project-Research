public class TypeDemo {
    public static void main(String[] args) {
        char c = '\uAC00';
        float fa = 0.1f;
        float fb = 0.2f;
        System.out.println(c);
        System.out.println((int)c);
        System.out.println(fa+fb);
        System.out.println(0.1+0.2);
        int intValue = 300;
        byte byteValue = (byte) intValue;
        System.out.println(byteValue);
        }
    }
