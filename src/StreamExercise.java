import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employe {
    private String name;
    private int salary;

    public Employe(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class StreamExercise {

    public static void main(String[] args) {

        List<Employe> employes = Arrays.asList(
                new Employe("Alice", 50000),
                new Employe("Bob", 70000),
                new Employe("David", 60000),
                new Employe("John", 80000)
        );

        List<Employe> result = employes.stream()
                .filter(e -> e.getSalary() > 60000)
                .collect(Collectors.toList());

        for (Employe e : result) {
            System.out.println(e.getName() + " - " + e.getSalary());
        }
    }
}