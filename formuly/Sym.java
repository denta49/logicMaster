package formuly;

public class Sym extends Formuła {

    protected Formuła arg1, arg2;

    public Sym(Formuła a, Formuła b) {
        this.arg1 = a;
        this.arg2 = b;
    }

    public String wartość(Wartościowanie war1) throws BrakWartości, ZłaNazwaWDaj {

        if (arg1.wartość(war1) != arg2.wartość(war1)) {
            return "Prawda";
        }
        return "Fałsz";
    }

    @Override
    public String toString() {

        return "(" + arg1 + ")" + "impl" + "(" + arg2 + ")";
    }
}
