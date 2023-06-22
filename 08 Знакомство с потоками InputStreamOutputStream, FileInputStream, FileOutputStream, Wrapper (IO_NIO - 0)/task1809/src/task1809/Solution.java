package task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.


Requirements:
1. Программа должна два раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
3. Во второй файл нужно записать все байты из первого в обратном порядке.
4. Потоки FileInputStream и FileOutputStream должны быть закрыты.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        String file1 = reader.readLine();  // C:/Users/Admin/Desktop/task1809_1.txt
        String file2 = reader.readLine();  // C:/Users/Admin/Desktop/task1809_2.txt
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        ArrayList<Integer> spisok = new ArrayList<>();
        int n;
        while (fis.available() > 0) {
            n = fis.read();
            spisok.add(0, n);  //при добавлении числа двигаем остальные вправо, что обеспечивает обратный порядок
        }
        System.out.println(spisok);
        for (int i =0; i<spisok.size();i++){
            fos.write(spisok.get(i));
        }
        fis.close();
        fos.close();
//        FileInputStream fis1 = new FileInputStream(reader.readLine()); //  C:/Users/Admin/Desktop/task1809_1.txt
//        FileInputStream fis2 = new FileInputStream(reader.readLine()); //  C:/Users/Admin/Desktop/task1809_2.txt
//        List<Integer> file1 = new ArrayList<>();
//        List<Integer> file2 = new ArrayList<>();
//        while (fis1.available() > 0) {
//            file1.add(fis1.read());
//        }
//        System.out.println(file1);
//        while (fis2.available() > 0) {
//            file2.add(fis2.read());
//        }
//        System.out.println(file2);
//        List<Integer> file3 = new ArrayList<>();
//        for (int i = file1.size() - 1; i >= 0; i--) {
//            file3.add(file1.get(i));
//        }
//        System.out.println(file3);
//        FileOutputStream fos = new FileOutputStream("C:/Users/Admin/Desktop/task1809_2.txt"); //C:/Users/Admin/Desktop/task1809_2.txt"
//        for (int i = 0; i < file3.size(); i++) {
//            fos.write(file3.get(i));
//        }
//        System.out.println(file2);
    }
}
