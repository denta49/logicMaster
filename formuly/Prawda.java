package formuly;

public class Prawda extends Formuła {

    private String var;

    public Prawda() {
        var = "Prawda";
    }

    @Override
    public String toString() {

        if (var == "Prawda")
            return "Prawda";

        return "Fałsz";
    }

    public String wartość(Wartościowanie wart2) {
        return "Prawda";
    }
}
