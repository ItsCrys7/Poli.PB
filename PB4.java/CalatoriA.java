public class CalatoriA extends Vagon {
    protected int pasageri;

    @Override
    public int calculeazaColete() {
        return colete + pasageri * 300;
    }
}
