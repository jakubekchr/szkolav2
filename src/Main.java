//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Uczen uczen = new Uczen("Jas",8);

        System.out.println(uczen);
        Nauczyciel nauczyciel = new Nauczyciel("Jakub", "Muzyka");
        nauczyciel.wykonajDyzur();
        uczen.wykonajDyzur();
        Wychowaca wychowaca = new Wychowaca("Tadzio","matematyki");
        Uczen uczen1 = new Uczen("Jas",10);
        Uczen uczen2 = new Uczen("Jakubek",15);
        Uczen uczen3 = new Uczen("Nowacki", 69);
        Uczen uczen4 = new Uczen("Marek", 23);
        Uczen uczen5 = new Uczen("Marcekl" , 12);
        Uczen uczen6 = new Uczen("DSA", 123);
        Klasa klasa1p = new Klasa("1p",wychowaca);
        klasa1p.dodajucznia(uczen1);
        klasa1p.dodajucznia(uczen2);
        klasa1p.dodajucznia(uczen3);
        klasa1p.dodajucznia(uczen4);
        klasa1p.dodajucznia(uczen5);
        klasa1p.dodajucznia(uczen6);

        klasa1p.wypiszinfo();
    }
}