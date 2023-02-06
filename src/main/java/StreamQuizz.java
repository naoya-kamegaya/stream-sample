import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuizz {

  public static void main(String[] args) {
    List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");

    System.out.println("▼sortedの引数なし");
    List<String> sortedResult = names.stream().sorted().toList();
    System.out.println(sortedResult);

    System.out.println("▼昇順");
    sortedResult = names.stream().sorted(Comparator.naturalOrder()).toList();
    System.out.println(sortedResult);

    System.out.println("▼降順");
    sortedResult = names.stream().sorted(Comparator.reverseOrder()).toList();
    System.out.println(sortedResult);

    System.out.println("▼文字数昇順");
    sortedResult = names.stream().sorted(Comparator.comparingInt(String::length)).toList();
    System.out.println(sortedResult);

    System.out.println("▼文字数降順");
    sortedResult = names.stream().sorted(Comparator.comparingInt(String::length).reversed()).toList();
    System.out.println(sortedResult);

    System.out.println("▼yで始まる名前の数");
    long countStartsWithY = names.stream().filter(name -> name.startsWith("y")).count();
    System.out.println(countStartsWithY);

    System.out.println("▼aで終わる名前の数");
    long countEndsWithA = names.stream().filter(name -> name.endsWith("a")).count();
    System.out.println(countEndsWithA);

    System.out.println("▼yamadaさんはいるか？");
    boolean hasYamada = names.stream().anyMatch(name -> name.equals("yamada"));
    System.out.println(hasYamada);

    System.out.println("▼satoさんはいないか？");
    boolean hasSato = names.stream().noneMatch(name -> name.equals("sato"));
    System.out.println(hasSato);

    System.out.println("▼toUpperCase() ラムダ式");
    System.out.println(names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList()));
    System.out.println("▼toUpperCase() メソッド参照");
    System.out.println(names.stream().map(String::toUpperCase).collect(Collectors.toList()));
  }
}
