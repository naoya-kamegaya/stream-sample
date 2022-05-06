import java.util.List;
import java.util.stream.Collectors;

public class StreamSample {

  public static void main(String[] args) {
    List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
    List<String> result = names.stream()
        .filter(name -> name.contains("a"))
        .collect(Collectors.toList());
  }
}
