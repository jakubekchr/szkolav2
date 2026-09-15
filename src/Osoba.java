
public abstract class Osoba {
    private String imie;
    private int wiek;

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public Osoba(String imie) {
        this.imie = imie;
        wiek = 0;

    }

    public Osoba(String imie,int wiek) {
        this.wiek = wiek;
        this.imie = imie;
    }
}
