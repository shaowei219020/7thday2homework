import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Title4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\QF\\test\\m.txt");
        FileOutputStream fos=new FileOutputStream("m.txt");
        int len;
        byte[]bytes=new byte[1024];
        while ((len=fis.read(bytes))!=1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}
class FISRead {
    public static void main(String[] args) throws IOException{
        // 使用文件名称创建流对象
        FileInputStream fis = new FileInputStream("m.txt");
        // 定义变量，保存数据
        int b ;
        // 循环读取
        while ((b = fis.read())!=-1) {
            System.out.println((char)b);
        }
        // 关闭资源
        fis.close();
    }
}