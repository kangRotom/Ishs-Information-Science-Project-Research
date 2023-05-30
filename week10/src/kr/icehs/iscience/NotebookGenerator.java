package kr.icehs.iscience;

public class NotebookGenerator {
    public static void main(String[] args) {
        HPNotebook hpNotebook = new HPNotebook();
        LGGramNotebook lgGramNotebook = new LGGramNotebook();

        System.out.println(hpNotebook.shapeA());
        System.out.println(lgGramNotebook.shapeC());

        System.out.println("optical mouse connected to "+hpNotebook.shapeA());
    }
}
