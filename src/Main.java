import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of(1,3,6,3,345,78,9,3).map(a->a*a).forEach(System.out::println);
        Stream.of(10,20,30,40,50,60,70,80,90,100).map(a->a/10).forEach(System.out::println);
        Stream.of("Юля","Эля").map(b->b+" "+b).forEach(System.out::println);
    }
}