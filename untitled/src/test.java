import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        IntStream.range(10, 15).forEach(i -> System.out.println(i + 1));
    }
}
