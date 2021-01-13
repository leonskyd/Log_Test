package org.geekbrains;

import org.junit.*;
import sun.util.resources.cldr.uz.CalendarData_uz_Latn_UZ;

public class CalcTest {

    Calculator calculator;

    @BeforeClass // например подключение к БД
    public static void globalInit () {
        System.out.println("Before Class");
    }

    @Before // общее для всех тестов
    public void init() {
        calculator = new Calculator();
        System.out.println("Before here is made a calculator");
    }

     @AfterClass // например отключение БД
     public static void globalFinish () {
         System.out.println("AfterClass");  }

    // ТЕСТОВАЯ ЧАСТЬ
    @Test
    public void testAdd() { //
        Assert.assertEquals(4,calculator.Sum(2,2));

    }

    @Test //(timeout = 500) // можно тестить на время

    public void testMult() {
        Assert.assertEquals(4,calculator.Mult(2,2));
    }

    @Test
    // @Ignore ("something is wrong") - тогда тест не будет производиться
    public void testDiv() {
        Assert.assertEquals(6,calculator.Dividing(6,1));
    }

    @Test(expected = ArithmeticException.class) // делим на ноль, ждем ошибки
    // @Ignore ("something is wrong") - тогда тест не будет производиться
    public void testDiv2() {
        calculator.Dividing(6,0);
    }


}
