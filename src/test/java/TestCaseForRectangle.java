import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCaseForRectangle {
    @Test
    void AreaofRectangle() {
        Rectangle rect = new Rectangle(2, 4);
        int expectedSol = 8;
        int actualSol = rect.area();
        assertEquals(expectedSol, actualSol);
    }

    @Test

    void PerimeterofRectangle() {
        Rectangle rectangle = new Rectangle(2, 4);
        int expectedoutcome = 12;
        int actualoutcome = rectangle.perimeter();
        assertEquals(expectedoutcome, actualoutcome);
    }

}
