package task1822;import java.io.*;/* ����� ������ ������ ������������ � ������� ��� �����.����� � ����� ����������, ������� ��������� � ��������� id, � ������� �� �� ����� � ����, � ������� ��� �������� � �����.��������� ����������� � ����� ����������: id (int).������� ������.� ����� ������ ��������� �������� � �������� � ��������� ������������������:id productName price quantity��� id - int.productName - �������� ������, ����� ��������� �������, String.price - ����, double.quantity - ����������, int.���������� �� ������� ������ �������� � ��������� ������.������ ����������� �����:194 ���� 12.6 25195 ����� ��������� 52.2 12196 ������ 22.9 19������ ������ ��� id = 195:195 ����� ��������� 52.2 12Requirements:1. ��������� ������ ������� ��� ����� � �������.2. ������ ��� ����� ����� ��� ������.3. ��������� ������ ����� � ����� � ������� ���������� � id, ������� ���������� ������ ����������.4. ����� ��� ������ �� ����� ������ ���� ������.*/public class Solution {    public static void main(String[] args) throws IOException,FileNotFoundException{        if(args.length==0){            throw new IllegalArgumentException();        }        System.out.println("������� ���� � �����");        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        File file = new File(reader.readLine());        // C:/Users/Admin/Desktop/task1822/spisok.txt        FileReader fileReader = new FileReader(file);        BufferedReader fileBufferReader = new BufferedReader(fileReader);        String result;        while ((result=fileBufferReader.readLine())!=null){            String[]words = result.split(" ");            if(words[0].equals(args[0])){                System.out.println(result);                break;            }        }        reader.close();        fileReader.close();        fileBufferReader.close();    }}