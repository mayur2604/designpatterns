package prototype;

public class Main {
    public static void main(String[] args){
        ColorStore store=new ColorStore();
        store.getColor("blue").addColor();
        store.getColor("black").addColor();
        store.getColor("blue").addColor();
    }
}
