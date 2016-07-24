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
        map.put("Griffin", "Djustin");
        map.put("Dior", "Peter");
        map.put("Dwayn", "Djon");
        map.put("Sarkisyan", "Lois");
        map.put("Jackson", "Mikl");
        map.put("Dimond", "Lessy");
        map.put("Putin", "Vladimir");
        map.put("Poroshenko", "Petr");
        map.put("Girinivskii", "Vladimir");
        map.put("Balbesovi4", "Balbes");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        Iterator<HashMap.Entry<String,String>> iterator = map.entrySet().iterator();
        int count = 0;
        for (Map.Entry<String,String> m: map.entrySet())
        {
            if (m.getValue().equals(name))
            {
                count++;
            }

        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        Iterator<HashMap.Entry<String,String>> iterator = map.entrySet().iterator();
        int count = 0;
        for (Map.Entry<String,String> m: map.entrySet()){
            if (m.getKey().equals(lastName)){
                count ++;
            }
        }
        return count;
    }
}
