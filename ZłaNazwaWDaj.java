package formuly;

public class ZłaNazwaWDaj extends Exception {

    public ZłaNazwaWDaj(char e) {
        super("Zła nazwa w daj" + e);
    }
}
