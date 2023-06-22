package task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();  //   C:/Users/Admin/Desktop/task1907/Test.txt
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        int count = 0;
        String word = "world";
        while (fileReader.ready()){
            String line = fileReader.readLine();
            String[]words = line.toString().split("\\W"); // \\W - опустит все что между W и рассплитит по словам начинающимся с W
            for (String s: words) //пробегаемся по массивку разбитому на строки и ищем совпадения
                if(s.equals(word)) //совпадение найдено, счетчик +1
            count++;
        }
        fileReader.close();
        System.out.println(count);
    }
}