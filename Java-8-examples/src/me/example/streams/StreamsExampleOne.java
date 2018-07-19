package me.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExampleOne {

    public static void main(String args[]) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        long count = strings.stream().filter(string->string.isEmpty()).count();

        System.out.println(count);

        count = strings.stream().filter(string -> string.length() == 3).count();
        System.out.println(count);

        List<String> filtered = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);

        String mergedString = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println(mergedString);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        //get list of square of distinct numbers
        List<Integer> squaresList = getSquares(numbers);
        squaresList = numbers.stream().map( i ->i*i).distinct().collect(Collectors.toList());
        System.out.println("Squares List: " + squaresList);
    }

    private static List<Integer> getSquares(List<Integer> numbers) {
        List<Integer> squaresList = new ArrayList<>();

        for(Integer number: numbers) {
            Integer square = new Integer(number.intValue() * number.intValue());

            if(!squaresList.contains(square)) {
                squaresList.add(square);
            }
        }
        return squaresList;
    }
}
