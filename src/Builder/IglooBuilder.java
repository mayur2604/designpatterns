package Builder;

public class IglooBuilder implements HouseBuilder {

    House igloo;

    public IglooBuilder() {
        igloo = new House();
    }

    @Override
    public void buildBasement() {
        igloo.setBasement("Ice Bars");
    }

    @Override
    public void buildRoof() {
        igloo.setRoof("Ice Dome");
    }

    @Override
    public void buildStructure() {
        igloo.setStructure("Ice Blocks");
    }

    @Override
    public House getHouse() {
        return igloo;
    }
}
