package n1exercici1;

public class Percussió extends Instrument{
    public Percussió(String nom, double preu) {
        super(nom, preu);
    }

    @Override
    void play() {
        System.out.println("”Està sonant un instrument de percussió”");
    }
}
