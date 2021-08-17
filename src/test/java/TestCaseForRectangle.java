import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCaseForRectangle {
    @Test
    void AreaofRectangle() {
        Rectangle rectangle = new Rectangle(2, 4);
        int expectedoutcome = 8;
        int actualoutcome = rectangle.area();
        assertEquals(expectedoutcome, actualoutcome);
    }

    @Test

    void PerimeterofRectangle() {
        Rectangle rectangle = new Rectangle(2, 4);
        int expectedoutcome = 12;
        int actualoutcome = rectangle.perimeter();
        assertEquals(expectedoutcome, actualoutcome);
    }

}
