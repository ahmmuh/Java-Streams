package se.codeanytime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<String> empt = Stream.empty();
        Stream<Integer> integerStream = Stream.of(2);
        Stream<Double> doubleStream = Stream.of(2.3);
        List<String> listStream = Arrays.asList("a", "v", "v");
        Stream<String> fromList = listStream.stream();
        Stream<Integer> numbers = Stream.iterate(0,n -> n + 1);
        Stream<Integer> ngr = Stream.generate(() -> new Random().nextInt());
        List<String> words = Arrays.asList("I" ,"love", "programming");
        String jumlo = words.stream()
                .reduce("",(s1,s2) -> s1 + " " + s2);

        System.out.println(jumlo);

        List<String> characters = Arrays.asList("Collect" ,"Is", "Useful");

        StringBuilder stringBuilder = characters.stream()
                .collect(StringBuilder::new,StringBuilder::append,StringBuilder::append);

        System.out.println(stringBuilder);

    }
}
