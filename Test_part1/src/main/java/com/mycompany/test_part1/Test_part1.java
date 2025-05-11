import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Test_part1 {
    public static void main(String[] args) {
        // Create a List of Integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Use AtomicInteger to hold the sum (since lambda requires effectively final variables)
        AtomicInteger sum = new AtomicInteger(0);

        // Use stream to filter even numbers and calculate sum
        numbers.stream()
               .filter(n -> n % 2 == 0) // Filter even numbers
               .forEach(n -> sum.addAndGet(n)); // Add to sum

        // Print the result
        System.out.println("Sum of even numbers: " + sum.get());
    }
}