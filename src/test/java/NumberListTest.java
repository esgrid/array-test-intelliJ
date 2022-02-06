import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NumberListTest {


    private NumberList myNumbers;

    @Before
    public void before(){
        // step 1 - before adding what's below the line below
//        myNumbers = new NumberList();
        ArrayList<Integer> testNumbers = new ArrayList<>();
        testNumbers.add(1);
        testNumbers.add(2);
        testNumbers.add(3);
        testNumbers.add(4);
        myNumbers = new NumberList(testNumbers);
    }

    @Test
    public void hasNumberOfEntries(){
//        assertEquals(0, myNumbers.getNumberCount());
        assertEquals(4, myNumbers.getNumberCount());
    }

    @Test
    public void canAddNumberToList(){
        myNumbers.addNumber(12);
//        assertEquals(1, myNumbers.getNumberCount());
        assertEquals(5, myNumbers.getNumberCount());
    }

    @Test
    public void canGetFirstNumber(){
//        myNumbers.addNumber(8);
//        assertEquals(8, myNumbers.getNumberAtIndex(0));
        assertEquals(1, myNumbers.getNumberAtIndex(0));
    }

    @Test
    public void canGetTotal(){
//        myNumbers.addNumber(1);
//        myNumbers.addNumber(2);
//        myNumbers.addNumber(3);
//        myNumbers.addNumber(4);
        assertEquals(10, myNumbers.getTotal());

    }

    @Test
    public void canGetTotal2(){
        assertEquals(10, myNumbers.getTotal2());
    }

}
