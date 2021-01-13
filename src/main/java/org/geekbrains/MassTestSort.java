package org.geekbrains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MassTestSort {

    private int [] a;
    private int [] b;
    Calculator calculator;


    public MassTestSort(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 5, 9}, new int[]{1, 9, 5}},
                {new int[]{2, 20, 93}, new int[]{93, 2, 12}},
        });
    }

    @Before // общее для всех тестов
    public void init() {
        calculator = new Calculator();
        System.out.println("Before here is made a calculator");
    }


    @Test
    public void test() {
        Assert.assertArrayEquals(a,calculator.sort(b));
    }
}
