public class Uczen extends  Osoba implements Dyzurny{

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

    @Override
    public void wykonajDyzur() {
        System.out.println("Podlewanie kwiatow");
    }
}
