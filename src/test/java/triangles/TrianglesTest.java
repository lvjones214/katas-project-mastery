package triangles;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TrianglesTest {
    @Test
    public void threeEqualSidesIsAnEquilateralTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(3, 3, 3);
        assertThat(triangleType, is("Equilateral"));
    }
    @Test
    public void twoEqualSidesIsAnIsoscelesTriangle(){
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(5, 5, 3);
        assertThat(triangleType, is("Isosceles"));
    }
    @Test
    public void isARightTriangle(){
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(3, 4, 5);
        assertThat(triangleType, is("Right"));
    }
    @Test
    public void isATriangleThatIsNotOneOfTheAboveTypes(){
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(2,3,4);
        assertThat(triangleType, is("Triangle"));
    }
    @Test
    public void isNotATriangle(){
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(2,3,5);
        assertThat(triangleType, is("Not A Triangle"));
    }
}
