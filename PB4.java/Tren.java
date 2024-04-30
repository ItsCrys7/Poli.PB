public class Tren {
    private Vagon[] vagoane = new Vagon[15];
    private int index = 0;

    public void adaugaVagon(Vagon vagon) {
        if (index < 15) {
            vagoane[index++] = vagon;
        }
    }

    public int calculeazaTotalColete() {
        int total = 0;
        for (int i = 0; i < index; i++) {
            total += vagoane[i].calculeazaColete();
        }
        return total;
    }

    public void afiseazaTipuriVagoane() {
        for (int i = 0; i < index; i++) {
            System.out.println(vagoane[i].getClass().getSimpleName());
        }
    }
}
