import java.util.Arrays;

public class QueueExercise implements QueueInterface {

    private int elementCount;
    private int[] array;

    public QueueExercise(int arraySize) {
        this.array = new int[arraySize];
        this.elementCount = 0;
    }

    @Override
    public void displayQueueMessage() {
        System.out.println("Queue Interface check");
    }
    @Override
    public void add(int value) {
        int dest[] = array;

        if (elementCount == array.length) {
            int[] newArray = new int[array.length + 1];
            dest = newArray;
        }

        for (int i = elementCount; i > 0; i--) {
            dest[i] = array[i - 1];
        }
        dest[0] = value;
        array = dest;
        elementCount++;

        System.out.println(Arrays.toString(array));
    }

    public void remove() {
        int[] newArray = new int[array.length - 1];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        elementCount--;
        System.out.println(Arrays.toString(array));
    }

    public int getElementCount() {

        return elementCount;
    }

    public int addValues (int a, int b) {
        return a + b;
    }
}





