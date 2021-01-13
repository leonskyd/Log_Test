package org.geekbrains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)

public class MassTest {
    private int a;
    private int b;
    private int c;
    Calculator calculator;

    public MassTest(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object [][] {
                {4,2,3}, {14,2,12},{8,2,6},{-50,25,-75},{0,-2,2} // параметры попадают в конструктор
                // на места a,b,c
        });
    }

    @Before // общее для всех тестов
    public void init() {
        calculator = new Calculator();
        System.out.println("Before here is made a calculator");
    }


    @Test
    public void test() {
        Assert.assertEquals(a,calculator.Sum(b,c));
    }
}
