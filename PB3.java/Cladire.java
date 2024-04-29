public class Cladire extends Proprietate {
    public Cladire(String adresa, double suprafata) {
        super(adresa, suprafata);
    }

    @Override
    public double calculeazaCost() {
        return 500 * suprafata;
    }
}
