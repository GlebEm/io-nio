package task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.


Requirements:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться максимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader strReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(strReader.readLine()); //C:/Users/Admin/Desktop/text.txt
        int max = fileInputStream.read();
        while (fileInputStream.available() > 0) {
            int n = fileInputStream.read();
            if (n > max) {
                max = n;
            }
        }
        fileInputStream.close();
        System.out.println(max);  // В консоль должен выводиться максимальный байт, считанный из файла.
//        int i;
//        while ((i = fileInputStream.read()) != -1) {
//            System.out.print((char) i);
//        }
    }
}
