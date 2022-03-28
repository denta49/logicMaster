package formuly;

public abstract class Formuła {

    @Override
    public abstract String toString();

    public String wartość(Wartościowanie wart) throws ZłaNazwaWDaj, BrakWartości {
        return "";
    }
}
