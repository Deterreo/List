import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> people = Arrays.asList(
                "Philip J. Fry",
                "Turanga Leela",
                "Bender Bending Rodriguez",
                "Hubert Farnsworth",
                "Hermes Conrad",
                "John D. Zoidberg",
                "Amy Wong"
        );

        int a = people.indexOf("a");

        String peopleString = String.join("; ", people);
        System.out.println(peopleString.toUpperCase());

        System.out.println("A : " + a);
    }
}

