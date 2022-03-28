package formuly;

public class Lub extends Formuła {

    protected Formuła arg1, arg2;

    public Lub(Formuła a, Formuła b) {
        this.arg1 = a;
        this.arg2 = b;
    }

    public String wartość(Wartościowanie war1) throws BrakWartości, ZłaNazwaWDaj {

        if (arg1.wartość(war1) == "Prawda" || arg2.wartość(war1) == "Prawda") {
            return "Prawda";
        }
        return "Fałsz";
    }

    @Override
    public String toString() {

        return "(" + arg1 + ")" + "lub" + "(" + arg2 + ")";
    }
}
