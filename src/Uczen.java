public class Uczen extends  Osoba{

    private int nrucznia;
    private static int liczbauczniow;


    public Uczen(String imie, int wiek) {
        super(imie, wiek);
        liczbauczniow++;
        nrucznia = liczbauczniow;
    }

    @Override
    public String toString() {
        return "Uczen{" + getImie() + "imie: " + "nrucznia: " + nrucznia + "}";
    }

}
