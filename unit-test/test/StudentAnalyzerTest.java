import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {

    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    // Test countExcellentStudents

    @Test
    void testCountExcellentStudents_NormalCase() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0, 8.0, 10.0);
        assertEquals(4, analyzer.countExcellentStudents(scores));
    }

    @Test
    void testCountExcellentStudents_EmptyList() {
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    void testCountExcellentStudents_AllInvalid() {
        List<Double> scores = Arrays.asList(-0.1, 10.1, null);
        assertEquals(0, analyzer.countExcellentStudents(scores));
    }


    @Test
    void testCountExcellentStudents_BoundaryValues() {
        List<Double> scores = Arrays.asList(0.0, 8.0, 10.0, 7.999, 8.0001);
        assertEquals(3, analyzer.countExcellentStudents(scores)); // 8.0, 10.0, 8.0001
    }

    // Test calculateValidAverage

    @Test
    void testCalculateValidAverage_NormalCase() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        // Chỉ tính 9.0 + 8.5 + 7.0 = 24.5 / 3 ≈ 8.166...
        assertEquals(8.1667, analyzer.calculateValidAverage(scores), 0.01);
    }

    @Test
    void testCalculateValidAverage_EmptyList() {
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.0001);
    }

    @Test
    void testCalculateValidAverage_AllInvalid() {
        List<Double> scores = Arrays.asList(-5.0, 12.0, null);
        assertEquals(0.0, analyzer.calculateValidAverage(scores), 0.0001);
    }

    @Test
    void testCalculateValidAverage_BoundaryValues() {
        List<Double> scores = Arrays.asList(0.0, 10.0, 5.0);
        assertEquals(5.0, analyzer.calculateValidAverage(scores), 0.0001);
    }

    @Test
    void testCalculateValidAverage_SingleValid() {
        assertEquals(7.5, analyzer.calculateValidAverage(Arrays.asList(7.5)), 0.0001);
    }
}