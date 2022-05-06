import java.util.ArrayList;
import java.util.List;

public class SimpleForSample {

  public static void main(String[] args) {

    List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
    List<String> result = new ArrayList<>();

    for (int i = 0; i < names.size(); i++) {
      if (names.get(i).contains("a")) {
        result.add(names.get(i));
      }
    }
  }
}
