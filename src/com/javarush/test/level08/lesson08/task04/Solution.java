package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Chan", new Date("JULY 1 1980"));
        map.put("Arni", new Date("AUGUST 1 1980"));
        map.put("Villis", new Date("OCTOBER 1 1980"));
        map.put("Boris", new Date("MARCH 1 1980"));
        map.put("Stethem", new Date("APRIL 1 1980"));
        map.put("Bond", new Date("SEPTEMBER 1 1980"));
        map.put("Bill", new Date("NOVEMBER 1 1980"));
        map.put("Dgon", new Date("DECEMBER 1 1980"));
        map.put("Michel", new Date("JUNE 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        for(Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Date> entry = it.next();
            if(entry.getValue().getMonth() == 5|| entry.getValue().getMonth() ==6 || entry.getValue().getMonth() ==7 ) {
                it.remove();
            }
        }
    }
}
