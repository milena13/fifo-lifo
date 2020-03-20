import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueExerciseTest {

    @Test
    public void test () {
        System.out.println("Check One, Two!");
    }

    @Test
    public void shouldAddValues() {
        QueueExercise test = new QueueExercise(0);
        int expectedValue = 5;
        int actualValue = test.addValues(2,3);

        assertEquals(expectedValue, actualValue);
    }


 /*   @Test
    void shouldAddOneToArray() {
        QueueExercise queueTest = new QueueExercise();
        int[] expectedArray = new int[70];
        assertArrayEquals(expectedArray, queueTest.add(50));
    }*/

    /*@Test
    void shouldRemoveOneFromArray() {
    }*/
}