package formuly;

public class ZłaNazwaWUstaw extends Exception {

    public ZłaNazwaWUstaw(char e) {
        super("Niepoprawna nazwa:" + "'" + e + "'");
    }
}
