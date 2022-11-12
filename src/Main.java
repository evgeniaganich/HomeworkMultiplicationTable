import java.util.*;

public class Main {

    public static void main(String[] args) {

        //task multiplicationTable

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        Set<Task> tasks = new HashSet<>(15);
        tasks.add(Task.getTasks(numbers));
        while (tasks.size() < 15) {
            if (!tasks.contains(Task.getTasks(numbers))) {
                tasks.add(Task.getTasks(numbers));
            }
        }

        System.out.println(tasks);

        //task RemoveAllEvenNumbers

        HashSet<Integer> randomNumbers = new HashSet<>(20);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randomNumbers.add(random.nextInt(1001));
        }
        System.out.println(randomNumbers);

        removeAllNonEvenNumbers(randomNumbers);

        System.out.println(randomNumbers);
    }

    public static HashSet<Integer> removeAllNonEvenNumbers(HashSet<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer text = iterator.next();
            if (text % 2 != 0) iterator.remove();
        }
        return set;
    }

    public int getRandomNumber() {
        int a = 2 + (int) (Math.random() * 10);
        return a;
    }

}