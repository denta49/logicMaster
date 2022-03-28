package formuly;

public class Zmienna extends Formuła {

    private char b;

    public Zmienna(char a)  {

        b = a;
    }

    @Override
    public String toString() {
        return Character.toString(b);
    }

    public String wartość(Wartościowanie war1) throws BrakWartości, ZłaNazwaWDaj {
        return war1.daj(b);
    }
}
