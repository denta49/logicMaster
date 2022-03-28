package formuly;

public class Test {
    public void test(Formuła f) {
        System.out.println("formuła = " + f + ": ");

        Wartościowanie wart0 = new Wartościowanie();
        Wartościowanie wart1 = new Wartościowanie();
        Wartościowanie wart2 = new Wartościowanie();
        Wartościowanie wart3 = new Wartościowanie();
        Wartościowanie wart4 = new Wartościowanie();
        try {
            wart1.ustaw('p', new Prawda());
            wart1.ustaw('q', new Fałsz());
            wart2.ustaw('p', new Fałsz());
            wart2.ustaw('q', new Prawda());
            wart3.ustaw('p', new Fałsz());
            wart3.ustaw('q', new Fałsz());
            wart4.ustaw('p', new Prawda());
            wart4.ustaw('q', new Prawda());

            // Poniżej próba podania złej nazwy
            wart1.ustaw('*', new Prawda());
        } catch (ZłaNazwaWUstaw źle) {
            System.out.println("  Wyjątek: " + źle);  // Ten wyjątek powinien raz wystąpić
        }

        try {
            System.out.println("  przy wartościowaniu: " + wart1 + " ma wartość: " + f.wartość(wart1));
            System.out.println("  przy wartościowaniu: " + wart2 + " ma wartość: " + f.wartość(wart2));
            System.out.println("  przy wartościowaniu: " + wart3 + " ma wartość: " + f.wartość(wart3));
            System.out.println("  przy wartościowaniu: " + wart4 + " ma wartość: " + f.wartość(wart4));
            System.out.println("  przy wartościowaniu: " + wart0 + " ma wartość: " + f.wartość(wart0));
        }catch (ZłaNazwaWDaj źle) {

            System.out.println("  Wyjątek: " + źle);  // ten wyjątek nie powinien wystąpić dla formuł niemających innych zmiennych niż p czy q
        }catch (BrakWartości źle) {
            System.out.println("  Wyjątek: " + źle);  // ten wyjątek powinien wystąpić dla wartościowania wart0, jeśli formuła zawiera zmienne p lub q
        }
    }

    public static void main(String[] args)  {
        System.out.println("--- Początek testów formuł ---");
        Test t = new Test();

        // tworzenie pomocniczych formuł
        Formuła tt = new Prawda();
        Formuła ff = new Fałsz();
        Formuła pp = new Zmienna('p');
        Formuła qq = new Zmienna('q');

        // testy
        t.test(tt);
        t.test(new Neg(ff));
        t.test(qq);
        t.test(new Oraz(pp, qq));
        t.test(new Lub(pp, qq));
        t.test(new Oraz(pp, new Lub(new Neg(qq), ff)));
        t.test(new Lub(pp, new Neg(pp)));

        System.out.println("--- Koniec testów formuł ---");
    }
}