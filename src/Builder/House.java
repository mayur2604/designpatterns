package Builder;

public class House implements HousePlan {

    private String structure;
    private String basement;
    private String roof;

    @Override
    public void setBasement(String basement) {
        this.basement = basement;
    }

    @Override
    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public void setStructure(String structure) {
        this.structure = structure;
    }

    @Override
    public String toString() {
        return this.structure + " " + this.basement + " " + this.roof;
    }
}
