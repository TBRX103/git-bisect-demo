import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MathLibTest {

    private MathLib underTest;

    @BeforeMethod
    public void setUp() {
        underTest = new MathLib();
    }

    @Test()
    public void test_addition() {
        Assert.assertEquals( 2, underTest.addNumbers( 1, 1 ) );
    }

    @Test()
    public void test_subtraction() {
        Assert.assertEquals( 309, underTest.subtractNumbers( 375, 66 ) );
    }

    @Test()
    public void test_multiplication() {
        Assert.assertEquals( 36, underTest.multiplyNumbers( 12, 3 ) );
    }

    @Test()
    public void test_division() {
        Assert.assertEquals( 50, underTest.divideNumbers( 100, 2 ) );
    }

    @Test()
    public void test_division2() {
        Assert.assertEquals( 12, underTest.divideNumbers( 24, 2 ) );
    }
}
