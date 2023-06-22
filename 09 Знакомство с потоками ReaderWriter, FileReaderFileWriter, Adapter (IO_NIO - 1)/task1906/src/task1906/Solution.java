package task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
Считать с консоли 2 имени файла.
Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).

Пример первого файла:
text in file
Вывод во втором файле:
eti ie
Закрыть потоки ввода-вывод


Requirements:
1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна записывать во второй файл все символы из первого файла с четным порядковым номером (используй FileWriter).
6. Поток записи в файл (FileWriter) должен быть закрыт.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Считываем путь к первому файлу с консоли");
        String file1 = reader.readLine(); //   C:/Users/Admin/Desktop/Task1906/file1.txt
        System.out.println("Считываем путь ко второму файлу");
        String file2 = reader.readLine(); //   C:/Users/Admin/Desktop/Task1906/file2.txt
//        reader.close();
        FileReader fileReader = new FileReader(file1);
       // fileReader.close();
        FileWriter fileWriter = new FileWriter(file2, false); //фолс чтобы обнулять файл перед записью новых данных
        int c;
        int i = 0;
        while ((c = fileReader.read()) != -1) {    //когда закончатся символы в первом файле вернется -1 на ридер
            i++;
            if (i % 2 == 0) {
                fileWriter.append((char) c); // //аппенд для посимвольной записи
            }
        }
        fileReader.close();
        fileWriter.close();
        reader.close();
    }
}
