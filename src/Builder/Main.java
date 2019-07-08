package Builder;

public class Main {

    public static void main(String[] args) {
        HouseBuilder builder = new IglooBuilder();
        CivilEngineer engineer = new CivilEngineer(builder);
        engineer.build();
        House house = builder.getHouse();
        System.out.println(house);
    }
}
