import java.util.List;
import java.util.stream.Collectors;

public class StreamQuizz {

  public static void main(String[] args) {
    List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");

    List<String> sortedResult = names.stream().sorted().toList();

    long count = names.stream().filter(name -> name.startsWith("y")).count();

    boolean hasYamada = names.stream().anyMatch(name -> name.equals("yamada"));

    names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
  }
}
