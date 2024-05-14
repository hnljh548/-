import java.io.*;
import java.sql.SQLOutput;

/**
 * @author songwen
 * @since 2024/5/14
 */
public class MenuI18nUtil {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\admin\\Desktop\\菜单翻译.txt");
        FileReader fileReader1 = new FileReader("C:\\Users\\admin\\Desktop\\中文菜单.txt");

        FileWriter fileWriter = new FileWriter("C:\\Users\\admin\\Desktop\\new翻译菜单.txt");
        FileWriter fileWriter1 = new FileWriter("C:\\Users\\admin\\Desktop\\new中文菜单.txt");

        BufferedReader input = new BufferedReader(fileReader);
        BufferedReader input1 = new BufferedReader(fileReader1);


        BufferedWriter output = new BufferedWriter(fileWriter);
        BufferedWriter output1 = new BufferedWriter(fileWriter1);

        String result = "";     //存翻译后的key
        String result1 = "";    //存原中文
        String notModify = "";  //存翻译后的英文
        while ((result = input.readLine()) != null && (result1 = input1.readLine()) != null) {
            notModify = result;
            int index = 0;
            if (result.contains(" ")) {
                while ((index = result.indexOf(' ', index)) != -1) {
                    String upper = result.substring(index + 1, index + 2).toUpperCase();
                    String before = result.substring(0, index);
                    String after = result.substring(index + 2);
                    result = before + upper + after;
                    index++;
                }
                output.write(result + "=" + notModify);
                output1.write(result + "=" + result1);
                output.newLine();
                output1.newLine(); // 添加换行符
            } else {
                output.write(result + "=" + notModify);
                output1.write(result + "=" + result1);
                output.newLine();
                output1.newLine(); // 添加换行符
            }
        }
        input.close();
        input1.close();
        output.close();
        output1.close();
    }
}
