import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;


    @RunWith(Parameterized.class)

    public class FelineGetKittensWithArgumentParameterisedTest {

        private final int kittensCount;

        Feline feline = new Feline();

        public FelineGetKittensWithArgumentParameterisedTest(int kittensCount) {
            this.kittensCount = kittensCount;
        }

        @Parameterized.Parameters
        public static Object[][] getKittensCountData() {
            return new Object[][]{
                    {1},
                    {5},
            };
        }

        @Test
        public void getKittensWithArgumentReturnsKittensCountTest(){
            int actual = feline.getKittens(kittensCount);
            assertEquals(kittensCount, actual);
        }
    }

