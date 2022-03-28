package formuly;

public class Neg extends Formuła {

    protected Formuła arg1;

    public Neg(Formuła a) {
        this.arg1 = a;
    }

    public String wartość(Wartościowanie war1) throws BrakWartości, ZłaNazwaWDaj {

        if (arg1.wartość(war1) == "Prawda") {
            return "Fałsz";
        }
        return "Prawda";
    }

    @Override
    public String toString() {
        return "neg" + "(" + arg1 + ")";
    }
}