public class Proprietate {
    protected String adresa;
    protected double suprafata;

    public Proprietate(String adresa, double suprafata) {
        this.adresa = adresa;
        this.suprafata = suprafata;
    }

    public double calculeazaCost() {
        return 0;
    }
}
