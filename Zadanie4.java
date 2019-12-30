import javax.swing.*;
import java.util.Scanner;

public class Zadanie4 {
    /*.
1. Sprawdź, czy wprowadzona przez użytkownika liczba jest pierwsza (0 i 1 nie są pierwsze, 2 jest liczbą pierwszą, dalej standardowa definicja). Do sprawdzenia użyj prostego algorytmu sprawdzającego,
czy liczba dzieli się przez wszystkie liczby mniejsze od jej połowy. Jeśli dzieli się przez którąkolwiek, nie jest pierwsza.

2. Użytkownik wprowadza 3 liczby od 1 do 100. Wydrukuj je w kolejności rosnącej.

3. Stwórz system do obliczania punktów. Użytkownik wprowadza po kolei 3 ilości, punkty za styl, punkty za efekty i punkty ze rezultat. Punkty za styl pomnóż przez 0.2, punkty za efekty przez 0.3,
a punkty za rezultat przez 0.5 i wydrukuj sumę tych działań.

4. Zadanie po angielsku. Stwórz system do robienia wizytówek. Odpytaj użytkownika o imię (name), nazwisko (surname), numer telefonu (telephone w typie int). Następnie wydrukuj to w ładny sposób,
tzn ramka i może jakieś efekty, wedle woli i chęci.

5. Pobierz od użytkownika dowolny tekst, następnie pobierz liczbę. Następnie spytaj, czy wydrukować dany tekst. W zależności od odpowiedzi, 1 oznacza tak, 2 oznacza nie, wykonaj zadanie ,
tzn. wydrukuj tyle razy, jaką liczbę podał użytkownik. Jeśli użytkownik wpisze coś innego niż 1 lub 2, wypisz „nie zrozumiałem, wybierz odpowiedź jeszcze raz”.
     */

    public static void main(String[] args) {
        1.

        int liczba;
        Scanner scaner = new Scanner(System.in);
        liczba = scaner.nextInt();
        int limit = liczba/2;

        if(liczba == 0){
            System.out.println("Nie jest liczbą pierwszą");
        }
        else if (liczba == 1){
            System.out.println("Nie jest liczbą pierwszą");
        }
        else if (liczba == 2||liczba == 3) {
            System.out.println("Jest liczbą pierwszą");
        }
        else {
            for(int i=1; i < limit; i++){
                if(liczba%i==0){
                    System.out.println("Nie Jest liczbą pierwszą");
                }
                else
                    System.out.println("Jest liczbą pierwszą");
                break;
            }

        }


       2.
         int l1,l2,l3;
         int liczba1 = 0;
         int liczba2 = 0;
         int liczba3 = 0;


         Scanner scanner = new Scanner(System.in);
         l1 = scanner.nextInt();
         l2 = scanner.nextInt();
         l3 = scanner.nextInt();

         if(l1>l2 && l1>l3){
             liczba1=l1;
             if(l2>l3) {
                 liczba2 = l2;
                 liczba3 = l3;
             }
             if(l3>l2) {
                 liczba2 = l3;
                 liczba3 = l2;
             }
         }

        if(l2>l1 && l2>l3){
            liczba1=l2;
            if(l1>l3) {
                liczba2 = l1;
                liczba3 = l3;
            }
            if(l3>l1) {
                liczba2 = l3;
                liczba3 = l1;
            }
        }

        if(l3>l2 && l3>l1){
            liczba1=l3;
            if(l2>l3) {
                liczba2 = l2;
                liczba3 = l1;
            }
            if(l3>l2) {
                liczba2 = l3;
                liczba3 = l1;
            }
        }

         System.out.println(liczba3 + " " + liczba2 + " " + liczba1);


        3.

        int styl;
        int efekty;
        int rezultat;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź punkty za styl");
        styl = scanner.nextInt();
        System.out.println("Wprowadź punkty za efekty");
        efekty = scanner.nextInt();
        System.out.println("Wprowadź punkty za rezulat");
        rezultat = scanner.nextInt();

        double x = styl*0.2 + efekty*0.3 + rezultat*0.5;
        double suma = x;
        System.out.println("Suma twoich punktów wynosi " + suma);

        4.

        String name;
        String surname;
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the name");
        name = scanner.next();
        System.out.println("Give me the surname");
        surname = scanner.next();
        System.out.println("Give me the number");
        number = scanner.nextInt();

        System.out.println("---------------");
        System.out.println("NAME:     " + name);
        System.out.println("SURNAME:  " + surname);
        System.out.println("NUMBER:   " + number);
        System.out.println("---------------");

        5.

        String text;
        int number;
        int wybór;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj jakis text");
        text = scanner.next();
        System.out.println("Podaj jakaś liczbę");
        number = scanner.nextInt();
        System.out.println("Jeśli chcesz wydrukowac dany tekst daną liczbę razy wciśnij 1, jeśli nie chcesz nic wydrukowac wciśnij 2");
        wybór = scanner.nextInt();

        switch (wybór){
            case 1:
                for(int i=0;i<number;i++)
                System.out.println(text);
                break;
            case 2:
                break;
            default:
                System.out.println("nie rozumiem, wybierz jeszcze raz");
        }


    }
}
