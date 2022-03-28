package formuly;

public class Wartościowanie extends Formuła {

    private Formuła[] tab = new Formuła[26];

    private char a;

    public Wartościowanie() {

        for (int i = 0; i < tab.length; i++) {
            this.tab[i] = null;
        }
    }

    public void ustaw(char a, Formuła b) throws ZłaNazwaWUstaw {

        this.a = a;

        if (this.a < 'a' || this.a > 'z') {
            throw new ZłaNazwaWUstaw(a);
        }

        tab[this.a - 'a'] = b;
    }

    public String daj(char a) throws ZłaNazwaWDaj, BrakWartości {

        this.a = a;

        if (this.a < 'a' || this.a > 'z') {
            throw new ZłaNazwaWDaj(a);
        }

        if (tab[a - 'a'] == null) {
            throw new BrakWartości(a);
        }

        return tab[this.a - 'a'].wartość(this);
    }

    @Override
    public String toString() {

        String x;
        x = "";

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != null) {
                x += ((char) (i + 'a') + "=" + (tab[i]) + ",");
            }
        }
        return ("Wart(" + x + ")");
    }
}
