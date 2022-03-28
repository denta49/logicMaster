package formuly;

public class Fałsz extends Formuła {

    private String var;

    public Fałsz() {
        var = "Fałsz";
    }

    @Override
    public String toString() {

        if (var == "Fałsz")
            return "Fałsz";

        return "Prawda";
    }

    public String wartość(Wartościowanie wart1) {
        return "Fałsz";
    }
}
