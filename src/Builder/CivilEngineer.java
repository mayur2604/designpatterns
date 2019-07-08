package Builder;

public class CivilEngineer {

    HouseBuilder house;

    public CivilEngineer(HouseBuilder house) {
        this.house = house;
    }

    public void build() {
        house.buildBasement();
        house.buildRoof();
        house.buildStructure();
    }
}

