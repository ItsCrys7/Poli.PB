import java.util.ArrayList;
import java.util.List;

public class Contribuabil {
    private String nume;
    private String CNP;
    private List<Proprietate> proprietati;

    public Contribuabil(String nume, String CNP) {
        this.nume = nume;
        this.CNP = CNP;
        this.proprietati = new ArrayList<>();
    }

    public String getCNP() {
        return CNP;
    }

    public void adaugaProprietate(Proprietate proprietate) {
        proprietati.add(proprietate);
    }

    public double calculeazaSumaTotala() {
        double suma = 0;
        for (Proprietate p : proprietati) {
            suma += p.calculeazaCost();
        }
        return suma;
    }

    public void afiseazaFluturas() {
        System.out.println("Contribuabil: " + nume);
        System.out.println("CNP: " + CNP);
        System.out.println("Proprietăți");
        for (Proprietate p : proprietati) {
            System.out.println(p.getClass().getSimpleName() + ": " + p.adresa);
            System.out.println("Suprafață: " + p.suprafata);
            System.out.println("Cost: " + p.calculeazaCost());
        }
        System.out.println("Sumă totală: " + calculeazaSumaTotala());
    }
}
