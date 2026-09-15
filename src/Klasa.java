import java.util.ArrayList;

public class Klasa {
    private String nazwa;
    private ArrayList<Uczen> uczniowie;
    private  Wychowaca wychowaca;

    public Klasa(String nazwa, Wychowaca wychowaca) {
        this.nazwa = nazwa;
        this.wychowaca = wychowaca;
        uczniowie = new ArrayList<>();
    }
    //DODAJ UCZNIA DO KLASY
    public void dodajucznia(Uczen uczen){
        if(uczniowie.contains(uczen)){
            System.out.println("Uczen juz jest w klasie");
        }else {
            uczniowie.add(uczen);
        }

    }
    // USUN UCZNIA
    public void usunucznia(Uczen uczen){
        if(uczniowie.contains(uczen)){
            uczniowie.remove(uczen);
        }
        else  {
            System.out.println("Nie istnieje");
        }

    }

    // TO STRING WYPISANIE
    public void wypiszinfo(){
        System.out.println("Klasa: " + nazwa);
        System.out.println("Wychowawca: " + wychowaca);
        for (Uczen uczen:uczniowie){
            System.out.println("- "+ uczen);
        }
    }
    @Override
    public String toString() {
        return "Klasa{" +
                "nazwa='" + nazwa + '\'' +
                ", uczniowie=" + uczniowie +
                ", wychowaca=" + wychowaca +
                '}';
    }
}
