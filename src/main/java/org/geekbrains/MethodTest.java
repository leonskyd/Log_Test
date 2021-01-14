package org.geekbrains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class MethodTest {

    private int [] arg;
    private int [] res;
    Calculator calc;

    public MethodTest(int[] res, int[] arg) {
        this.res = res;
        this.arg = arg;
    }

    @Parameterized.Parameters

    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1,2,3,5}, new int[]{4,1,2,3,5}},
                {new int[]{12,21,105,11,12}, new int[]{1,4,7,55,44,4,12,21,105,11,12}},
                {new int[0], new int[]{1,4,7,55,44,4,12,21,105,11,4}},
                {new int[0], new int[]{1,7,55,44,12,21,105,11,12}},
        });
    }

    @Before
    public void init() {
        calc = new Calculator();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(res,calc.arrAfterFour(arg));
    }
}
