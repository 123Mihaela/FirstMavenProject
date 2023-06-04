import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercises {
    public static void main(String[] args) {
        @@ -13,6 +14,17 @@ public static void main(String[] args) {
            new Citizen("Pete", 45, "artist", false)
        );

            Stream<Citizen> stream1 = citizens.stream();
            stream1 = stream1.filter(citizen -> {
                System.out.println(citizen.name());
                return true;
            });
            Stream<String> stream = stream1.map(Citizen::name);
            stream = stream.skip(1);
            stream = stream.limit(2);
            System.out.println("Will call final operation");
            stream.count();

            List<Citizen> result = citizens.stream().filter(citizen -> citizen.age() > 40).toList();
            System.out.println(result);