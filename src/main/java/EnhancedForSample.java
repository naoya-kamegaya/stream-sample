import java.util.ArrayList;
import java.util.List;

public class EnhancedForSample {

  public static void main(String[] args) {

    List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
    List<String> result = new ArrayList<>();

    for (String name : names) {
      if (name.contains("a")) {
        result.add(name);
      }
    }
  }
}
