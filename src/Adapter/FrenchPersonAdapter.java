public class FrenchPersonAdapter implements IPerson {
    private IFrenchPerson frenchPerson;

    public FrenchPersonAdapter(IFrenchPerson frenchPerson) {
        this.frenchPerson = frenchPerson;
    }

    public void setName(String name) {
        frenchPerson.setNom(name);
    }

    public String getName() {
        return frenchPerson.getNom();
    }
}