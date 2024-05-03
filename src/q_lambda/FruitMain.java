package q_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FruitMain {
    public static void main(String[] args) {
        Arrays.asList(
                new Fruit("사과", 3000),
                new Fruit("사과", 4000),
                new Fruit("사과", 5000),
                new Fruit("포도", 6000),
                new Fruit("바나나", 3000)
        );
    }

    private static List<Fruit> filterFruits(List<Fruit> fruits, Predicate<Fruit> fruitFilter) {
        return fruits.stream().filter(fruitFilter).toList();
    }
}
