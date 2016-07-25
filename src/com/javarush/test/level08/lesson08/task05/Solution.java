package com.javarush.test.level08.lesson08.task05;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (String value: copy.values()){
            if (Collections.frequency(copy.values(), value) > 1){
                removeItemFromMapByValue(map, value);
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
