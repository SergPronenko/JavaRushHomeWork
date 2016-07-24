package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу
«Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
       HashMap<String,String> map = new HashMap<String, String>();
        map.put("f1", "Djustin");
        map.put("f2", "Peter");
        map.put("f3", "Djon");
        map.put("f4", "Lois");
        map.put("f5", "Mikl");
        map.put("f6", "Lessy");
        map.put("f7", "Vladimir");
        map.put("f8", "Petr");
        map.put("f9", "Vladimir");
        map.put("f10", "Balbes");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int na = 0;
        for (Map.Entry<String,String> n : map.entrySet())
            if (n.getValue().equals(name)) na++;
        return na;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int la = 0;
        for (Map.Entry<String, String> n : map.entrySet())
            if (n.getKey().equals(lastName)) la++;
        return la;

    }
}
