import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Title6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\QF\\test\\b.txt");
        FileOutputStream fos=new FileOutputStream("b.txt");

        int len;
        byte[]bytes=new byte[1024];
        while ((len=fis.read(bytes))!=1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();;
        }
    }


