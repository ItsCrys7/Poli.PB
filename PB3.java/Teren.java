public class Teren extends Proprietate {
    private int rang;

    public Teren(String adresa, double suprafata, int rang) {
        super(adresa, suprafata);
        this.rang = rang;
    }

    @Override
    public double calculeazaCost() {
        return 350 * suprafata / rang;
    }
}
