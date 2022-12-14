package n1exercici1;

public abstract class Instrument {

    private String nom;
    private double preu;

    public Instrument(String nom, double preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }


     abstract void play() ;

    @Override
    public String toString() {
        return "Instrument{" +
                "nom='" + nom + '\'' +
                ", preu=" + preu +
                '}';
    }
}
