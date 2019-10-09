import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Title5 {
    public static void main(String[] args) throws IOException {
        // 使用File对象创建流对象
        File file = new File("Hello.txt");
        FileWriter fw = new FileWriter(file);

        // 使用文件名称创建流对象

    }
}class FWWrite {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileWriter fw = new FileWriter("Hello.txt");
        // 字符串
        String msg = "HelloJavaWorld你好世界";

        // 写出字符数组
        fw.write(msg); //你好中国

        // 写出从索引2开始，2个字节。索引2是'中'，两个字节，也就是'中国'。
        fw.write(msg,2,2);	// 中国

        // 关闭资源
        fw.close();
    }
}
