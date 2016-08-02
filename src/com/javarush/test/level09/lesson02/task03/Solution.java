package com.javarush.test.level09.lesson02.task03;

/* Метод должен вернуть номер строки кода, из которого вызвали этот метод
Написать пять методов, которые вызывают друг друга. Метод должен вернуть
 номер строки кода, из которого вызвали этот метод. Воспользуйся функцией: element.getLineNumber().
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {
        method2();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2()
    {
        method3();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3()
    {
        method4();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4()
    {
        method5();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5()
    {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
