public class Main {
    public static void main(String[] args) {
        Tren tren = new Tren();
        tren.adaugaVagon(new CalatoriA());
        tren.adaugaVagon(new CalatoriB());
        tren.adaugaVagon(new Marfa());
        System.out.println("Total colete: " + tren.calculeazaTotalColete());
        tren.afiseazaTipuriVagoane();
    }
}
