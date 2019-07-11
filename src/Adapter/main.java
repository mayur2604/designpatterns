public class main {
    public static void main(String[] args) {
        Service service = new Service();
        IPerson person = new Person();
        person.setName("mayur");
        IFrenchPerson frenchPerson = new FrenchPerson();
        frenchPerson.setNom("aaa");
        service.printName(person);
        service.printName(new FrenchPersonAdapter(frenchPerson));
    }
}