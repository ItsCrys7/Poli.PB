public class Main {
    public static void main(String[] args) {
        Contribuabil ion = new Contribuabil("John Smith","1234567890");
        ion.adaugaProprietate(new Cladire("Str. T. William Nr. 2", 20));
        ion.adaugaProprietate(new Teren("Str. T. William Nr. 2", 10, 1));
        ion.adaugaProprietate(new Cladire("Str. WallStreet Nr. 28", 25));
        ion.afiseazaFluturas();
    }
}
