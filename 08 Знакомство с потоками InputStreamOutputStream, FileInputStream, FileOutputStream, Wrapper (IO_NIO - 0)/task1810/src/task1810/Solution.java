package task1810;

import java.io.*;

/* 
DownloadException
1 ��������� � ������� ����� ������.
2 ���� ���� ������ 1000 ����, ��:
2.1 ������� ������ ������ � �������.
2.2 ��������� ���������� DownloadException.


Requirements:
1. ��������� ������ ������� ����� ������ � �������.
2. ��� ������ �� ������ ��������� ����� FileInputStream.
3. ��������� ������ ��������, ���� ��������� ���� �� �������� ������ 1000 ����.
4. ��������� ������ ����������� ����������� DownloadException.
5. ����� FileInputStream ������ ���� ������.*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {                                                 // C:/Users/Admin/Desktop/task1810/file1.txt  1-3
            String x = reader.readLine();
            FileInputStream fis = new FileInputStream(x);
            if (fis.available()< 1000){
                reader.close();
                fis.close();
                System.out.println("���� ������ 1000 ����");
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
