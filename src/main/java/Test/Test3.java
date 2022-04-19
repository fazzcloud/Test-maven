package Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * @Author: Fazzcloud
 * @Date: 2022/4/20 6:51
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/data.txt");
        FileWriter fileWriter = new FileWriter(file);
        Random random = new Random();
        for (int i = 1;i<=10000;i++){
            String format = String.format("%05d", i);
            fileWriter.write("fazz"+format+",ceshi"+format+","+random.nextInt(2)+",138000"+format+"\n");
        }
        fileWriter.close();
    }
}
