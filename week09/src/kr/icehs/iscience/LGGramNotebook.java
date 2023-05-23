package kr.icehs.iscience;

public class LGGramNotebook extends Notebook implements USB_A,USB_C{
    @Override
    public void aType() {

    }

    @Override
    public String shapeA() {
        return "rectangle shape interface";
    }

    @Override
    public void cType() {

    }

    @Override
    public String shapeC() {
        return "rounded shape interface";
    }
}
