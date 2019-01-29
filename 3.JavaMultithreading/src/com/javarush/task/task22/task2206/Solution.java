package com.javarush.task.task22.task2206;

import java.util.Date;

/* 
Форматирование даты
*/
public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(String.format(getFormattedString(), date, date, date, date, date, date));
        //должен быть вывод аналогичный следующему
        //31:10:13 15:59:59 - dd:MM:yy hh:mm:ss
    }

    public static String getFormattedString() {
        return "%te:%tB:%tY %tH:%tM:%tS";
    }
}