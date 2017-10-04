import java.io.File;
import java.io.FileFilter;

/**
 * Created by vikash on 4/10/17.
 */


// If you have requirement that you want to find all .java file or what whever you want to search any extention file
// in any particular folder or directry then you should go for that block of code. It is also new Version of Java8 main features.
public class FileFilterExample {
    public static void main(String[] args) {
        FileFilter fileFilter=(File file) -> file.getName().endsWith(".java");
        File file=new File("/home/vikash/Desktop/Java8/src");
        File[] files=file.listFiles(fileFilter);
        for (File f:files){
            System.out.println(f);
        }
    }
}
