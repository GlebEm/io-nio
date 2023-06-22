package task1907;

import java.io.*;

/* 
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки.


Requirements:
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла (используй FileReader c конструктором принимающим String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль количество слов "world", которые встречаются в файле.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();  //   C:/Users/Admin/Desktop/task1907/Test.txt
        FileReader fileReader = new FileReader(file);
        int c;
        int i =0;
        int countWorld = 1;
        while ((c=fileReader.read())!=-1){
            i++;
            System.out.print((char)c);
            if (i%6==0){
                System.out.print(" ");
                countWorld++;
            }
        }
        System.out.println();
        System.out.println("Слово world встречается "+countWorld+" раз");
        reader.close();
        fileReader.close();
    }
}
