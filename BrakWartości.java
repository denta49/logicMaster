package formuly;

public class BrakWartości extends Exception {

    public BrakWartości(char e) {
        super("Brak wartości dla:" + "'" + e + "'");
    }
}
