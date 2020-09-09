import org.junit.*;

import static org.junit.Assert.*;

public class CalculationTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("before class");
    }
    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }

    @Test
    public void testFindMax(){
        System.out.println("test case find max");
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
        assertEquals(-2,Calculation.findMax(new int[]{-12,-3,-4,-2}));
    }
    @Test
    public void testCube(){
        System.out.println("test case cube");
        assertEquals(27,Calculation.cube(3));
    }
    @Test
    public void testReverseWord(){
        System.out.println("test case reverse word");
        assertEquals("ym eman si nahk",Calculation.reverseWord("my name is khan"));
    }

    @Ignore("Not yet implemented")
    @Test
    public void testGetAmount() {
        fail("@Ignore method will not run by JUnit4");
    }
    @Test(timeout = 500)
    public void testTimeout() {
        System.out.println("@Test(timeout) can be used to enforce timeout in JUnit4 test case");
        Calculation.funinfinite();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("after class");
    }
}
