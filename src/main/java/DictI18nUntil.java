import java.io.*;

public class DictI18nUntil {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\admin\\Desktop\\字典type.txt");
        FileReader fileReader1 = new FileReader("C:\\Users\\admin\\Desktop\\字典code.txt");
        FileReader fileReader2 = new FileReader("C:\\Users\\admin\\Desktop\\字典中文.txt");
        FileReader fileReader3 = new FileReader("C:\\Users\\admin\\Desktop\\字典英文.txt");

        FileWriter fileWriter = new FileWriter("C:\\Users\\admin\\Desktop\\new字典英文.txt");
        FileWriter fileWriter1 = new FileWriter("C:\\Users\\admin\\Desktop\\new字典中文.txt");

        BufferedReader input = new BufferedReader(fileReader);
        BufferedReader input1 = new BufferedReader(fileReader1);
        BufferedReader input2 = new BufferedReader(fileReader2);
        BufferedReader input3 = new BufferedReader(fileReader3);

        BufferedWriter output1 = new BufferedWriter(fileWriter1);
        BufferedWriter output2 = new BufferedWriter(fileWriter);

        String result = "";
        String result1 = "";
        String result2 = "";
        String result3 = "";

        while ((result = input.readLine()) != null && (result1 = input1.readLine()) != null
                && (result2 = input2.readLine()) != null && (result3 = input3.readLine()) != null) {
            output1.write(result + "." + result1 + "=" + result2);
            output1.newLine(); // 添加换行符
            output2.write(result + "." + result1 + "=" + result3);
            output2.newLine(); // 添加换行符
        }

        input.close();
        input1.close();
        input2.close();
        input3.close();
        output1.close();
        output2.close();
    }
}


