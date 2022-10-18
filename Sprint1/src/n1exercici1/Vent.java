package n1exercici1;

public class Vent extends Instrument{
    public Vent(String nom, double preu) {
        super(nom, preu);
    }

    @Override
    void play() {
        System.out.println("”Està sonant un instrument de vent”");
    }
}
