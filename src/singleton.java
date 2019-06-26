class Singleton {
private static Singleton instance;
    private Singleton(){
System.out.println("constructor called");
}
public static Singleton getInstance(){
    if(instance==null)
        instance=new Singleton();
    return instance;
}
}
class singleton{
    public static void main(String[] args){
        Singleton instance=Singleton.getInstance();
        Singleton instance2=Singleton.getInstance();
    }
}
