package org.geekbrains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HomeworkTest {

    Calculator calc;

    @Before
    public void init() {
        calc = new Calculator();
        System.out.println("Here is made new Calculator");
    }

    @Test ()
    public void test1 () {
        Assert.assertEquals(true,calc.OneAndFour(new int[]{1, 1, 1, 1, 4, 4, 4, 4}));
    }
    @Test
    public void test2 () {
        Assert.assertEquals(false,calc.OneAndFour(new int[]{1, 1, 2, 1, 4, 4, 4, 4}));
    }
    @Test
    public void test3 () {
        Assert.assertEquals(false,calc.OneAndFour(new int[]{1, 1, 1, 1}));
    }

}
