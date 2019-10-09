import java.io.File;
import java.util.List;
public class Title2 {
    public static void main(String[] args) {
        //比如输入D盘
        List<File>list=FileUtils.getAllFiles("E:");
        //输出所有的文件和文件夹的名字
        for (File file : list) {
            System.out.println(file);
        }

    }
}
