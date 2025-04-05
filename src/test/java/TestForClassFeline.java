import com.example.Feline;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;


public class TestForClassFeline {

    Feline feline = new Feline();

    @Test
    public void eatMeatReturnsListFoodTest() throws Exception {
        List<String> listFood = feline.eatMeat();
        String actual = String.join(", ", listFood);
        String expected = "Животные, Птицы, Рыба";
        MatcherAssert.assertThat(actual, containsString(expected));
    }

    @Test
    public void getFamilyReturnsFelineTest() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensWithoutArgumentReturns1Test(){
        int actual = feline.getKittens();
        assertEquals(1, actual);
    }
}

