import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
public class Testing {



    Program current_year;
    @BeforeEach
    public void setup(){
        current_year = new Program();
    }


    @Test
    public void is_leap_year(){
        assertEquals(true, current_year.Leap_Year(2000));
    }
    @Test
    public void Divisible_by_400(){
        assertEquals(true, current_year.Leap_Year(2000));
    }

    @Test
    public void not_divisble_by_4(){
        assertEquals(false, current_year.Leap_Year(2021));
    }

    @Test
    public void divisble_by_100_not400(){
        assertEquals(false, current_year.Leap_Year(1700));
        assertEquals(false, current_year.Leap_Year(1800));
        assertEquals(false, current_year.Leap_Year(1900));
        assertEquals(false, current_year.Leap_Year(2100));
    }


}
