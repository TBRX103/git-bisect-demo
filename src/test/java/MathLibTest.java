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
    public void test_basic_arithmetic() {
        Assert.assertEquals( 2, underTest.addNumbers( 1, 1 ) );
    }
}
