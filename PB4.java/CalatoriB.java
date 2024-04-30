public class CalatoriB extends CalatoriA {
    public void blocheazaGeamuri() {
        System.out.println("Geamurile s-au blocat.");
    }

    @Override
    public int calculeazaColete() {
        return colete + pasageri * 400;
    }
}
