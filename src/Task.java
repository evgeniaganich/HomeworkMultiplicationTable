import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Task {
    private int firstNumber;
    private int secondNumber;

    public Task(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public static Task getTasks(List<Integer> list) {
        Random random = new Random();
        int firstNumber = random.nextInt(list.size())+2;
        int secondNumber = random.nextInt(list.size())+2;
        Task task = new Task(firstNumber, secondNumber);
        return task;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return firstNumber == task.firstNumber && secondNumber == task.secondNumber || secondNumber == task.firstNumber && firstNumber == task.secondNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNumber, secondNumber);
    }

    @Override
    public String toString() {
        return firstNumber + "*" + secondNumber;

    }
}
