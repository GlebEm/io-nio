package task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.

Пример байт входного файла:
44 83 44

Пример вывода:
44 83


Requirements:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все уникальные байты из файла в порядке возрастания.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine()); //   C:/Users/Admin/Desktop/task1805.txt
        TreeSet<Integer> set = new TreeSet<>();

        while (fis.available()>0){
            set.add(fis.read());
        }
        for(int n : set){
            System.out.print(n+" ");
        }
        reader.close();
        fis.close();
    }
}
//        int first;
//        int last;
//        int count = 0;
//        ArrayList<Integer> list = new ArrayList<>();
//        while (fis.available() > 0) {
//            list.add(fis.read());
//        }
//        Collections.sort(list);
//        System.out.println(list);
//        if (list.get(0) != list.get(1)) {
//            System.out.print(list.get(0));  //проверил первый элемент списка на повторение
//        }
//        for (int i = 0; (i < list.size() - 1); i++) {
//            if ((list.get(i) != list.get(i + 1) && list.get(i) != list.get(i - 1))
//                    && (i > 0 && i < (list.size() - 1))) {
//                System.out.print(list.get(i));
//            }
//        }
//        if (list.get(list.size() - 1) != list.get(list.size() - 2)) {
//            System.out.print(list.get(list.size() - 1));
//        }
//    }
//}
