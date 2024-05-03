import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(7, 2, 9, 4, 6, 1, 10, 8, 5, 3);

        // Step 1: Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println("Step 1 - Even numbers: " + evenNumbers);

        // Step 2: Double each number
        List<Integer> doubledNumbers = numbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());
        System.out.println("Step 2 - Doubled numbers: " + doubledNumbers);

        // Step 3: Sort the list
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Step 3 - Sorted numbers: " + sortedNumbers);

        // Step 4: Calculate the sum of all numbers
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Step 4 - Sum of all numbers: " + sum);

        // Step 5: Output each processed number
        System.out.println("Step 5 - Output each processed number:");
        numbers.stream()
                .forEach(number -> System.out.println(number * 2));

        // Step 6: Collect the processed numbers into a new list
        List<Integer> processedNumbers = numbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());
        System.out.println("Step 6 - Processed numbers: " + processedNumbers);

    }
}